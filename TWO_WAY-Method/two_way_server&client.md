# 👥 Two-way Communication between Server and Client 

- It is possible to send data from the server and receive the response from the client. Similarly, the client can also send and receive the data to-and-fro. For this purpose, we need additional streams both at server and client. For example, to receive data into the server, it is a better idea to use `BufferedReader` as:

    - **`InputStream obj = s.getInputStream();`**
    - **`BufferedReader br = new BufferedReader(new InputStreamReader(obj));`**

- Then `read()` or `readline()` methods of `BufferedReader` class can be used to read data.
- To send data from the client, we can take the help of `DataOutStream` as:

    - **`OutputStream obj = s.getOutputStream();`**
    - **`DataOutputStream dos = new DataOutputStream(obj);`**

- Then `writeBytes()` methods of `DataOutputStream` can be used to send strings in the form of group of bytes.

---

## ⌨️ Program: Write a program to create a server such that the server receives data from the client using `BufferedReader` and then sends reply to the client using `PrintStream`.

```java

//server2 - A server that recevies data and sends data

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server2 {
    public static void main(String[] args) throws  Exception
    {
        //create server socket
        ServerSocket ss = new ServerSocket(888);

        //connect it to client socket 
        Socket s = ss.accept();
        System.out.println("Conection established");

        //to send data to the client
        PrintStream ps = new PrintStream(s.getOutputStream());

        //to read data coming from the client
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //to read data from the key board
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        while(true) //server executes continuously
        {
            String str, str1;
            //repeat as long as client does not send null string
            while((str = br.readLine()) != null)    //read from client 
            {
                System.out.println(str);
                str1 = kb.readLine();
                ps.println(str1); //send to client
            }

            //close connection
            ps.close();
            br.close();
            kb.close();
            ss.close();
            s.close();
            System.exit(0); //terminate application

        }   //end of while
    }  
}

```

---

# ⚡ Output: 

```Terminal(powershell)
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>javac server2.java
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>

```
