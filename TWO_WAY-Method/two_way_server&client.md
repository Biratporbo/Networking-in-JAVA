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

## ⚡ Output: 

```Terminal(powershell)
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>javac server2.java
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>

```

---

## ⌨️ Program: Write a program to create a client which first connects to aserver, then starts the communication by sending a string to the server. The server sends response to the client. When 'exit' is typed at client side, the profram terminates.

```Java

//client2- a client that sends data and receives also

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client2 {
    public static void main(String[] args) throws Exception
    {
        //create client socket
        Socket s = new Socket("localhost", 888);

        //to send data to the server
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        //to read data coming from the server
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //to read data coming from the key board
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));

        String str, str1;
        
        //repeat as long as exit is not typed at client
        while(!(str = kb.readLine()).equals("exit"))
        {
            dos.writeBytes(str+"\n"); //send to server
            str1 = br.readLine();   //receive from the server
            System.out.println(str1);
        }
        //close connection;
        dos.close();
        br.close();
        kb.close();
        s.close();
    }
}

```

---

## ⚡ Output:
```Terminal(powershell)
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>javac client2.java
d:\Github Club\Networking-in-Java\Networking-in-JAVA\TWO_WAY-Method>

```

---