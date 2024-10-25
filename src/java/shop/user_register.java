package shop;

import short_cut.*;
import java.net.Authenticator;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;

@WebServlet("/reg")
public class user_register extends HttpServlet {
    @Override
            protected void doPost(HttpServletRequest request,HttpServletResponse response) throws SecurityException , IOException{
            String id=request.getParameter("idno");
            int user_id=Integer.parseInt(id);
            String name=request.getParameter("name");
            String pho=request.getParameter("phone");
            long phone=Long.parseLong(pho);
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            response.setContentType("text/html");
            response.getWriter().println("<html><head><style>table,th,td{text-align:center;border: 3px solid;}</style></head><body><center><table>");
            response.getWriter().println("<br><br><br><br><br><br><th colspan='2'>User Details</th>");
            response.getWriter().println("<tr><td>User Id </td><td>"+id+"</td></tr>");
            response.getWriter().println("<tr><td>Name </td><td>"+name+"</td></tr>");
            response.getWriter().println("<tr><td>Phone No </td><td>"+phone+"</td></tr>");
            response.getWriter().println("<tr><td>E-mail Id </td><td>"+email+"</td></tr>");
            response.getWriter().println("<tr><td>Password </td><td>"+password+"</td></tr>");
            response.getWriter().println("</table></center></body></html>");
    
    try {
        Connect C=new Connect();
        Connection con=C.getConnection();
        PreparedStatement ps1=con.prepareStatement("select * from user_register");
        ResultSet rs=ps1.executeQuery();
        while(rs.next()) {
            int user_id1=rs.getInt("user_id");
            long phone1=rs.getLong("phone");
            String email1=rs.getString("email");
            if(user_id1==user_id) {
                PrintWriter out=response.getWriter(); 
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('User Id Already Registered');");  
                out.println("</script>");
                return;
            }
            if(phone1==phone) {
                PrintWriter out=response.getWriter(); 
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('Phone number Already Registered');");  
                out.println("</script>");
                return;
            }
            if(email1.equals(email)) {
                PrintWriter out=response.getWriter(); 
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('E-mail Id Already Registered');");  
                out.println("</script>");
                return;
            }
        }
        PreparedStatement ps2=con.prepareStatement("Insert into user_register values(?,?,?,?,?)");
        ps2.setInt(1,user_id);
        ps2.setString(2,name);
        ps2.setLong(3,phone);
        ps2.setString(4,email);
        ps2.setString(5,password);
        int i=ps2.executeUpdate();
        if(i>0){
            response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<br><br><h1>Registration Successful</h1>");
        response.getWriter().println("</center></body></html>");
        }
        else {
           response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<br><br><h1>Registration Failed</h1>");
        response.getWriter().println("</center></body></html>");
        }
    }
    catch (Exception e) {
        e.printStackTrace();
    }
  }
}