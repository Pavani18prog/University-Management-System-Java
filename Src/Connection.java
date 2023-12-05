package university.management.system;

import java.sql.*;

public class Connection {
    java.sql.Connection c;
    Statement s;
    public Connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "12345");
            s=c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
