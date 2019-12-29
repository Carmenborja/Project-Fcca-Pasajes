package util;


import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/FCCA";
    static String user="root";
    static String pass="12345678";
    
    
    public Connection conexion(){
        Connection con = null;
        try {
            Class.forName(driver);
            con=DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
            
        }
        return con;
    }
    
    
}
