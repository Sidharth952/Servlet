package shop;

import short_cut.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class delete extends HttpServlet {
    @Override
            protected void doPost(HttpServletRequest request,HttpServletResponse response) throws SecurityException , IOException{
    String user_id=request.getParameter("idno");
        System.out.println(user_id);
    int id=Integer.parseInt(user_id);
    try{
        Connect C=new Connect();
        Connection con=C.getConnection();
        PreparedStatement ps=con.prepareStatement("Delete from user_register where user_id=?");
        ps.setInt(1,id);
        int i=ps.executeUpdate();
        if(i>0){
            response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<br><br><h1>Successfully Deleted</h1>");
        response.getWriter().println("</center></body></html>");
        }
        else {
            response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<br><br><h1>Deletion Failed</h1>");
        response.getWriter().println("</center></body></html>");
        }
    }
    catch(Exception e){
        response.setContentType("text/html");
        response.getWriter().println("<html><body><center>");
        response.getWriter().println("<br><br><h1>Invalid Input</h1>");
        response.getWriter().println("</center></body></html>");
    }
    }
}
