package employee;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ViewEmployee implements ActionListener  {
        JFrame jf;
        JLabel l3,l1,l2;
        JButton jb1,jb2;
        JTextField jtf;
    public ViewEmployee() {
        jf = new JFrame("View Employee");
        jf.setLayout(null);
        jf.setBackground(Color.white);
        
        l1 = new JLabel("");
        l1.setBounds(0, 0,500,270);
        l1.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        l1.setIcon(img);   
        
         l2 = new JLabel("Employee Id");
         l2.setBounds(40,60,250,30);
         l2.setFont(new Font("serif",Font.BOLD,30));
         l2.setForeground(Color.white);
         l1.add(l2);
         jf.add(l1);
         
         jtf = new JTextField();
         jtf.setBounds(240,60,220,30);
         jtf.setFont(new Font("serif",Font.BOLD,20));
         l1.add(jtf);
                 
         jb1= new JButton("Submit");
         jb1.setBounds(240,150,100,30);
         jb1.setBackground(Color.black);
         jb1.setForeground(Color.white);
         jb1.addActionListener(this);
         l1.add(jb1);
         
         jb2= new JButton("Cancle");
         jb2.setBounds(360,150,100,30);
         jb2.setBackground(Color.black);
         jb2.setForeground(Color.white);
         jb2.addActionListener(this);
         l1.add(jb2);
         
         jf.setVisible(true);
         jf.setLocation(450,250);
         jf.setSize(500,270);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.jb1){
            jf.setVisible(false);
            Print_data p1 = new Print_data(jtf.getText());
        }
        else if(ae.getSource() == this.jb2){
            jf.setVisible(false);
            new details();
        }
    }
    
    public static void main(String[] args) {
        ViewEmployee obj = new ViewEmployee();
    }
    
}
