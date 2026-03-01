# 📡 User Datagram Protocol (UDP)

UDP is another protocol that transfers data in a connectionless and unreliable manner. It will not guarantee transmission of data; there may be loss of some bits. Hence, UDP is used to send image files, audio files, and video files.

UDP does not check how many bits are sent or how many bits are actually received at the other side. Even if some bits are lost, still the image or audio file can be composed with a slight variation that will not disturb the original image or audio.

# 🔌 Sockets

It is possible to establish a logical connecting point between a server and a client. Communication can be done through that point. This point is called a socket.

## 💡 Interview Question

- **What is a socket?**

A socket is a point of connection between a server and a client on a network. Each socket is given an identification number, which is called a port number. Port number takes 2 bytes and can be from 0 to 65,535. Establishing communication between a server and a client using sockets is called socket programming.

---

## 💡 Interview Question

- **What is port number?**

Port number is a 2-byte number which is used to identify a socket uniquely.

We should use a new port number for each new socket. Similarly, we should allot a new port number depending on the service provided on a socket. Every new service on the net should be assigned a new port number. Please have a look at some already allotted port numbers for the services shown in Table 25.1. Avoid using same port numbers, which are already used by applications running in your system.

---

# 🌐 Port Numbers and Services

| Port Number | Application or Service                          |
|-------------|-------------------------------------------------|
| 13          | Date and time services                          |
| 21          | FTP – transfers files                           |
| 23          | Telnet – provides remote login                  |
| 25          | SMTP – delivers mails                           |
| 67          | BOOTP – provides configuration at boot time     |
| 80          | HTTP – transfers web pages                      |
| 109         | POP – accesses mailboxes                        |

---

## 🔗 Socket Communication Diagram

![Socket Communication](socket.png)

---

A socket at server side is called Server Socket and is created using ServerSocket class in Java. A socket at client side is called Socket and is created using Socket class. Both the ServerSocket and Socket classes are available in java.net package.

Of course, a server socket may not be necessarily at server side; it may be created at client side also, if the client acts as server. Similarly, a client socket may also exist at server side, if the server acts as client.