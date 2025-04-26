# Spring AI Hugging Face Demo

A simple Spring Boot application using Spring AI and Hugging Face API to generate AI-based responses from a lightweight transformer model.

---

## 🚀 Features

- ✅ REST API for sending prompts
- ✅ Spring AI Hugging Face integration
- ✅ Swagger UI for easy testing
- ✅ Works with free-tier models like `DialoGPT-small`

---

## 📦 Requirements

- Java 21+
- Maven
- Hugging Face account + free API token

---

## 🔧 Setup

1. **Clone the project** or unzip the provided files
2. **Configure your API key** in `application.yml`:

```yaml
spring:
  ai:
    huggingface:
      chat:
        api-key: YOUR_HUGGINGFACE_TOKEN
        url: https://api-inference.huggingface.co/models/microsoft/DialoGPT-small
```

3. **Run the app**:

```bash
mvn spring-boot:run
```

---

## 📬 Usage

### Swagger UI

Open in browser:  
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### cURL Example

```bash
curl -X POST http://localhost:8080/ai/chat      -H "Content-Type: text/plain"      -d "What's the weather like in space?"
```

---

## 📚 Models You Can Use

- `microsoft/DialoGPT-small` (chat, free)
- `google/flan-t5-small` (instruction following)
- `gpt2` (basic text generation)

---

## 🧠 More Ideas

- Add vector search with PostgreSQL or Redis
- Integrate memory/context for chat
- Switch to paid Hugging Face endpoint for larger models

---

## 📝 License

MIT
