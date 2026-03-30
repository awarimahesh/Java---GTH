export const uploadImage = async (file) => {
  try {
    if (!file) throw new Error("No file selected");

    const formData = new FormData();
    formData.append("file", file);

    // ⚠️ Yaha apna EXACT Cloudinary preset naam daalo
    formData.append("upload_preset", "my_upload");

    const response = await fetch(
      "https://api.cloudinary.com/v1_1/dwjlqlcoe/image/upload",
      {
        method: "POST",
        body: formData,
      }
    );

    const data = await response.json();
    console.log("Cloudinary Response:", data);

    if (!response.ok || !data.secure_url) {
      throw new Error(data?.error?.message || "Image upload failed");
    }

    return data.secure_url;
  } catch (error) {
    console.error("Upload Image Error:", error);
    throw error;
  }
};