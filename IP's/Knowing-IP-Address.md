# Knowing IP Address

It is possible to know the IP Address of a website on Internet with the help of `getName()` method of `InetAddress` class of `java.net` package. The `getByName()` method takes host name (server name) and returns `InetAddress`, which is nothing but the IPAddress of the server. See the program that, I have already mention in the repo!

---

## Program

Write a program to accept a website name and return its IPAddress, after checking it on Internet.

- **Note -** This program should be executed on a system, which it is connected to Internet.

---

### Output
```Terminal (powershell)
C:\> javac Address.java
C:\> java Address
Enter a website name: www.google.com
The IP Address is: www.google.com/142.250.nnn.nnn