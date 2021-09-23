import java.sql.*;
import javax.swing.JOptionPane; 

public class JavaConnect {
     Connection conn;
    public static Connection ConnecrDb(){
         // establish connection with the database 
        try{
            Class.forName("org.sqlite.JDBC");       
            Connection conn  = DriverManager.getConnection("jdbc:sqlite:/Users/m18-051/NetBeansProjects/Library managment system/LMS.db");          
            return conn;   
        } 
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;  
        }
        
    }
    
}
