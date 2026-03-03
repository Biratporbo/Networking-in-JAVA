# URL
- URL (Uniform Resource Locator) represents the address that is specified to access some information or resource on Internet. Look at the example URL:
- `http://www.github.com/Biratporbo/index.html`
- The URL contains 4 parts:
  - The protocol to use (`http://`).
  - The server name or IP address of the server (`www.github.com`).
  - The third part represents port number, which is optional (`:80`).
  - The last part is the file that is referred. This would be generally `index.html` or `home.html` file 
    (/ `index.html`).

---

## URL is represented by a class 'URL' in `java.net` package. To create an object to URL, we can use the following formats:

- **`URL obj = new URL(String protocol, String host, int port, String path);`**

- Or,

**`URL obj = new URL(String protocol, String host, String path)`**

---

## The following program accesses the different parts of the URL supplied to URL object and displays them.

**Program-** Write a program to retrieve different parts of a URL supplied to URL class object.