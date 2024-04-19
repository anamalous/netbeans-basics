/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.*;
import static java.sql.ResultSet.CONCUR_UPDATABLE;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
     
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice1?useSSL=false","root","root");
        /*
        Statement s=conn.createStatement();
        s.execute("create table t11(id int primary key,name varchar(10))");
        */
        Statement s1=conn.createStatement();
        conn.setAutoCommit(false);
        s1.addBatch("insert into t11 values(4,'ana')");
        s1.addBatch("insert into t11 values(2,'var')");
        s1.addBatch("insert into t11 values(3,'hannah')");
        s1.executeBatch();
        PreparedStatement ps=conn.prepareStatement("select * from t11 where id=?");
        ps.setInt(1,3);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(2));
        }
        
        Statement s2=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        
        ResultSet rs1=s2.executeQuery("select * from t11");
        int i=1;
        while(rs1.isLast()==false){
            rs1.absolute(i);
            i++;
            System.out.println(rs1.getString(2));
        }
        
        rs1.absolute(1);
        rs1.updateString(2, "vara");
        rs1.updateRow();
        
        rs1.beforeFirst();
        while(rs1.next())
            System.out.println(rs1.getString(2));
    }
    
}
