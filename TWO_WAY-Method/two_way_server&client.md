# 👥 Two-way Communication between Server and Client 

- It is possible to send data from the server and receive the response from the client. Similarly, the client can also send and receive the data to-and-fro. For this purpose, we need additional streams both at server and client. For example, to receive data into the server, it is a better idea to use `BufferedReader` as:

    - **`InputStream obj = s.getInputStream();`**
    - **`BufferedReader br = new BufferedReader(new InputStreamReader(obj));`**

- Then `read()` or `readline()` methods of `BufferedReader` class can be used to read data.
- To send data from the client, we can take the help of `DataOutStream` as:

    - **`OutputStream obj = s.getOutputStream();`**
    - **`DataOutputStream dos = new DataOutputStream(obj);`**

- Then `writeBytes()` methods of `DataOutputStream` can be used to send strings in the form of group of bytes.