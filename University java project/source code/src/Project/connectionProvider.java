
package Project;
import java.sql.*;
/**
 *


 */
public class connectionProvider {
    public static Connection getCon(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
            // URL enter ur URL from MYSQL , username , Password
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Password");
        return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
