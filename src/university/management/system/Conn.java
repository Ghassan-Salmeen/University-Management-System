package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            //This line loads the MySQL JDBC driver. JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // establishes a connection to a MySQL database located at localhost on port 3306. It uses the database named universitymanagementsystem, and it authenticates using the username "root" and the password "password".
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitymanagementsystem", "root", "password");
            s = c.createStatement();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

