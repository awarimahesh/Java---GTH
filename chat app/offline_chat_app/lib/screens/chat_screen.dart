import 'dart:async';
import 'dart:convert';
import 'dart:io';

import 'package:connectivity_plus/connectivity_plus.dart';
import 'package:flutter/material.dart';
import 'package:image_picker/image_picker.dart';

import '../models/message_model.dart';
import '../services/cloudinary_service.dart';
import '../services/local_storage_service.dart';

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
  File? selectedImage;
  String? previewBase64;
  bool isOnline = true;
  bool showMenu = false;

  StreamSubscription<List<ConnectivityResult>>? _connectivitySub;

  @override
  void initState() {
    super.initState();
    loadMessages();
    checkInternet();
    listenInternet();
  }

  @override
  void dispose() {
    _controller.dispose();
    _scrollController.dispose();
    _connectivitySub?.cancel();
    super.dispose();
  }

  Future<void> loadMessages() async {
    final saved = await LocalStorageService.loadMessages();
    setState(() {
      messages = saved;
    });
    scrollToBottom();
  }

  Future<void> saveMessages() async {
    await LocalStorageService.saveMessages(messages);
  }

  Future<void> checkInternet() async {
    final result = await Connectivity().checkConnectivity();
    setState(() {
      isOnline = !result.contains(ConnectivityResult.none);
    });

    if (isOnline) {
      retryPending();
    }
  }

  void listenInternet() {
    _connectivitySub = Connectivity().onConnectivityChanged.listen((results) {
      final onlineNow = !results.contains(ConnectivityResult.none);

      setState(() {
        isOnline = onlineNow;
      });

      if (onlineNow) {
        retryPending();
      }
    });
  }

  String getTime() {
    final now = TimeOfDay.now();
    final hour = now.hourOfPeriod == 0 ? 12 : now.hourOfPeriod;
    final minute = now.minute.toString().padLeft(2, '0');
    final period = now.period == DayPeriod.am ? "AM" : "PM";
    return "$hour:$minute $period";
  }

  void scrollToBottom() {
    Future.delayed(const Duration(milliseconds: 300), () {
      if (_scrollController.hasClients) {
        _scrollController.jumpTo(_scrollController.position.maxScrollExtent);
      }
    });
  }

  Future<void> pickFromGallery() async {
    final XFile? image = await _picker.pickImage(source: ImageSource.gallery);
    if (image == null) return;

    final bytes = await image.readAsBytes();
    final base64Image = "data:image/png;base64,${base64Encode(bytes)}";

    setState(() {
      selectedImage = File(image.path);
      previewBase64 = base64Image;
      showMenu = false;
    });
  }

  Future<void> pickFromCamera() async {
    final XFile? image = await _picker.pickImage(source: ImageSource.camera);
    if (image == null) return;

    final bytes = await image.readAsBytes();
    final base64Image = "data:image/png;base64,${base64Encode(bytes)}";

    setState(() {
      selectedImage = File(image.path);
      previewBase64 = base64Image;
      showMenu = false;
    });
  }

  Future<void> handleSend() async {
    final cleanText = _controller.text.trim();

    if (cleanText.isEmpty && previewBase64 == null) return;

    if (cleanText.isNotEmpty) {
      final textMsg = MessageModel(
        id: DateTime.now().millisecondsSinceEpoch,
        type: "text",
        text: cleanText,
        status: isOnline ? "sent" : "pending",
        time: getTime(),
      );

      setState(() {
        messages.add(textMsg);
        _controller.clear();
      });

      await saveMessages();
    }

    if (previewBase64 != null) {
      final imgMsg = MessageModel(
        id: DateTime.now().millisecondsSinceEpoch + 1,
        type: "image",
        image: previewBase64,
        status: isOnline ? "sending" : "pending",
        url: "",
        time: getTime(),
      );

      setState(() {
        messages.add(imgMsg);
      });

      await saveMessages();

      if (isOnline) {
        sendToAPI(imgMsg.id, previewBase64!);
      }

      setState(() {
        selectedImage = null;
        previewBase64 = null;
      });
    }

    scrollToBottom();
  }

  Future<void> sendToAPI(int id, String image) async {
    try {
      updateStatus(id, "sending");

      final url = await CloudinaryService.uploadImage(image);

      setState(() {
        messages = messages.map((m) {
          if (m.id == id) {
            return MessageModel(
              id: m.id,
              type: m.type,
              text: m.text,
              image: m.image,
              status: "sent",
              time: m.time,
              url: url,
            );
          }
          return m;
        }).toList();
      });

      await saveMessages();
    } catch (e) {
      updateStatus(id, "pending");
    }
  }

  Future<void> updateStatus(int id, String status) async {
    setState(() {
      messages = messages.map((m) {
        if (m.id == id) {
          return MessageModel(
            id: m.id,
            type: m.type,
            text: m.text,
            image: m.image,
            status: status,
            time: m.time,
            url: m.url,
          );
        }
        return m;
      }).toList();
    });

    await saveMessages();
  }

  Future<void> retryPending() async {
    for (final m in messages) {
      if (m.type == "image" && m.status == "pending" && m.image != null) {
        sendToAPI(m.id, m.image!);
      }

      if (m.type == "text" && m.status == "pending") {
        updateStatus(m.id, "sent");
      }
    }
  }

  Widget buildStatus(String status) {
    if (status == "pending") {
      return const Text("⏳", style: TextStyle(fontSize: 12));
    } else if (status == "sending") {
      return const Text("📤", style: TextStyle(fontSize: 12));
    } else {
      return const Text("✔✔", style: TextStyle(fontSize: 12));
    }
  }

  Widget buildMessage(MessageModel m) {
    return Align(
      alignment: Alignment.centerRight,
      child: Container(
        margin: const EdgeInsets.symmetric(vertical: 5, horizontal: 10),
        padding: const EdgeInsets.all(10),
        constraints: const BoxConstraints(maxWidth: 280),
        decoration: BoxDecoration(
          color: const Color(0xFFD9FDD3),
          borderRadius: BorderRadius.circular(14),
        ),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.end,
          children: [
            if (m.type == "text")
              Align(
                alignment: Alignment.centerLeft,
                child: Text(
                  m.text ?? "",
                  style: const TextStyle(fontSize: 16),
                ),
              ),

            if (m.type == "image" && m.image != null) ...[
              ClipRRect(
                borderRadius: BorderRadius.circular(10),
                child: Image.memory(
                  base64Decode(m.image!.split(',').last),
                  height: 180,
                  width: 220,
                  fit: BoxFit.cover,
                ),
              ),
              const SizedBox(height: 8),
              if ((m.url ?? "").isNotEmpty)
                SelectableText(
                  m.url!,
                  style: const TextStyle(
                    color: Colors.blue,
                    fontSize: 12,
                    decoration: TextDecoration.underline,
                  ),
                ),
            ],

            const SizedBox(height: 6),
            Row(
              mainAxisSize: MainAxisSize.min,
              children: [
                Text(
                  m.time,
                  style: const TextStyle(fontSize: 11, color: Colors.black54),
                ),
                const SizedBox(width: 5),
                buildStatus(m.status),
              ],
            )
          ],
        ),
      ),
    );
  }

  Widget menuItem(String title, {VoidCallback? onTap}) {
    return ListTile(
      dense: true,
      title: Text(title),
      onTap: onTap ?? () {},
    );
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: const Color(0xFFECE5DD),
      appBar: AppBar(
        backgroundColor: const Color(0xFF075E54),
        foregroundColor: Colors.white,
        titleSpacing: 0,
        title: Row(
          children: [
            const CircleAvatar(
              backgroundColor: Colors.white24,
              child: Text("M", style: TextStyle(color: Colors.white)),
            ),
            const SizedBox(width: 10),
            Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                const Text("Mahesh", style: TextStyle(fontSize: 18)),
                Text(
                  isOnline ? "online" : "offline",
                  style: TextStyle(
                    fontSize: 12,
                    color: isOnline ? Colors.greenAccent : Colors.redAccent,
                  ),
                ),
              ],
            ),
          ],
        ),
      ),
      body: Column(
        children: [
          Expanded(
            child: messages.isEmpty
                ? const Center(child: Text("No messages yet"))
                : ListView.builder(
                    controller: _scrollController,
                    itemCount: messages.length,
                    itemBuilder: (context, index) {
                      return buildMessage(messages[index]);
                    },
                  ),
          ),

          if (previewBase64 != null)
            Container(
              margin: const EdgeInsets.all(10),
              padding: const EdgeInsets.all(8),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(12),
              ),
              child: Column(
                children: [
                  const Text("Preview"),
                  const SizedBox(height: 8),
                  ClipRRect(
                    borderRadius: BorderRadius.circular(10),
                    child: Image.memory(
                      base64Decode(previewBase64!.split(',').last),
                      height: 150,
                    ),
                  ),
                ],
              ),
            ),

          if (showMenu)
            Container(
              margin: const EdgeInsets.symmetric(horizontal: 12, vertical: 6),
              padding: const EdgeInsets.all(10),
              decoration: BoxDecoration(
                color: Colors.white,
                borderRadius: BorderRadius.circular(14),
              ),
              child: Column(
                children: [
                  menuItem("📄 Document"),
                  menuItem("🖼️ Photos & Videos", onTap: pickFromGallery),
                  menuItem("📷 Camera", onTap: pickFromCamera),
                  menuItem("🎧 Audio"),
                  menuItem("👤 Contact"),
                  menuItem("📊 Poll"),
                  menuItem("📅 Event"),
                  menuItem("➕ New Sticker"),
                ],
              ),
            ),

          SafeArea(
            child: Container(
              padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 8),
              color: const Color(0xFFF0F2F5),
              child: Row(
                children: [
                  IconButton(
                    onPressed: () {
                      setState(() {
                        showMenu = !showMenu;
                      });
                    },
                    icon: const Icon(Icons.add_circle, color: Colors.teal),
                  ),
                  const Text("🙂", style: TextStyle(fontSize: 24)),
                  const SizedBox(width: 8),
                  Expanded(
                    child: TextField(
                      controller: _controller,
                      decoration: InputDecoration(
                        hintText: "Type a message",
                        filled: true,
                        fillColor: Colors.white,
                        contentPadding: const EdgeInsets.symmetric(
                          horizontal: 16,
                          vertical: 12,
                        ),
                        border: OutlineInputBorder(
                          borderRadius: BorderRadius.circular(30),
                          borderSide: BorderSide.none,
                        ),
                      ),
                      onSubmitted: (_) => handleSend(),
                    ),
                  ),
                  const SizedBox(width: 8),
                  CircleAvatar(
                    backgroundColor: Colors.teal,
                    child: IconButton(
                      onPressed: handleSend,
                      icon: const Icon(Icons.send, color: Colors.white),
                    ),
                  )
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }
}