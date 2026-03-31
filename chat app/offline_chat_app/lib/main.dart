import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:image_picker/image_picker.dart';
import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';
import 'package:connectivity_plus/connectivity_plus.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Mahesh Awari',
      theme: ThemeData(
        useMaterial3: true,
        scaffoldBackgroundColor: const Color(0xFFE5DDD5),
      ),
      home: const ChatScreen(),
    );
  }
}

class MessageModel {
  final String id;
  final String text;
  final String? imagePath;
  final String status; // pending / sent
  final String time;
  final bool isMine;

  MessageModel({
    required this.id,
    required this.text,
    this.imagePath,
    required this.status,
    required this.time,
    required this.isMine,
  });

  MessageModel copyWith({
    String? id,
    String? text,
    String? imagePath,
    String? status,
    String? time,
    bool? isMine,
  }) {
    return MessageModel(
      id: id ?? this.id,
      text: text ?? this.text,
      imagePath: imagePath ?? this.imagePath,
      status: status ?? this.status,
      time: time ?? this.time,
      isMine: isMine ?? this.isMine,
    );
  }

  Map<String, dynamic> toJson() => {
        'id': id,
        'text': text,
        'imagePath': imagePath,
        'status': status,
        'time': time,
        'isMine': isMine,
      };

  factory MessageModel.fromJson(Map<String, dynamic> json) {
    return MessageModel(
      id: json['id'],
      text: json['text'] ?? '',
      imagePath: json['imagePath'],
      status: json['status'],
      time: json['time'],
      isMine: json['isMine'],
    );
  }
}

class ChatScreen extends StatefulWidget {
  const ChatScreen({super.key});

  @override
  State<ChatScreen> createState() => _ChatScreenState();
}

class _ChatScreenState extends State<ChatScreen> {
  final TextEditingController _controller = TextEditingController();
  final ScrollController _scrollController = ScrollController();
  final ImagePicker _picker = ImagePicker();

  List<MessageModel> messages = [];
  StreamSubscription<List<ConnectivityResult>>? connectivitySubscription;

  bool isOnline = true;
  bool isSendingQueue = false;
  bool showSendButton = false;

  @override
  void initState() {
    super.initState();
    loadMessages();
    checkInitialInternet();
    startConnectivityListener();

    _controller.addListener(() {
      final hasText = _controller.text.trim().isNotEmpty;
      if (hasText != showSendButton) {
        setState(() {
          showSendButton = hasText;
        });
      }
    });
  }

  @override
  void dispose() {
    connectivitySubscription?.cancel();
    _controller.dispose();
    _scrollController.dispose();
    super.dispose();
  }

  Future<void> checkInitialInternet() async {
    final hasInternet = await checkInternet();
    if (mounted) {
      setState(() {
        isOnline = hasInternet;
      });
    }

    if (hasInternet) {
      await trySendPendingMessages();
    }
  }

  void startConnectivityListener() {
    connectivitySubscription =
        Connectivity().onConnectivityChanged.listen((results) async {
      final hasInternet = await checkInternet();

      if (mounted) {
        setState(() {
          isOnline = hasInternet;
        });
      }

      if (hasInternet) {
        await trySendPendingMessages();
      }
    });
  }

  Future<bool> checkInternet() async {
    try {
      final result = await InternetAddress.lookup('google.com');
      return result.isNotEmpty && result[0].rawAddress.isNotEmpty;
    } catch (_) {
      return false;
    }
  }

  String getCurrentTime() {
    final now = DateTime.now();
    final hour = now.hour > 12 ? now.hour - 12 : (now.hour == 0 ? 12 : now.hour);
    final minute = now.minute.toString().padLeft(2, '0');
    final period = now.hour >= 12 ? 'PM' : 'AM';
    return '$hour:$minute $period';
  }

  Future<void> sendMessage() async {
    final text = _controller.text.trim();
    if (text.isEmpty) return;

    final hasInternet = await checkInternet();

    final msg = MessageModel(
      id: DateTime.now().millisecondsSinceEpoch.toString(),
      text: text,
      status: hasInternet ? 'sent' : 'pending',
      time: getCurrentTime(),
      isMine: true,
    );

    setState(() {
      messages.add(msg);
      _controller.clear();
    });

    await saveMessages();
    scrollToBottom();

    if (hasInternet) {
      await trySendPendingMessages();
    }
  }

  Future<void> pickImage(ImageSource source) async {
    try {
      final XFile? image = await _picker.pickImage(
        source: source,
        imageQuality: 75,
        maxWidth: 1600,
      );

      if (image == null) return;

      final result = await Navigator.push(
        context,
        MaterialPageRoute(
          builder: (context) => ImagePreviewScreen(imagePath: image.path),
        ),
      );

      if (result == null) return;

      final caption = result["caption"] ?? "";
      final hasInternet = await checkInternet();

      final msg = MessageModel(
        id: DateTime.now().millisecondsSinceEpoch.toString(),
        text: caption,
        imagePath: image.path,
        status: hasInternet ? 'sent' : 'pending',
        time: getCurrentTime(),
        isMine: true,
      );

      setState(() {
        messages.add(msg);
      });

      await saveMessages();
      scrollToBottom();

      if (hasInternet) {
        await trySendPendingMessages();
      }
    } catch (e) {
      debugPrint('Image pick error: $e');
    }
  }

  void showAttachmentOptions() {
    showModalBottomSheet(
      context: context,
      backgroundColor: Colors.white,
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(24)),
      ),
      builder: (context) {
        return SafeArea(
          child: Padding(
            padding: const EdgeInsets.fromLTRB(20, 18, 20, 24),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: [
                _attachItem(
                  icon: Icons.photo,
                  label: 'Gallery',
                  color: Colors.purple,
                  onTap: () async {
                    Navigator.pop(context);
                    await pickImage(ImageSource.gallery);
                  },
                ),
                _attachItem(
                  icon: Icons.camera_alt,
                  label: 'Camera',
                  color: Colors.pink,
                  onTap: () async {
                    Navigator.pop(context);
                    await pickImage(ImageSource.camera);
                  },
                ),
              ],
            ),
          ),
        );
      },
    );
  }

  Widget _attachItem({
    required IconData icon,
    required String label,
    required Color color,
    required VoidCallback onTap,
  }) {
    return InkWell(
      onTap: onTap,
      borderRadius: BorderRadius.circular(16),
      child: Padding(
        padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            CircleAvatar(
              radius: 28,
              backgroundColor: color,
              child: Icon(icon, color: Colors.white),
            ),
            const SizedBox(height: 8),
            Text(label),
          ],
        ),
      ),
    );
  }

  Future<bool> fakeApiSend(MessageModel msg) async {
    await Future.delayed(const Duration(seconds: 2));
    return true;
  }

  Future<void> trySendPendingMessages() async {
    if (isSendingQueue) return;
    isSendingQueue = true;

    try {
      for (int i = 0; i < messages.length; i++) {
        final msg = messages[i];

        if (msg.status == 'pending' && msg.isMine) {
          final success = await fakeApiSend(msg);

          if (success) {
            messages[i] = msg.copyWith(status: 'sent');
            await saveMessages();

            if (mounted) {
              setState(() {});
            }
          }
        }
      }
    } finally {
      isSendingQueue = false;
    }
  }

  Future<void> saveMessages() async {
    final prefs = await SharedPreferences.getInstance();
    final data = messages.map((e) => jsonEncode(e.toJson())).toList();
    await prefs.setStringList('chat_messages', data);
  }

  Future<void> loadMessages() async {
    final prefs = await SharedPreferences.getInstance();
    final data = prefs.getStringList('chat_messages') ?? [];

    messages = data
        .map((e) => MessageModel.fromJson(jsonDecode(e)))
        .toList();

    if (mounted) {
      setState(() {});
    }

    WidgetsBinding.instance.addPostFrameCallback((_) {
      scrollToBottom();
    });
  }

  void scrollToBottom() {
    WidgetsBinding.instance.addPostFrameCallback((_) {
      if (_scrollController.hasClients) {
        _scrollController.animateTo(
          _scrollController.position.maxScrollExtent + 100,
          duration: const Duration(milliseconds: 300),
          curve: Curves.easeOut,
        );
      }
    });
  }

  Widget buildMessageBubble(MessageModel message) {
    final isMine = message.isMine;
    final hasImage = message.imagePath != null && message.imagePath!.isNotEmpty;

    IconData statusIcon;
    Color statusColor;

    if (message.status == 'pending') {
      statusIcon = Icons.access_time;
      statusColor = Colors.grey;
    } else {
      statusIcon = Icons.done_all;
      statusColor = Colors.blue;
    }

    return Align(
      alignment: isMine ? Alignment.centerRight : Alignment.centerLeft,
      child: Container(
        margin: const EdgeInsets.symmetric(horizontal: 10, vertical: 4),
        padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 8),
        constraints: BoxConstraints(
          maxWidth: MediaQuery.of(context).size.width * 0.75,
        ),
        decoration: BoxDecoration(
          color: isMine ? const Color(0xFFDCF8C6) : Colors.white,
          borderRadius: BorderRadius.circular(12),
        ),
        child: Column(
          crossAxisAlignment:
              isMine ? CrossAxisAlignment.end : CrossAxisAlignment.start,
          children: [
            if (hasImage)
              ClipRRect(
                borderRadius: BorderRadius.circular(10),
                child: Image.file(
                  File(message.imagePath!),
                  width: 220,
                  fit: BoxFit.cover,
                  errorBuilder: (context, error, stackTrace) {
                    return Container(
                      width: 220,
                      height: 180,
                      color: Colors.black12,
                      alignment: Alignment.center,
                      child: const Text('Image not found'),
                    );
                  },
                ),
              ),
            if (hasImage && message.text.isNotEmpty) const SizedBox(height: 8),
            if (message.text.isNotEmpty)
              Text(
                message.text,
                style: const TextStyle(fontSize: 16, color: Colors.black87),
              ),
            const SizedBox(height: 4),
            Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                Text(
                  message.time,
                  style: TextStyle(
                    fontSize: 11,
                    color: Colors.grey.shade700,
                  ),
                ),
                if (isMine) ...[
                  const SizedBox(width: 5),
                  Icon(
                    statusIcon,
                    size: 16,
                    color: statusColor,
                  ),
                ],
              ],
            ),
          ],
        ),
      ),
    );
  }

  Widget buildInputArea() {
    return Container(
      padding: const EdgeInsets.fromLTRB(8, 6, 8, 8),
      color: const Color(0xFFF0F2F5),
      child: Row(
        crossAxisAlignment: CrossAxisAlignment.end,
        children: [
          Expanded(
            child: Container(
              padding: const EdgeInsets.symmetric(horizontal: 6),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(28),
              ),
              child: Row(
                children: [
                  IconButton(
                    onPressed: showAttachmentOptions,
                    icon: const Icon(Icons.add, color: Colors.grey),
                  ),
                  const Icon(Icons.emoji_emotions_outlined, color: Colors.grey),
                  const SizedBox(width: 8),
                  Expanded(
                    child: TextField(
                      controller: _controller,
                      minLines: 1,
                      maxLines: 5,
                      decoration: const InputDecoration(
                        hintText: 'Type a message',
                        border: InputBorder.none,
                      ),
                    ),
                  ),
                  const SizedBox(width: 6),
                  GestureDetector(
                    onTap: () => pickImage(ImageSource.camera),
                    child: const Icon(Icons.camera_alt_outlined, color: Colors.grey),
                  ),
                  const SizedBox(width: 10),
                ],
              ),
            ),
          ),
          const SizedBox(width: 8),
          CircleAvatar(
            radius: 24,
            backgroundColor: const Color(0xFF00A884),
            child: IconButton(
              onPressed: showSendButton ? sendMessage : () {},
              icon: Icon(
                showSendButton ? Icons.send : Icons.mic,
                color: Colors.white,
              ),
            ),
          ),
        ],
      ),
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: const Color(0xFF075E54),
        elevation: 0,
        titleSpacing: 0,
        title: Row(
          children: [
            const CircleAvatar(
              radius: 20,
              backgroundColor: Colors.white24,
              child: Icon(Icons.person, color: Colors.white),
            ),
            const SizedBox(width: 10),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text(
                  'Mahesh Awari',
                  style: TextStyle(
                    color: Colors.white,
                    fontSize: 18,
                    fontWeight: FontWeight.w600,
                  ),
                ),
                Text(
                  isOnline ? 'online' : 'offline',
                  style: const TextStyle(
                    color: Colors.white70,
                    fontSize: 12,
                  ),
                ),
              ],
            ),
          ],
        ),
        actions: const [
          Icon(Icons.videocam_outlined, color: Colors.white),
          SizedBox(width: 16),
          Icon(Icons.call_outlined, color: Colors.white),
          SizedBox(width: 16),
          Icon(Icons.more_vert, color: Colors.white),
          SizedBox(width: 8),
        ],
      ),
      body: Column(
        children: [
          Expanded(
            child: messages.isEmpty
                ? const SizedBox()
                : ListView.builder(
                    controller: _scrollController,
                    padding: const EdgeInsets.only(top: 8, bottom: 8),
                    itemCount: messages.length,
                    itemBuilder: (context, index) {
                      return buildMessageBubble(messages[index]);
                    },
                  ),
          ),
          buildInputArea(),
        ],
      ),
    );
  }
}

class ImagePreviewScreen extends StatefulWidget {
  final String imagePath;

  const ImagePreviewScreen({super.key, required this.imagePath});

  @override
  State<ImagePreviewScreen> createState() => _ImagePreviewScreenState();
}

class _ImagePreviewScreenState extends State<ImagePreviewScreen> {
  final TextEditingController _captionController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.black,
      appBar: AppBar(
        backgroundColor: Colors.black,
        iconTheme: const IconThemeData(color: Colors.white),
      ),
      body: Stack(
        children: [
          Center(
            child: Image.file(File(widget.imagePath)),
          ),
          Positioned(
            bottom: 20,
            left: 10,
            right: 10,
            child: Row(
              children: [
                Expanded(
                  child: Container(
                    padding: const EdgeInsets.symmetric(horizontal: 16),
                    decoration: BoxDecoration(
                      color: Colors.white,
                      borderRadius: BorderRadius.circular(25),
                    ),
                    child: TextField(
                      controller: _captionController,
                      style: const TextStyle(color: Colors.black),
                      decoration: const InputDecoration(
                        hintText: "Add a caption...",
                        border: InputBorder.none,
                      ),
                    ),
                  ),
                ),
                const SizedBox(width: 10),
                CircleAvatar(
                  radius: 25,
                  backgroundColor: const Color(0xFF00A884),
                  child: IconButton(
                    icon: const Icon(Icons.send, color: Colors.white),
                    onPressed: () {
                      Navigator.pop(context, {
                        "caption": _captionController.text,
                      });
                    },
                  ),
                )
              ],
            ),
          )
        ],
      ),
    );
  }
}