# 💬 LiveChat — Console-Based WebSocket Chat (Spring Boot + Java)

> 🪄 A real-time, **console-based chat application** powered by **Spring Boot WebSockets**.  
> No frontend. No browser. Just clean terminal-to-terminal conversation ⚡

---

<p align="center">
  <img src="https://media.giphy.com/media/L8K62iTDkzGX6/giphy.gif" width="80" />
  <h1 align="center">💬 In Leader <span style="color:#00BFFF;">LiveChat</span> <span>▌▌▌</span></h1>
  <p align="center"><i>Real-time console-based chat — no UI, just magic ⚡</i></p>
</p>

---

<p align="center">
  <img src="https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/SpringBoot-%236DB33F.svg?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/WebSockets-%23006AFF.svg?style=for-the-badge&logo=websocket&logoColor=white" />
  <img src="https://img.shields.io/badge/ChatApp-%23FF69B4.svg?style=for-the-badge&logo=wechat&logoColor=white" />
</p>

---

## ✨ Features
- ⚡ Real-time chatting between multiple users  
- 💬 Multi-user support (run multiple terminals)  
- 💻 Cross-platform — works on any OS terminal  
- 🧠 Lightweight WebSocket client (Java)  
- 🚀 Built with Spring Boot for fast, stable connections  

---

## 🧩 Project Structure
livechat/
 ┣ 📂 src/main/java/com/fizzahmajaz/livechat <br>
 ┃ ┣ 📜 LivechatApplication.java        # Spring Boot entry point <br>
 ┃ ┣ 📜 WebSocketConfig.java            # WebSocket configuration <br>
 ┃ ┣ 📜 ChatMessage.java                # Model class (message data) <br>
 ┃ ┣ 📜 ChatMessageHandler.java         # Handles sending/receiving <br>
 ┃ ┣ 📜 Client.java                     # Console-based WebSocket client <br>
 ┃ ┗ 📜 ConsoleColors.java              # ANSI color helper for terminal <br>
 ┗ 📜 pom.xml                           # Maven dependencies

---

## 🧠 How It Works

### 🌀 Server Flow
1. Spring Boot starts a WebSocket endpoint at `ws://localhost:8080/chat`.  
2. Clients connect using the WebSocket protocol.  
3. Messages are broadcasted to all connected users.  
4. When a client disconnects, the server removes that session and logs it.

### 📡 Client Flow
1. Run the `Client.java` file.  
2. Enter your name when prompted.  
3. Type and send messages — they appear instantly across all connected clients.  
4. Each message is color-coded based on the sender type.  

---

## 🎨 Console Preview

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Project
git clone https://github.com/yourusername/livechat.git  
cd livechat

### 2️⃣ Build & Run the Server
mvn spring-boot:run  

✅ You’ll see:
Tomcat started on port 8080 (http)  
Started LivechatApplication...

### 3️⃣ Run the Clients (in different terminals)
java -cp target/classes com.fizzahmajaz.livechat.Client

---


## 🧡 Author
Developed by **Fizzah Muhammed Ajaz** 🦋  
💻 *Adduha Designs and Development*  
📖 Inspired by simplicity, built for connection ✨
