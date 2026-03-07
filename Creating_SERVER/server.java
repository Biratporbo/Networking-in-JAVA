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