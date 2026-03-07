# 👤 Creating a Client That Receives Data

- We can write a client program that receives all the strings sent from the server. Let us follow these steps to do this:

 - First we should create a socket at client side using `Socket` class are:

 - **`Sockeet s = new Socket("IPAddress", port number);`**

 - Here, the `IPAddress` represents the IPAddress of the server machine wheere `Server1.java` program is running.