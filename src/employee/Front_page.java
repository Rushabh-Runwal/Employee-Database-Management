package employee;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;

public class Front_page implements ActionListener{
    JFrame f;
    JLabel li;
    JButton jb;

    public Front_page() throws IOException {
        f = new JFrame("EMS");
        f.setBackground(Color.white);
        f.setLayout(null);
         f.getContentPane().setBackground(Color.white); 
        ImageIcon Ii =  new ImageIcon(ClassLoader.getSystemResource("icons/view.jpg"));
        Image I2 = Ii.getImage().getScaledInstance(800,500,Image.SCALE_DEFAULT);
        ImageIcon I3 = new ImageIcon(I2);
        JLabel li = new JLabel(I3);
        
        li.setBounds(0,100,800,500);
        f.add(li);
        
        jb = new JButton("Click here to Continue");
        jb.setBackground(Color.black);
        jb.setForeground(Color.white);
    
        jb.setBounds(400,300,300,70);
        jb.addActionListener(this);
      
        li = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        li.setFont(new Font("serif",Font.BOLD,30));
        li.setBounds(100,0,800,100);
        li.setBackground(Color.blue);
        
        f.add(jb);
        f.add(li);

        f.setVisible(true);
        f.setSize(800,600);
        f.setLocation(300,50);
    }
       
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==jb){
            
           new login(); // calling login class constructor
           f.setVisible(false);
        }
    }
    public static void main(String[] args) throws IOException {
        Front_page fp = new Front_page();
    }
}