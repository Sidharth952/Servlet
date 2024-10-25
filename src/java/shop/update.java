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
public class update extends HttpServlet {
    @Override
            protected void doPost(HttpServletRequest request,HttpServletResponse response) throws SecurityException , IOException{
    String user_id=request.getParameter("idno");
        System.out.println(user_id);
    int id=Integer.parseInt(user_id);
    }
}