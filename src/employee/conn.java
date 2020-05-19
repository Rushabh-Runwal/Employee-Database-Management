package employee;

import java.sql.*;


public class conn {
           public Connection c;
           public Statement s;
    public conn() {
        try{	
	Class.forName("com.mysql.jdbc.Driver");
	c = DriverManager.getConnection("jdbc:mysql://localhost/login","root","admin");
        s = c.createStatement();
        String q = "create table if not exists employee(name varchar(40),Age int(3),dob varchar(10),Address varchar(40),Email varchar(30),EmployeeId int(10) primary key,jobPost varchar(20),phoneNo varchar(10),Education varchar(10),aadhar varchar(12) );";      
        s.executeUpdate(q);
        }
        catch(Exception E){
        E.printStackTrace();
        }
    }
}
