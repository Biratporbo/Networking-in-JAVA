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
