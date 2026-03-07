# 🛜 Creating a Server That Sends Data
- We can create a socket that can be used to connect a server and a client. Once the socket is created, the server can send data to the client can receive it. All we have to do is to just send the data from the server to the socket. The socket will take care of whom to send data on the network.

---

## 📄 Let us follow these steps to create a server that sends some strings (messages) to the client:

- **`ServerSocket ss = new ServerSocket(777);`**

- Now, we should make the server wait till a client accepts connection. This is done using `accept()` method.

    - **`Socket s = ss.accept();`**

- Attach output stream to the server socket using `getOutputStream()` method. This method returns `OutputStream` object. This stream is used by the socket to send data to client.

    - **`OutputStream obj = s.getOutputStream();`**

- Take another stream like `PrintStream` to send data till the socket.

    - **`PrintStream ps = new PrintStream(obj);`**

- Finally, this `PrintStream` is used by the server to send data to the client. To send data, we have `print()` or `println()` methods available in `PrintStream`.

    - **`ps.println(str);`**

- Then close the connection. This can be done by closing all the streams and sockets at server side as:

```
ss.close(); //close ServerSocket
s.close(); //close Socket
ps.close(); //close PrintStream

```

- *All these steps are shown of following diagram and also implemented in the Program*

# 💻 Project Architecture

- Below is the server diagram:

<p align="center">
  <img src="../images/server.png" width="600">
</p>

---

## ⌨️ Program: Write a program to creat a server for the purpose of sending some strings to the client.

```Java

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.*;

//Server1 - to send strings

public class server{
    public static void main(String[] args) throws IOException {
        
        //create a server socket with some port number
        ServerSocket ss = new ServerSocket(777);

        //let the server wait till a client accepts connection
        Socket s = ss.accept();
        System.out.println("Connection established");


        //attach output stream to the server socket
        OutputStream obj = s.getOutputStream();

        //attach print stream to send data to the socket
        PrintStream ps = new PrintStream(obj);

        //sends 2 strings to the client
        String str = "Hello client";
        ps.println(str);
        ps.println("Bye");

        //close connection by closing the stream sockets
        ps.close();
        ss.close();
    }
}

```

## ⚡Output: 

```Terminal (powershell)
D:\Networking-in-JAVA> cd Creating_SERVER
D:\Networking-in-JAVA\Creating_SERVER>javac server.java
D:\Github Club\Networking-in-Java\Networking-in-JAVA\Creating_SERVER>  
D:\Github Club\Networking-in-Java\Networking-in-JAVA\Creating_SERVER> DO NOT RUN THIS PROGRAM TILL CLIENT IS ALSO CREATED...

```