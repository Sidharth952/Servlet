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
import java.util.ArrayList;
import java.util.List;
@WebServlet("/read")
public class See_List extends HttpServlet {
    @Override
            protected void doPost(HttpServletRequest request,HttpServletResponse response) throws SecurityException ,IOException{
        try{
            Connect C=new Connect();
        Connection con=C.getConnection();
        PreparedStatement ps=con.prepareStatement("select * from user_register");
        ResultSet rs=ps.executeQuery();
        List data=new ArrayList();
        while(rs.next()){
        List row=new ArrayList();
        row.add(rs.getInt("user_id"));
        row.add(rs.getString("name"));
        row.add(rs.getLong("phone"));
        row.add(rs.getString("email"));
        row.add(rs.getString("password"));
        data.add(row);
        }
        List one=new ArrayList();
        for(int i=0;i<=4;i++){
        one=(List)data.get(i);
        /*response.setContentType("text/html");
        response.getWriter().println("<html><head><style>table, th, td {border:solid;}"
                + "table{border-collapse:collapse;}</style></head>"
                + "<body><center>");
        response.getWriter().println("<br><br><h1>Details</h1>"
                + "<table style='text-align:center'><tr><th>User Id</th><th>Name</th><th>Phone No</th><th>E-mail</th><th>Password</th></tr>"
                + "<tr><td><input type=\"text\" readonly>"+one.get(0)+"</td"
                + "<tr><td><input type=\"text\" readonly>"+one.get(1)+"</td>");
        response.getWriter().println("</center></body></html>");*/
        System.out.println(one.get(1));
        System.out.println(data.get(0));
        } 
        }
        catch(Exception e){
        e.printStackTrace();
        }
}
}