# 🛜 Creating a Server That Sends Data
- We can create a socket that can be used to connect a server and a client. Once the socket is created, the server can send data to the client can receive it. All we have to do is tojust send the data from the server to the socket. The socket will take care of whom to send data on the network.

- Let us follow these steps to create a server that sends some strings (messages) to the client:

- `ServerSocket ss = new ServerSocket(777);`

- Now, we should make the server wait till a client accepts connection. This is done using `accept()` method.

- `Socket s = ss.accept();`

- Attach output stream to the server socket using `getOutputStream()` method. This method returns `OutputStream` object. This stream is used by the socket to send data to client.

- `OutputStream obj = s.getOutputStream();`