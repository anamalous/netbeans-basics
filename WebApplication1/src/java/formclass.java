import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class formclass implements ActionListener {
    JFrame f;JLabel l;
    formclass(){
        f=new JFrame("Welcome Form");
        f.setSize(new Dimension(600,500));
        f.setContentPane(new JLabel(new ImageIcon("welcomebckgrd.jpg")));
        f.setLayout(null);
        f.setVisible(true);
        
        l=new JLabel("where to go?");
        l.setBounds(20,20,100,40);
        f.add(l);
        
        JRadioButton rb1=new JRadioButton(new ImageIcon("img29.jpg"));
        rb1.setText("London");
        rb1.setBounds(20,60,120,80);rb1.addActionListener(this);
        f.add(rb1);
        JRadioButton rb2=new JRadioButton(new ImageIcon("img30.jpg"));
        rb2.setText("Mumbai");
        rb2.setBounds(20,60,120,80);rb2.addActionListener(this);
        rb2.setBounds(150,60,120,80);
        f.add(rb2);
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);bg.add(rb2);
    }
    public void actionPerformed(ActionEvent e){
        String s=((JRadioButton)e.getSource()).getText();
        l.setText(s+"?");
    }
    public static void main(String args[]){
        new formclass();
    }
}
