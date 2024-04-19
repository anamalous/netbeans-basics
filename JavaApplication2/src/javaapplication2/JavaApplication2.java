import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class JavaApplication2 implements ActionListener{
    JFrame f;JTextField tf;
    
    JavaApplication2(){
        f=new JFrame("form window");
        f.getContentPane().setBackground(new Color(100,200,10));
        f.setSize(new Dimension(600,500));
        f.setLocation(new Point(20,20));
        
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("File");
        JMenuItem mi1=new JMenuItem("new");
        m1.add(mi1);
        JMenuItem mi2=new JMenuItem("open");
        m1.add(mi2);
        
        JMenu m2=new JMenu("Edit");
        JMenuItem mi3=new JMenuItem("cut");
        m2.add(mi3);
        JMenuItem mi4=new JMenuItem("copy");
        m2.add(mi4);
        
        mb.add(m1);
        mb.add(m2);
        f.setJMenuBar(mb);
        
        JTabbedPane tb=new JTabbedPane();
        JPanel p1=new JPanel();
        p1.setLayout(null);
        tb.add(p1,"main");
        JPanel p2=new JPanel();
        tb.add(p2,"other");
        f.add(tb);
        JOptionPane op=new JOptionPane();
        tb.add(op);
        
        JLabel l=new JLabel("name:");
        l.setBounds(40,100,100,40);
        p1.add(l);
        
        tf=new JTextField();
        tf.setBounds(160,100,100,40);
        p1.add(tf);
        
        JButton b=new JButton("submit");
        b.setBounds(60,150,100,30);
        b.addActionListener(this);
        p1.add(b);
        
        f.setVisible(true);
    }
    public static void main(String args[]){
        new JavaApplication2();
    }
    
    public void actionPerformed(ActionEvent e){
        String s=tf.getText();
        f.dispose();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/print1?useSSL=false","root","root");
            PreparedStatement ps=conn.prepareStatement("insert into stuff values(?)");
            ps.setString(1,s);
            ps.executeUpdate();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        JFrame f1=new JFrame(s);
        f1.setSize(new Dimension(200,100));
        f1.setVisible(true);
    }
}