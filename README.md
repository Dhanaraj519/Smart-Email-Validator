# Smart-Email-Validator


### *AI-Powered Email Reply Generator (Spring Boot + React + Chrome Extension)*

<p align="center">
  <img src="https://img.shields.io/badge/React-Frontend-blue" />
  <img src="https://img.shields.io/badge/Spring%20Boot-Backend-brightgreen" />
  <img src="https://img.shields.io/badge/Chrome%20Extension-Gmail%20Integration-yellow" />
  <img src="https://img.shields.io/badge/AI-Gemini%20API-red" />
</p>

---

## 🚀 Overview

**Smart Email Assistant** is a full-stack AI-powered email reply generator that helps users instantly create professional, friendly, or tone-based email replies.

It works in **three ways**:

* 🌐 **React Web App** – generate replies manually
* 🔧 **Spring Boot API** – processes input & communicates with Gemini
* 🧩 **Chrome Extension for Gmail** – adds an “AI Reply” button inside Gmail

This makes email writing **fast, effortless, and professional**.

---

## 🎯 Purpose

Email replies take time. Many users struggle with:

* Writing professional responses
* Choosing the right tone
* Managing large volumes of emails

**Smart Email Assistant** solves this by generating polished replies using AI, saving time and improving communication quality.

---
# 🧠 How It Works

## 1️⃣ Frontend (React)

The frontend is built using:

* React (Hooks + Functional Components)
* Material UI
* Axios

**Flow:**

1. User pastes email → selects tone
2. Clicks **Generate Reply**
3. Axios sends POST request to backend
4. Gemini responds → reply displayed in UI

**API Request Example**

```json
POST /api/email/generate
{
  "emailContent": "Hello...",
  "tone": "professional"
}
```

---

## 2️⃣ Backend (Spring Boot + Gemini AI)

Built with a clean **layered architecture**:

* **Controller** → receives email + tone
* **Service** → builds prompt and calls Gemini
* **WebClient** → makes API request
* **JSON parsing** → extracts meaningful reply

**Key Features**

* CORS enabled for Gmail extension
* Externalized API keys
* Error handling
* Non-blocking WebClient

---

## 3️⃣ Chrome Extension (Gmail Integration)

The Chrome extension adds an **AI Reply** button inside Gmail’s compose window.

### 🔧 Technologies

* JavaScript Content Scripts
* DOM Selectors
* MutationObserver
* Manifest V3

### 🔄 Workflow

1. MutationObserver detects Gmail compose window (SPA behavior).
2. Inserts **AI Reply** button into Gmail toolbar.
3. On click → captures latest email thread.
4. Sends email content to backend.
5. Receives AI reply.
6. Auto-inserts reply into Gmail compose window.

Users get a **one-click professional email reply** without leaving Gmail.

---

# 💼 Real-Life Use Cases

Suitable for:

* HR
* Sales teams
* Customer support
* Students
* Busy professionals

---

# 🧪 Challenges & Solutions

| Challenge                     | Solution                                  |
| ----------------------------- | ----------------------------------------- |
| Gmail DOM changes dynamically | MutationObserver to detect compose window |
| Parsing Gemini response       | Jackson + JsonNode                        |
| CORS restrictions             | Configured allowed origins                |
| Secure API keys               | Environment variables                     |

---

# 🚀 Future Enhancements

* User login system
* Email history/logs
* Multi-language support
* Custom tone builder
* Inline editing suggestions

---

# 📚 What I Learned

* Full-stack integration (React + Spring Boot)
* AI API communication using WebClient
* JSON processing and error handling
* DOM automation inside Gmail
* Building Chrome extensions
* CORS management and secure configuration

---

