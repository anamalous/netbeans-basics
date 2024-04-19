/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stuff;
import java.sql.*;

/**
 *
 * @author anany
 */
public class validate {
 
    public static int validation(userbean b){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice?useSSL=false","root","root");
            
            PreparedStatement ps=conn.prepareStatement("select passw from login where user=?");
            ps.setString(1,b.user);
            ResultSet rs=ps.executeQuery();
            
            rs.next();
            if(rs.getString(1).equals(b.pass))
                return 0;
            else
                return 1;
        }catch(Exception e){
            System.out.println(e);
            return 2;
    }
        }
        
}
