# Knowing IP Address 🌐

It is possible to know the IP Address of a website on Internet with the help of `getName()` method of `InetAddress` class of `java.net` package. The `getByName()` method takes host name (server name) and returns `InetAddress`, which is nothing but the IPAddress of the server. See the program that, I have already mention in the repo!

---

## 📌 Program

Write a program to accept a website name and return its IPAddress, after checking it on Internet.

- **Note -** This program should be executed on a system, which it is connected to Internet.

```Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

//Knowing IPAddress of a website

class Address
{
    public static void main(String[] args) throws IOException {
        //accept name of website from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a website name: ");
        String site = br.readLine();
        try {
            //getByName() methods accepts site name and retutrns its IP Address
            InetAddress ip = InetAddress.getByName(site);
            System.out.println("The IP Address is: " + ip);
        } catch (UnknownHostException ue){
            System.out.println("Website not found");
        }
    }
}
```
---

### ⚡ Output
```Terminal (powershell)
C:\> javac Address.java
C:\> java Address
Enter a website name: www.google.com
The IP Address is: www.google.com/142.250.nnn.nnn
