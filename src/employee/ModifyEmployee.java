package employee;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class ModifyEmployee implements ActionListener {
        JFrame jf;
        JLabel title,name,age,adr,email,jobpt,empl_id,dob,phone,ed,adhr,l1,l2,l3;
        JTextField name1,age1,adr1,email1,jobpt1,empl_id1,dob1,phone1,edu1,adhr1;
        JButton jb1,jb2;
        String empl_iD;
    public ModifyEmployee(String empl_Id) {
        empl_iD = empl_Id;
        conn con = new conn();
        ResultSet rs;
            try {
                rs = con.s.executeQuery("select * from employee where EmployeeId = '"+empl_Id+"';");

        int fnd =0;
        if(rs.next()){
        //l4.setText(rs.getString("name"));        
         jf = new JFrame("Modify Employee");
         jf.setLayout(null);
         jf.setBackground(Color.white);
         
         l1 = new JLabel();
         l1.setBounds(0,0,900,700);
         l1.setLayout(null);
         ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/add_employee.jpg"));
         l1.setIcon(img);   
         
         title = new JLabel("Modify Employee Details");
         title.setBounds(320,30,500,50);
         title.setFont(new Font("serif",Font.BOLD,28));
         title.setForeground(Color.BLACK);
         l1.add(title);
         jf.add(l1);
         
         name = new JLabel("Name :");
         name.setBounds(50,150,100,30);
         name.setFont(new Font("serif",Font.BOLD,20));
         l1.add(name);
         
         name1 = new JTextField(rs.getString("name"));
         name1.setBounds(200,150,150,30);
         l1.add(name1);
         
         empl_id = new JLabel("Employee Id :");
         empl_id.setBounds(400,150,200,30);
         empl_id.setFont(new Font("serif",Font.BOLD,20));
         l1.add(empl_id);
         
         empl_id1 = new JTextField(rs.getString("EmployeeId"));
         empl_id1.setBounds(600,150,150,30);
         l1.add(empl_id1);
         
         age = new JLabel("Age :");
         age.setBounds(50,200,100,30);
         age.setFont(new Font("serif",Font.BOLD,20));
         l1.add(age);
         
         age1 = new JTextField(rs.getString("Age"));
         age1.setBounds(200,200,150,30);
         l1.add(age1);
         
         this.dob = new JLabel("DOB :");
         dob.setBounds(400,200,200,30);
         dob.setFont(new Font("serif",Font.BOLD,20));
         l1.add(dob);
         
         dob1 = new JTextField(rs.getString("dob"));
         dob1.setBounds(600,200,150,30);
         l1.add(dob1);
            
         this.adr = new JLabel("Address :");
         adr.setBounds(50,250,100,30);
         adr.setFont(new Font("serif",Font.BOLD,20));
         l1.add(adr);
         
         adr1 = new JTextField(rs.getString("Address"));
         adr1.setBounds(200,250,150,30);
         l1.add(adr1);
         
         this.phone = new JLabel("Phone no. :");
         phone.setBounds(400,250,100,30);
         phone.setFont(new Font("serif",Font.BOLD,20));
         l1.add(phone);
         
         phone1 = new JTextField(rs.getString("phoneNo"));
         phone1.setBounds(600,250,150,30);
         l1.add(phone1);
         
         this.email = new JLabel("Email id :");
         email.setBounds(50,300,150,30);
         email.setFont(new Font("serif",Font.BOLD,20));
         l1.add(email);
         
         email1 = new JTextField(rs.getString("Email"));
         email1.setBounds(200,300,150,30);
         l1.add(email1);
         
         this.ed = new JLabel("Education :");
         ed.setBounds(400,300,100,30);
         ed.setFont(new Font("serif",Font.BOLD,20));
         l1.add(ed);
         
         edu1 = new JTextField(rs.getString("Education"));
         edu1.setBounds(600,300,150,30);
         l1.add(edu1);
         
         this.jobpt = new JLabel("JobPost :");
         jobpt.setBounds(50,350,100,30);
         jobpt.setFont(new Font("serif",Font.BOLD,20));
         l1.add(jobpt);
                  
         jobpt1 = new JTextField(rs.getString("jobPost"));
         jobpt1.setBounds(200,350,150,30);
         l1.add(jobpt1);
         
         adhr = new JLabel("Adhaar No. :");
         adhr.setBounds(400,350,100,30);
         adhr.setFont(new Font("serif",Font.BOLD,20));
         l1.add(adhr);
         
         adhr1 = new JTextField(rs.getString("aadhar"));
         adhr1.setBounds(600,350,150,30);
         l1.add(adhr1);

         l2 = new JLabel();
         l2.setBounds(200,450,250,200);
         l1.add(l2);
         
         l2 = new JLabel();
         l2.setBounds(600,450,250,200);
         l1.add(l2);
         
         jb1= new JButton("Modify");
         jb1.setBounds(250,550,150,40);
         jb1.setBackground(Color.black);
         jb1.setForeground(Color.white);
         jb1.addActionListener(this);
         l1.add(jb1);
         
         jb2= new JButton("Back");
         jb2.setBounds(450,550,150,40);
         jb2.setBackground(Color.black);
         jb2.setForeground(Color.white);
         jb2.addActionListener(this);
         l1.add(jb2);

         
        jf.setVisible(true);
        jf.setSize(900,700);
        jf.setLocation(250,25);
        
        }           
            } catch (SQLException ex) {
                Logger.getLogger(ModifyEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public ModifyEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==jb1){
            //"create table if not exists employee(name varchar(40),Age int(3),dob varchar(10)
            //,Address varchar(40),Email varchar(30),EmployeeId int(10) primary key,
            //jobPost varchar(20),phoneNo int(10),Education varchar(10),aadhar varchar(12) );"; 
            
            String name2 = this.name1.getText();
            String age2 = this.age1.getText();
            String dob2 = this.dob1.getText();
            String adr2 = this.adr1.getText();
            String email2 = this.email1.getText();
            String empl_id2 = this.empl_id1.getText();
            String jobpt2 = this.jobpt1.getText();
            String phone2 = this.phone1.getText();
            String edu2 = this.edu1.getText();
            String adhr2 = this.adhr1.getText();
// ,                                                                                                                                                                                    
String q = "update employee set name = '"+name2+"',Age = '"+age2+"',dob ='"+dob2+"',Address ='"+adr2+"',Email ='"+email2+"',EmployeeId ='"+empl_id2+"',jobPost ='"+jobpt2+"',phoneNo = '"+phone2+"',Education ='"+edu2+"',aadhar ='"+adhr2+"' where EmployeeId = '"+empl_iD+"'";            
            conn con = new conn();
            try {
                con.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Data Modified Successfully");
                jf.setVisible(false);
                new details();
            } catch (SQLException ex) {
                 System.out.print(ex);
            }
        }
        else if(ae.getSource() == jb2){
            jf.setVisible(false);
            new ModifyEmployee1();
        }
    }
    
    public static void main(String[] args) {
        ModifyEmployee obj = new ModifyEmployee("1000");
    }
}
