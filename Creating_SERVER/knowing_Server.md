# 🛜 Creating a Server That Sends Data
- We can create a socket that can be used to connect a server and a client. Once the socket is created, the server can send data to the client can receive it. All we have to do is tojust send the data from the server to the socket. The socket will take care of whom to send data on the network.

---

- *Let us follow these steps to create a server that sends some strings (messages) to the client:*

- **`ServerSocket ss = new ServerSocket(777);`**

- Now, we should make the server wait till a client accepts connection. This is done using `accept()` method.

- **`Socket s = ss.accept();`**

- Attach output stream to the server socket using `getOutputStream()` method. This method returns `OutputStream` object. This stream is used by the socket to send data to client.

- **`OutputStream obj = s.getOutputStream();`**

- Take another stream like `PrintStream` to send data till the socket.

- **`PrintStream ps = new Printstream(obj);`**

- Finally, this `PrintStream` is used by the server to send data to the client. To send data, we have `print()` or `println()` methods available in `PrintStream`.

- **`ps.println(str);`**

- Then close the connection. This can be done by closing all the streams and sockets at server side as:

```
ss.close(); //close ServerSocket
s.close(); //close Socket
ps.close(); //close PrintStream

```

- *All these steps are shown of following diagram and also implemented in the Program*

# Project Architecture

- Below is the server diagram:

<p align="center">
  <img src="../images/server.png" width="600">
</p>