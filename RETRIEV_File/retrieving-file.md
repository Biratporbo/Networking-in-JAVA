# 🗃️ Retrieving a file at server

- Let us write client and server programs, such that the client sends the name of a file to the server. After receiving the filename, the server searches for the file to know if it exists or not. If the file exists, the server sends the file contents to the client. This by following the program, which are self-explanatory.

---

## ⌨️ Program: Write a program that accepts the filename and checks for its existence. When the file exists at server side, it sends the file contents to the client.

```Java

//A Server that sends a file content to the client

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//A Server that sends a file content to the client
public class FileServer
{
    public static void main(String[] args) throws Exception {
        //create server socket
        ServerSocket ss = new ServerSocket(8888);

        //make the server wait till a client accepts connection
        Socket s = ss.accept();
        System.out.println("Connection established");

        //to accept file name from client
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //to send file contents to client
        DataOutputStream out = new DataOutputStream(s.getOutputStream());

        //read the file name from the client
        String fname = in.readLine();

        FileReader fr = null;
        BufferedReader file = null;
        boolean flag;

        //create File class object with filename
        File f = new File(fname);

        //test if file exists or not
        if(f.exists()) flag = true;
        else flag = false;

        //if file exists, send "Yes" to client, else send "No"
        if(flag == true) out.writeBytes("Yes"+"\n");
        else out.writeBytes("No"+"\n");

        if(flag == true)
        {
            fr = new FileReader(fname);

            //attach file to the FileReader to read data
            file = new BufferedReader(fr);

            String str;

            //read from BufferedReader and write to DataOutputStream
            while((str = file.readLine()) != null)
            {
                out.writeBytes(str+"\n");
            }
            file.close();
            out.close();
            in.close();
            fr.close();
            s.close();
            ss.close();
        }
    }
}

```

---

## ⚡ Output: 
```Terminal(powershell)
D:\Github Club\Networking-in-Java\Networking-in-JAVA> javac FileServer.java
D:\Github Club\Networking-in-Java\Networking-in-JAVA>

```

---

- This is a server program that receives the file name from the client and if file exists, it sends "`Yes`", otherwise "`No`" to the client. This helps the client to understand whether the file really exists at server or not. Then this server program sends the file contents to the client if the file exists.

---

## ⌨️ Program: Write a client program to accept a file name from the keyboard and send that name to the server. The client receives the file contents from the server.

```Java

