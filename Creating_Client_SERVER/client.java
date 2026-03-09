// client - to receive strings

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class client{
    public static void main(String[] args) throws Exception {
        
        //create a client socket with same port number
        Socket s = new Socket("localhost", 777);

        //to read data coming from server, attach Inputstream to the socket
        InputStream obj  = s.getInputStream();

        //to read data from the socket into the client, use BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(obj));

        //receive strings
        String str;
        while((str = br.readLine()) != null)
        System.out.println("From Server: " + str);

        //close connection by closing the streams and sockets
        br.close();
        s.close();
    }
}