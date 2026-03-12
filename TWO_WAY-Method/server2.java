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
