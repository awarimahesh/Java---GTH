import 'dart:convert';

class MessageModel {
  final int id;
  final String type;
  final String? text;
  final String? image;
  final String status;
  final String time;
  final String? url;

  MessageModel({
    required this.id,
    required this.type,
    this.text,
    this.image,
    required this.status,
    required this.time,
    this.url,
  });

  Map<String, dynamic> toJson() => {
        "id": id,
        "type": type,
        "text": text,
        "image": image,
        "status": status,
        "time": time,
        "url": url,
      };

  factory MessageModel.fromJson(Map<String, dynamic> json) {
    return MessageModel(
      id: json["id"],
      type: json["type"],
      text: json["text"],
      image: json["image"],
      status: json["status"],
      time: json["time"],
      url: json["url"],
    );
  }

  static String encode(List<MessageModel> messages) =>
      jsonEncode(messages.map((e) => e.toJson()).toList());

  static List<MessageModel> decode(String messages) =>
      (jsonDecode(messages) as List<dynamic>)
          .map((e) => MessageModel.fromJson(e))
          .toList();
}