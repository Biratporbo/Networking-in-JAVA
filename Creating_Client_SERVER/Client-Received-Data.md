# 👤 Creating a Client That Receives Data

- We can write a client program that receives all the strings sent from the server. Let us follow these steps to do this:

 - First we should create a socket at client side using `Socket` class are:

      - **`Sockeet s = new Socket("IPAddress", port number);`**

 - Here, the `IPAddress` represents the IPAddress of the server machine wheere `server.java` program is running. To know the IPAddress, we can use DOS command, as:
       
      - **`C:\> ipconfig`**

- This will display the IPAddress of the machine where the command is applied.

- Or, We can follow the commands:

- *Starts* ➡️ *Settings* ➡️ *Control panel* ➡️ *Network connections* ➡️ *right click on this to see the IPAddress*.

- If is possible to run the `server.java` and `client.java` programs on two different computers connected in a network. But, at `client.java`, we should pass the server machine's IPAddress. Then the port number at `client.java` should be same as the port number with which the server socket has been created. In case, you do not have your computer in a network, you have to run both the server and client programs in the same system.  In that case, you can use `localhost` in place of `IPAddress`. The word `localhost` represents that the server is also locally available in the same system.

- We should add `InputStream` to the socket so that the socket will be able to receive the data data on the `InputStream`.

       - **`InputStream obj = s.getInputStream();`**

- To read the data from the socket into the client, we can take the help of `BufferedReader` as: 

       - **`BufferedReader br = new BufferedReader(new InputStreamReader(obj));`**

- Now we can read data from the the `BufferedReader` object, using `read()` or `readline()` methods `Read()` method can read a single character at a time, where `as readline()` can read a string.

       - **`str = br.readLine();`**

- Close the connection by closing all the streams and sockets.

       - **`br.close(); //close the BufferedReader`**
       - **`s.close(); //close the Socket`**

- All these steps are shown in the following diagram and also implemented in Program ->

---