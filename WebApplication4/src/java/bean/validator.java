package bean;

import java.sql.*;  
public class validator {  
  
public static Boolean validate(User u) throws Exception{  
boolean status=false; 
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql:"
        + "//localhost:3306/userpassprac?useSSL=false","root","root");  
              
PreparedStatement ps=con.prepareStatement(  
    "select * from users where username=? and passwd=?");  
  
ps.setString(1,u.getUser());
ps.setString(2,u.getPass());  
              
ResultSet rs=ps.executeQuery();  
status=rs.next(); 
return status; 
  
}  
}  