package shop;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param1 = request.getParameter("p1");
        String param2 = request.getParameter("p2");
        int n1=Integer.parseInt(param1);
        int n2=Integer.parseInt(param2);
        int s=n1+n2;
        response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<h1>Received Parameters</h1>");
        response.getWriter().println("<h3>"+n1+"+<br>"+n2+"<br>-------<br>"+s+"</h3>");
        response.getWriter().println("</center></body></html>");
    }
}