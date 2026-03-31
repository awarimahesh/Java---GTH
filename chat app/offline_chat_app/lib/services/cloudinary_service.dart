import 'dart:convert';
import 'package:http/http.dart' as http;

class CloudinaryService {
  static Future<String> uploadImage(String base64Image) async {
    final uri = Uri.parse(
      "https://api.cloudinary.com/v1_1/dwjlqlcoe/image/upload",
    );

    final request = http.MultipartRequest("POST", uri)
      ..fields["file"] = base64Image
      ..fields["upload_preset"] = "my_uplod";

    final response = await request.send();
    final responseBody = await response.stream.bytesToString();
    final data = jsonDecode(responseBody);

    if (data["secure_url"] == null) {
      throw Exception("Upload failed");
    }

    return data["secure_url"];
  }
}