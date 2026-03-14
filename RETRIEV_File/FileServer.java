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