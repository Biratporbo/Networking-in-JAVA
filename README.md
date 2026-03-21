# 🛜 Networking-in-JAVA
Networking in Java made simple 💻 | TCP, UDP &amp; Socket programming

---

## 📦 Network-IN-Java Architecture

<p align="center">
  <img src="/images/NetworkINJava.png" width="600">
</p>

---

## 🚀 Getting Started

Clone this repo:
```
git clone https://github.com/Biratporbo/Networking-in-JAVA.git
```
- Open in your favorite IDE (like IntelliJ or VS Code).
- Make sure you have Java 8+ installed.
- Run the example files in the `/src` folder.
- That’s it—happy networking! 😎☕️
  
---

## 📌 What is Networking?

Networking allows devices to communicate and share data over a network.

In Java, networking is handled using the `java.net` package.

---

## 📦 Packet vs Frame

- **Packet** → Data unit at the Network layer (IP)
- **Frame** → Data unit at the Data Link layer

---

## 🌐 TCP/IP Layers

1. Application Layer
2. Transport Layer (TCP/UDP)
3. Internet Layer (IP)
4. Data Link Layer
5. Physical Layer

---

## 🔹 Important Java Networking Classes

- `Socket`
- `ServerSocket`
- `DatagramSocket`
- `InetAddress`
- `URL`
- `URLConnection`

---

## 🔹 TCP in Java Example

```java
ServerSocket server = new ServerSocket(8080);
Socket client = server.accept();

```

---

## ☕ Conclusion

- The classes of `java.net` package internally use TCP/IP and UDP protocols that are responsible for sending and receiving data. We can also establish communication between a server and a client by creating server socket and client socket. This is called 'socket programming'. The data can be then sent or received between sockets, with the help of streams. However, socket programming offers only basic networking. If we want to achieve sophisticated client-server communication, we should look forward to servlets, JSPs (Java Server Pages), etc.

---

## 🤝 Contributing
Found a bug or want to add a new feature?

- Fork the repo
- Create a new branch
- Make your changes
- Open a pull request
- All ideas are welcome—let’s make networking in Java even better! 🚀

---

## 📄 License

This project is licensed under the MIT License.

Feel free to use, modify, and share it—just keep the original credits!

---
