package employee;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Print_data implements ActionListener{
        JFrame jf;
        JLabel title,name,age,adr,email,jobpt,empl_id,dob,phone,ed,adhr,l1,l2,l3,name1,age1,adr1,email1,jobpt1,empl_id1,dob1,phone1,edu1,adhr1;;
        String name2,age2,adr2,email2,jobpt2,empl_id2,dob2,phone2,edu2,adhr2;
        JButton jb1,jb2;
    public Print_data(){}
    
    public Print_data(String emplId){   
            try {
            conn con = new conn();
            ResultSet rs = con.s.executeQuery("select * from employee where EmployeeId = '"+emplId+"';");
//name (40),Age (3),dob (10),Address (40),Email (30),EmployeeId jobPost 
//,phoneNo ,Education ,aadhar );";                  
            while(rs.next()){  
              name2= rs.getString("name");
              age2= rs.getString("Age");
              dob2 = rs.getString("dob");
              adr2= rs.getString("Address");
              email2= rs.getString("Email");
              empl_id2= rs.getString("EmployeeId");
              jobpt2= rs.getString("jobPost");
              phone2= rs.getString("phoneNo");
              edu2= rs.getString("Education");
              adhr2  = rs.getString("aadhar");
            }
            
            } catch (SQLException ex) {
                ex.printStackTrace();
            }        
                        
                jf = new JFrame("Employee Data");
                jf.setBackground(Color.white);
                jf.setVisible(true);
                jf.setSize(595,642);    
                jf.setLocation(450,180);
                jf.setLayout(null);
               
                l1 = new JLabel();
                l1.setBounds(0,0,595,642);
                l1.setLayout(null);
                ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("icons/print.jpg"));
                l1.setIcon(img);
                
                title = new JLabel("Employee details");
                title.setBounds(50,10,250,30);
                title.setFont(new Font("serif",Font.BOLD,25));
                title.setForeground(Color.white);
                l1.add(title);
                jf.add(l1);
                
                empl_id = new JLabel("Employee Id :");
                empl_id.setBounds(50,70,120,30);
                empl_id.setFont(new Font("serif",Font.BOLD,20));
                l1.add(empl_id);
                        
                empl_id1 = new JLabel(empl_id2);
                empl_id1.setBounds(200,70,200,30);
                empl_id1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(empl_id1);
                
                name = new JLabel("Name :");
                name.setBounds(50,120,100,30);
                name.setFont(new Font("serif",Font.BOLD,20));
                l1.add(name);
                    
                name1 = new JLabel(this.name2);
                name1.setBounds(200,120,300,30);
                name1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(name1);
                                              
                age = new JLabel("Age :");
                age.setBounds(50,170,100,30);
                age.setFont(new Font("serif",Font.BOLD,20));
                l1.add(age);
                        
                age1 = new JLabel(age2);
                age1.setBounds(200,170,200,30);
                age1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(age1);
                        
                this.dob = new JLabel("DOB :");
                dob.setBounds(50,220,100,30);
                dob.setFont(new Font("serif",Font.BOLD,20));
                l1.add(dob);
                        
                dob1 = new JLabel(dob2);
                dob1.setBounds(200,220,200,30);
                dob1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(dob1);
                        
                this.adr = new JLabel("Address :");
                adr.setBounds(50,270,100,30);
                adr.setFont(new Font("serif",Font.BOLD,20));
                l1.add(adr);
                        
                adr1 = new JLabel(adr2);
                adr1.setBounds(200,270,300,30);
                adr1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(adr1);
                        
                this.phone = new JLabel("Phone no :");
                phone.setBounds(50,320,100,30);
                phone.setFont(new Font("serif",Font.BOLD,20));
                l1.add(phone);
                        
                phone1 = new JLabel(phone2);
                phone1.setBounds(200,320,300,30);
                phone1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(phone1);

                this.email = new JLabel("Email id :");
                email.setBounds(50,370,100,30);
                email.setFont(new Font("serif",Font.BOLD,20));
                l1.add(email);
                    
                email1 = new JLabel(email2);
                email1.setBounds(200,370,300,30);
                email1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(email1);
                
                this.ed = new JLabel("Edu. :");
                ed.setBounds(50,420,100,30);
                ed.setFont(new Font("serif",Font.BOLD,20));
                l1.add(ed);
                
                edu1 = new JLabel(edu2);
                edu1.setBounds(200,420,300,30);
                edu1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(edu1);
                    
                this.jobpt = new JLabel("JobPost :");
                jobpt.setBounds(50,470,100,30);
                jobpt.setFont(new Font("serif",Font.BOLD,20));
                l1.add(jobpt);
                        
                jobpt1 = new JLabel(jobpt2);
                jobpt1.setBounds(200,470,300,30);
                jobpt1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(jobpt1);
                        
                adhr = new JLabel("Adhaar :");
                adhr.setBounds(50,520,100,30);
                adhr.setFont(new Font("serif",Font.BOLD,20));
                l1.add(adhr);
                        
                adhr1 = new JLabel(adhr2);
                adhr1.setBounds(200,520,300,30);
                adhr1.setFont(new Font("serif",Font.BOLD,20));
                l1.add(adhr1);
                              
//                jb1= new JButton("Submit");
//                jb1.setBounds(250,550,150,40);
//                jb1.setBackground(Color.black);
//                jb1.setForeground(Color.white);
//                jb1.addActionListener(this);
//                l1.add(jb1);
//                        
                jb2= new JButton("Main Menu");
                jb2.setBounds(450,550,100,40);
                jb2.setBackground(Color.black);
                jb2.setForeground(Color.white);
                jb2.addActionListener(this);
                l1.add(jb2);
                
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == jb2){
            new details();
            jf.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        Print_data obj =  new Print_data("1000");
    }
}
