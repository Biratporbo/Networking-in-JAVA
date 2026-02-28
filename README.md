# Networking-in-JAVA
Networking in Java made simple 💻 | TCP, UDP &amp; Socket programming

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
Socket socket = new Socket("localhost", 8080);

🔹Server Example
ServerSocket server = new ServerSocket(8080);
Socket client = server.accept();
