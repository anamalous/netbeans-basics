package bean;

import java.sql.*;  
public class insertsignin {  
  
public static Boolean insertdata(User u) throws Exception{  
boolean status=false; 
Class.forName("com.mysql.cj.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql:"
        + "//localhost:3306/userpassprac?useSSL=false","root","root");  
              
PreparedStatement ps=con.prepareStatement(  
    "insert into users values(?,?)");  
  
ps.setString(1,u.getUser());
ps.setString(2,u.getPass());  
              
int rs=ps.executeUpdate();  
status=rs==1; 
return status; 
  
}  
}  