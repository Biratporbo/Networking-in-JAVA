# 🌐 URL

- URL (Uniform Resource Locator) represents the address that is specified to access some information or resource on Internet. Look at the example URL:

- `http://www.github.com/Biratporbo/index.html`

- **The URL contains 4 parts:**
  - The protocol to use (http://) 🔗
  - The server name or IP address of the server (www.github.com) 🖥️
  - The third part represents port number, which is optional (:80) ⚙️
  - The last part is the file that is referred. This would be generally index.html or home.html file (/ index.html) 📄

    

---

## 📦 URL is represented by a class 'URL' in `java.net` package. To create an object to URL, we can use the following formats:

- **`URL obj = new URL(String protocol, String host, int port, String path);`**

- Or,

**`URL obj = new URL(String protocol, String host, String path)`**

---

## 💻 The following program accesses the different parts of the URL supplied to URL object and displays them.

**⌨️ Program-** Write a program to retrieve different parts of a URL supplied to URL class object.

```Java

//URL

import java.io.IOException;
import java.net.*;

public class MyURL {
    public static void main(String[] args) throws IOException{
        URL obj = new URL("http://dreamtechpress.com/index.html");
        System.out.println("Protocol: "+ obj.getProtocol());
        System.out.println("Host: "+ obj.getHost());
        System.out.println("File: "+ obj.getFile());
        System.out.println("Port: "+ obj.getPort());
        System.out.println("Path: "+ obj.getPort());
        System.out.println("External from: "+ obj.toExternalForm());

    }
}
```

---

### ⚡ Output
```Terminal (powershell)
C:\> javac MyURL.java
C:\> java MyURL
Protocol: http
Host: dreamtechpress.com
File: /index.html
Port: -1
Path: -1
External from: http://dreamtechpress.com/index.html

```

---

### ℹ️ Please note that port & path number is displayed as -1 in the output, which represents that no port number is passed in the URL.
