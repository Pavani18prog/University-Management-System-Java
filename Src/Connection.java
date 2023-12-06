package university.management.system;

import java.sql.*;

public class Connection {
    java.sql.Connection c;
    Statement s;
    public Connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c= DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "12345");//(root and 12345 are the sql name and password which will be used to sql in my system.)
            s=c.createStatement();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
