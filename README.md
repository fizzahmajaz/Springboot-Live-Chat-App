<p align="center">
  <img src="https://media.giphy.com/media/L8K62iTDkzGX6/giphy.gif" width="80" />
  <h1 align="center">💬 Springboot <span style="color:#00BFFF;">LiveChat</span> <span>▌▌▌</span></h1>
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

<p align="center">
  <img src="https://media.giphy.com/media/l0MYEqEzwMWFCg8rm/giphy.gif" width="80"/>
</p>

```bash
📦 livechat/
 ┣ 📂 src/main/java/com/fizzahmajaz/livechat
 ┃ ┣ ✨ LivechatApplication.java     → 🏁  Spring Boot entry point
 ┃ ┣ ⚙️  WebSocketConfig.java         → 🔌  WebSocket configuration
 ┃ ┣ 💌 ChatMessage.java              → 🗃️  Model class (message data)
 ┃ ┣ 🔄 ChatMessageHandler.java       → 📡  Handles sending/receiving
 ┃ ┣ 💻 Client.java                   → 🖥️  Console-based WebSocket client
 ┃ ┗ 🎨 ConsoleColors.java            → 🌈  ANSI color helper for terminal
 ┗ 🧾 pom.xml                         → 📦  Maven dependencies

```
---
## 🧠 How It Works  

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExcjQzZm9pOHh5aWZxZ3ZscWVvMTNhZmtneWp1eWtrYjR1Nmw1bGhycSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/xT8qBsOjMOcdeGJIU8/giphy.gif" width="90"/>
</p>

### 🌀 **Server Flow**
```bash
1️⃣  Spring Boot launches a WebSocket endpoint  
     ↳ ws://localhost:8080/chat  

2️⃣  Clients connect via WebSocket protocol  
     ↳ Each connection opens a live session  

3️⃣  Messages broadcast in real-time ✉️  
     ↳ Every connected user sees new messages instantly  

4️⃣  When a user disconnects ❌  
     ↳ Session is removed and event is logged

```
### 🌀 **Client Flow**
```bash
1️⃣  Run → Client.java ☕  
     ↳ Starts a lightweight WebSocket client  

2️⃣  Enter your name 🧑‍💻  
     ↳ Creates a personal identity for your session  

3️⃣  Type your message 💬  
     ↳ Sent instantly to all other connected clients  

4️⃣  Watch color-coded magic 🌈  
     🟢 Your message → Green  
     🔴 Others’ message → Red  
     💛 System notice → Yellow
``` 

---

## 🎨 Console Preview

---

## ⚙️ Setup Instructions
```bash
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
```
---


## 🧡 Author
Developed by **Fizzah M Ajaz** 🦋  
💻 *Software Engineer*  
📖 Let's Connect ✨
