1. create project 
	1. maven project

following code handles one request at a time but we can refresh again and again 
but the issue is we can have one client at one time

```java 
package com.servlet;  
  
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
import java.io.PrintWriter;  
import java.net.ServerSocket;  
import java.net.Socket;  
import java.time.LocalDateTime;  
  
public class SimpleWebContainer {  
    private final int port;  
  
    public SimpleWebContainer(int port) {  
        this.port = port;  
    }  
  
    private void start() throws IOException {  
        // works on top of tcp  
        ServerSocket serverSocket = new ServerSocket(port);  
        System.out.println("Server started on port " + port);  
        //blocking method, listens request  
        // socket can hold the input and also push the data        // data is binary        while (true) {  
            try (Socket socket = serverSocket.accept()) {  
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
                String line = in.readLine();  
                while (!line.isEmpty()) {  
                    System.out.println(line);  
                    line = in.readLine();  
                }  
                PrintWriter out = new PrintWriter(socket.getOutputStream());  
                out.println("HTTP/1.1 200 OK");  
                out.println("Content-Type: text/html");  
  
                out.println(); // /r/n we need at least one line breaker in between  
  
                out.println("<html><body>");  
                out.println(LocalDateTime.now());  
                out.println("</body></html>");  
                out.flush();  
            }  
        }  
    }  
  
    public static void main(String[] args) throws IOException {  
        SimpleWebContainer container = new SimpleWebContainer(8888);  
        container.start();  
  
    }  
}
```