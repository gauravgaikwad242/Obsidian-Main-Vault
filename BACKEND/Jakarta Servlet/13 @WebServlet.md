- using annotation instead of web.xml
```java 
@WebServlet("/hello")  
//@WebServlet(value = "hello")  
//@WebServlet(urlPatterns = "hello")  
//@WebServlet({"/hello","/simple"})  
//@WebServlet(urlPatterns = {"/hello","/simple"})  
public class SimpleServlet extends HttpServlet {  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {  
        resp.setContentType("text/html");  
        PrintWriter out = resp.getWriter();  
        out.println("<html><body>");  
        out.println("<h1>Simple Servlet</h1>");  
        out.println("</body></html>");  
  
    }  
}
```

<hr>

these property in anotation doesn affect servlet behaviour 

```java 
String smallIcon() default "";  
  
String largeIcon() default "";  
  
String description() default "";  
  
String displayName() default "";
```

- <mark style="background: #FFB86CA6;">We can use both web.xml and annotations in same application</mark>
