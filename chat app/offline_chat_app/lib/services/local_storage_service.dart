import 'package:shared_preferences/shared_preferences.dart';
import '../models/message_model.dart';

class LocalStorageService {
  static const String key = "messages";

  static Future<void> saveMessages(List<MessageModel> messages) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString(key, MessageModel.encode(messages));
  }

  static Future<List<MessageModel>> loadMessages() async {
    final prefs = await SharedPreferences.getInstance();
    final data = prefs.getString(key);
    if (data == null) return [];
    return MessageModel.decode(data);
  }
}