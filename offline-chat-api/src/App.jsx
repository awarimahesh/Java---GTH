import { useEffect, useState } from "react";
import "./App.css";
import { uploadImage } from "./utils/api";

function App() {
  // SAFE localStorage load
  const [messages, setMessages] = useState(() => {
    try {
      const saved = localStorage.getItem("chat_messages");
      if (!saved) return [];

      const parsed = JSON.parse(saved);
      if (!Array.isArray(parsed)) return [];

      return parsed;
    } catch (error) {
      console.error("LocalStorage crash fix:", error);
      localStorage.removeItem("chat_messages");
      return [];
    }
  });

  const [selectedFile, setSelectedFile] = useState(null);
  const [preview, setPreview] = useState("");
  const [uploading, setUploading] = useState(false);
  const [isOnline, setIsOnline] = useState(navigator.onLine);

  // SAFE localStorage save
  useEffect(() => {
    try {
      const safeMessages = messages.map((msg) => ({
        id: msg.id,
        type: msg.type,
        content: msg.content,
        status: msg.status,
        time: msg.time,
        url: msg.url || "",
      }));

      localStorage.setItem("chat_messages", JSON.stringify(safeMessages));
    } catch (error) {
      console.error("Storage save error:", error);
    }
  }, [messages]);

  // Internet online/offline detect
  useEffect(() => {
    const goOnline = () => {
      setIsOnline(true);
    };

    const goOffline = () => {
      setIsOnline(false);
    };

    window.addEventListener("online", goOnline);
    window.addEventListener("offline", goOffline);

    return () => {
      window.removeEventListener("online", goOnline);
      window.removeEventListener("offline", goOffline);
    };
  }, []);

  // net aate hi pending auto-send
  useEffect(() => {
    if (isOnline) {
      resendPendingMessages();
    }
  }, [isOnline]);

  // file select
  const handleFileChange = (e) => {
    const file = e.target.files?.[0];
    if (!file) return;

    setSelectedFile(file);
    setPreview(URL.createObjectURL(file));
  };

  // send button
  const handleSend = async () => {
    if (!selectedFile) {
      alert("Pehle image select karo");
      return;
    }

    const tempId = Date.now();
    const localPreview = preview;

    const newMessage = {
      id: tempId,
      type: "image",
      content: isOnline ? "Uploading image..." : "Pending ⏳",
      status: isOnline ? "sending" : "pending",
      time: new Date().toLocaleTimeString([], {
        hour: "2-digit",
        minute: "2-digit",
      }),
      url: localPreview,
    };

    setMessages((prev) => [...prev, newMessage]);

    const fileToUpload = selectedFile;

    setSelectedFile(null);
    setPreview("");

    if (isOnline) {
      await sendMessage(tempId, fileToUpload);
    } else {
      pendingFileMap[tempId] = fileToUpload;
    }
  };

  // actual upload
  const sendMessage = async (id, fileData) => {
    try {
      setUploading(true);

      const uploadedUrl = await uploadImage(fileData);

      setMessages((prev) =>
        prev.map((msg) =>
          msg.id === id
            ? {
                ...msg,
                content: "",
                status: "sent",
                url: uploadedUrl,
              }
            : msg
        )
      );

      delete pendingFileMap[id];
    } catch (error) {
      console.error("Upload failed:", error);

      setMessages((prev) =>
        prev.map((msg) =>
          msg.id === id
            ? {
                ...msg,
                content: "Pending ⏳",
                status: "pending",
              }
            : msg
        )
      );

      pendingFileMap[id] = fileData;
    } finally {
      setUploading(false);
    }
  };

  const resendPendingMessages = async () => {
    const pending = messages.filter((msg) => msg.status === "pending");

    for (const msg of pending) {
      const fileData = pendingFileMap[msg.id];
      if (fileData) {
        await sendMessage(msg.id, fileData);
      }
    }
  };

  const getStatusIcon = (status) => {
    if (status === "sent") return "✔✔";
    if (status === "sending") return "⏳";
    if (status === "pending") return "🕓";
    return "❌";
  };

  return (
    <div className="app">
      <div className="chat-container">
        {/* Header */}
        <div className="chat-header">
          <div className="avatar">M</div>
          <div className="chat-user-info">
            <h2>Mahesh</h2>
            <p>{isOnline ? "online" : "offline"}</p>
          </div>
        </div>

        {/* Chat Body */}
        <div className="chat-body">
          {messages.length === 0 ? (
            <div className="empty-chat">No messages yet</div>
          ) : (
            messages.map((msg) => (
              <div key={msg.id} className="image-message">
                {msg.url && (
                  <img src={msg.url} alt="Uploaded" className="chat-image" />
                )}

                {msg.content && <p>{msg.content}</p>}

                <span>
                  {msg.time} {getStatusIcon(msg.status)}
                </span>
              </div>
            ))
          )}
        </div>

        {/* Selected Preview */}
        {preview && (
          <div className="selected-preview">
            <img src={preview} alt="Preview" className="selected-preview-img" />
            <button
              className="remove-preview-btn"
              onClick={() => {
                setSelectedFile(null);
                setPreview("");
              }}
            >
              ✕
            </button>
          </div>
        )}

        {/* Footer */}
        <div className="chat-footer">
          <label className="upload-btn">
            +
            <input
              type="file"
              accept="image/*"
              onChange={handleFileChange}
              hidden
              disabled={uploading}
            />
          </label>

          <button className="emoji-btn">😀</button>

          <input type="text" placeholder="Type a message" disabled />

          <button className="send-btn" onClick={handleSend}>
            ➤
          </button>
        </div>
      </div>
    </div>
  );
}

const pendingFileMap = {};

export default App;