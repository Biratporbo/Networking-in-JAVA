# 🖥️ URLConnection Class
- `URLConnection` class is useful to actually connect to a website or resource on a network and get all the details of the website. For example, to know the details `www.yahoo.com`, we should pass its URL to the object of URL class. Then using `openConnection()` method, we should establish a contact with the site on Internet. This method returns `URLConnection` object. Then using `URLConnection` class methods, we can display  all the details of the website and also content of the webpage whose name is given in URL. This is shown of the following Program.

- **💻 Note that this program should be excecuted on a computer where the Internet connection is enabled.**

**⌨️ Program-** Write a program to display the details and the `index.html` page contents of `www.yahoo.com`.

```Java

//connecting to www.yahoo.com and getting the details.

import java.io.*;
import java.net.*;
import java.util.Date;

public class Details {
    public static void main(String[] args) throws IOException {
        
        //Pass the site url to URL object
        URL obj = new URL("http://www.yahoo.com/index.html");

        //open a connection with the site on Internet
        URLConnection conn = obj.openConnection();

        //display the date
        System.out.println("Date: " + new Date(conn.getDate()));

        //display the content type whether text or html
        System.out.println("Content-type: " + conn.getContentType());

        //display the expiry date
        System.out.println("Expirey: " + conn.getExpiration());

        //display the last modified date
        System.out.println("Last Modified: " + new Date(conn.getLastModified()));

        //display how many bytes the index.html page has
        int l = conn.getContentLength();
        System.out.println("Length of Content: " + l);

        if(l == 0)
        {
            System.out.println("Content not available");
            return;
        }
        else
        {
            int ch;
            InputStream in = conn.getInputStream();
            //display the content of the index.html page
            while((ch = in.read())!= -1);
            System.out.println((char)ch);
        }

    }    
}
```

---

### ⚡ Output
```Terminal (powershell)
C:\> javac Details.java
C:\> java Details
Note: Details.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Date: Wed Mar 04 22:10:08 IST 2026
Content-type: text/html
Expirey: 0
Last Modified: Thu Jan 01 05:30:00 IST 1970
Length of Content: 23

```