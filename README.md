<div align="center">
  <img src="https://skillicons.dev/icons?i=java,git,github,vscode" alt="Tech Stack Logos" width="280" />
  
  <br>

  # 🛜 Networking-in-JAVA
  
  **A comprehensive laboratory for mastering TCP/IP, UDP, and High-Performance Socket Programming in Java.**
  
  ![Java](https://img.shields.io/badge/Java_17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  ![Networking](https://img.shields.io/badge/Protocol-TCP%2FUDP-blue?style=for-the-badge&logo=internet-explorer&logoColor=white)
  ![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)
</div>

---

## 📦 Network-IN-Java Architecture

<p align="center">
  <img src="/images/NetworkINJava.png" width="600">
</p>

---

## 🏗️ Architecture & Concepts

Modern software doesn't exist in a vacuum. This repository breaks down the complexity of the **OSI Model** and **TCP/IP Stack** into digestible, code-first examples. We bridge the gap between "sending a string" and "building a scalable network architecture."

* **Reliability:** Understanding the 3-way handshake and data integrity.
* **Concurrency:** Managing multiple client connections using Thread Pools.
* **Streams:** Mastering `InputStream` and `OutputStream` for real-time data flow.

---

## 📂 Project Breakdown

| Module | Focus | Key Classes | Complexity |
| :---: | :--- | :--- | :---: |
| **01** | **TCP Fundamentals** | `ServerSocket`, `Socket` | 🟢 Basic |
| **02** | **UDP Datagrams** | `DatagramSocket`, `DatagramPacket` | 🟡 Moderate |
| **03** | **Multi-threaded Server** | `ExecutorService`, `Concurrency` | 🔴 Advanced |
| **04** | **URL Processing** | `URL`, `URLConnection`, `HTTPClient` | 🟢 Basic |

---

## 🧬 Core Logic: TCP vs. UDP

In the world of networking, choosing the right protocol is everything. This repo explores both:

### 📌 Transmission Control Protocol (TCP)
The "Reliable" choice. Guaranteed delivery, ordered packets, and error checking.
* **Use Case:** File transfers, Web browsing (HTTP), Email (SMTP).
* **Highlights:** Connection-oriented communication via a virtual circuit.

### 📌 User Datagram Protocol (UDP)
The "Fast" choice. No handshakes, low latency, best-effort delivery.
* **Use Case:** Video streaming, VoIP, Online Gaming.
* **Highlights:** Packet-based communication without connection overhead.

---

## 🛠️ Comprehensive Tech Stack

<div align="center">
  
**Core Languages & Protocols** <br>
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=flat-square&logo=openjdk&logoColor=white)
![TCP/IP](https://img.shields.io/badge/TCP%2FIP-Protocols-blue?style=flat-square)
![UDP](https://img.shields.io/badge/UDP-Datagrams-lightgrey?style=flat-square)

**Networking Utilities** <br>
![Sockets](https://img.shields.io/badge/Socket_Programming-Standard_Library-orange?style=flat-square)
![Streams](https://img.shields.io/badge/I%2FO_Streams-Data_Flow-green?style=flat-square)
![Multi-threading](https://img.shields.io/badge/Concurrency-Virtual_Threads-red?style=flat-square)

**Tooling & Environment** <br>
![VS Code](https://img.shields.io/badge/VS%20Code-0078D4?style=flat-square&logo=visual%20studio%20code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=flat-square&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=flat-square&logo=git&logoColor=white)

</div>

---

## 🚀 Getting Started

1. **Clone the Repo:**
   ```bash
   git clone [https://github.com/Biratporbo/Networking-in-JAVA.git](https://github.com/Biratporbo/Networking-in-JAVA.git)
   ```

2. **Setup:** Ensure you have Java 17 or higher installed.

3. **Execution:** Each file in `/src` is a standalone module. Start with `TCPServer.java` and `TCPClient.java`.

---

## 🤝 Contribution & Growth

This is a living laboratory. If you have an optimization for a buffer or a new protocol implementation, pull requests are **highly encouraged**.

1. **Fork** the repository
2. **Branch** out (`git checkout -b feature/NewProtocol`)
3. **Commit** changes
4. **Push** and open a PR

---

## 🔗 Connect with the Developer

<div align="center">
  <a href="https://www.linkedin.com/in/birat-dey-b74881281/">
    <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn Badge"/>
  </a>
  <a href="https://www.github.com/Biratporbo/">
    <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" alt="GitHub Badge"/>
  </a>
</div>

---

🤝 Let's Connect
Feel free to reach out for discussions on networking architecture, backend performance, or open-source collaboration.

---

<p align="center">
  Released under the <b>MIT License</b>. <br>
  Built with ❤️ for the Java Community.
</p>
