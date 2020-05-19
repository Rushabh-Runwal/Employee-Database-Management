package employee;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class RemoveEmployee implements ActionListener{
        JFrame jf;
        JLabel l1,l2,l3,l4;
        JButton b1,b2,b3,b4;
        JTextField t1;
    public RemoveEmployee() {
                jf = new JFrame("Remove Employee Data");
                jf.setBackground(Color.white);
                jf.setLayout(null);
               
                l1 = new JLabel();
                l1.setBounds(0,0,500,500);
                l1.setLayout(null);
                ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/remove.jpg"));
                l1.setIcon(img);
                jf.add(l1);
                
        l2 = new JLabel("Employee Id");
        l2.setBounds(40,60,250,30);
        l2.setFont(new Font("serif",Font.BOLD,30));
        l2.setForeground(Color.white);
        l1.add(l2);
        jf.add(l1);
         
        t1 = new JTextField();
        t1.setBounds(240,60,220,30);
        t1.setFont(new Font("serif",Font.BOLD,20));
        l1.add(t1);
                 
        b1= new JButton("Search");
        b1.setBounds(240,120,100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        l1.add(b1);
         
        b2= new JButton("Back");
        b2.setBounds(360,120,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        l1.add(b2);
        

        
        l3 = new JLabel("Name :");
        l3.setBounds(50,200,250,30);
        l3.setFont(new Font("serif",Font.BOLD,20));
        l1.add(l3);
                    
        l4 = new JLabel();
        l4.setBounds(200,200,250,30);
        l4.setFont(new Font("serif",Font.BOLD,20));
        l1.add(l4);
        
        b3= new JButton("Delete");
        b3.setBounds(120,270,100,30);
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        l1.add(b3);
         
        b4= new JButton("Back");
        b4.setBounds(300,270,100,30);
        b4.setBackground(Color.black);
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        l1.add(b4);
        
        b3.setVisible(false);
        b4.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        
        
         jf.setVisible(true);
         jf.setSize(500,500);    
         jf.setLocation(450,120);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    if(ae.getSource() == b1){
              try {
        conn con = new conn();
        ResultSet rs = con.s.executeQuery("select * from employee where EmployeeId = '"+t1.getText()+"';");
        int fnd =0;
        if(rs.next()){
        l4.setText(rs.getString("name"));
        b3.setVisible(true);
        b4.setVisible(true);
        l3.setVisible(true);
        l4.setVisible(true);
        fnd =1;
        }
        if(fnd ==0){
            JOptionPane.showMessageDialog(null,"Invalid id");
        }
              } catch (SQLException ex) {
            System.out.print(ex);
        }   
    }//b1
    
    if(ae.getSource() == b3){
        try {        
          conn con = new conn();
          con.s.executeUpdate("delete from employee where EmployeeId = '"+t1.getText()+"';");
          JOptionPane.showMessageDialog(null,"Deletion Successful");

        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }//b3
    
    if(ae.getSource() == b2){
        jf.setVisible(false);
        new details();
    }
    
    if(ae.getSource() == b4){
        b3.setVisible(false);
        b4.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        
    }
    
    
    }
    public static void main(String[] args) {
       RemoveEmployee obj = new RemoveEmployee(); 
    }
}
