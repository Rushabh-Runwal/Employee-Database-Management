package employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class details implements ActionListener{
     public JFrame jf;
     JLabel l1,l2;
     JButton b1,b2,b3,b4;
     public details() {
         jf = new JFrame("MENU");
         jf.setLayout(null);
         
         l2 = new JLabel();
         l2.setLayout(null);
         l2.setIcon(new ImageIcon(ClassLoader.getSystemResource("icons/details.jpg")));
         l2.setBounds(0,0,700,500);
         jf.add(l2);
         
         l1 = new JLabel("Employee Database");
         l1.setFont(new Font("serif",Font.BOLD,25));
         l1.setBounds(420,20,300,40);
         l1.setForeground(Color.white);
         l2.add(l1);
         
         b1 = new JButton("Add Employee");
         b1.setFont(new Font("serif",Font.BOLD,16));
         b1.setBounds(420,80,200,40);
         b1.addActionListener(this);
         l2.add(b1);
         
         b2 = new JButton("View Employee");
         b2.setFont(new Font("serif",Font.BOLD,16));
         b2.setBounds(420,130,200,40);
         b2.addActionListener(this);
         l2.add(b2);
         
         b3 = new JButton("Remove Employee");
         b3.setFont(new Font("serif",Font.BOLD,16));
         b3.setBounds(420,180,200,40);
         b3.addActionListener(this);
         l2.add(b3);
         
         b4 = new JButton("Update Employee");
         b4.setFont(new Font("serif",Font.BOLD,16));
         b4.setBounds(420,230,200,40);
         b4.addActionListener(this);
         l2.add(b4);
         
         jf.setVisible(true);
         jf.setSize(700,500);
         jf.setLocation(450,200);
         
         
     }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
           if(ae.getSource()==b1){
               jf.setVisible(false);
               new AddEmployee();
           }
           if(ae.getSource()==b2){
               jf.setVisible(false);
               new ViewEmployee();
           }
           if(ae.getSource()==b3){
               jf.setVisible(false);
               new RemoveEmployee();
           }
           if(ae.getSource()==b4){
               jf.setVisible(false);
               new ModifyEmployee1();
           }
    }
        public static void main(String[] args) {
            details dobj = new details();
    }
}
