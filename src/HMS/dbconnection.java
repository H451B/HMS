
package HMS;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbconnection {
    
    dbconnection(){}
    
    private static ResultSet rs;
    private static Connection con;
    
    public static Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hmsdb","root","");
            System.out.println("MySQL Connection established");
            
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;            
    }
    
    
    public static ResultSet getresult(String sql){
        
        getConnection();
        try {           
            Statement ps = con.createStatement();
            rs = ps.executeQuery(sql);
            
            System.out.println("Resultset is ready!");
            
        } catch (SQLException ex) {
            Logger.getLogger(dbconnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection Failed!");
        }
        
        return rs;
        
    }
    
  
}
