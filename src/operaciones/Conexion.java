
package operaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static String bd = "balanza_los_rusos";
    private static String user = "root";
    private static String pass = "";
    private static String url = "jdbc:mysql://localhost/"+bd;
    
    public Connection getConexion(){
        
        Connection c = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(url, user, pass);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error en conexion" + e.getMessage());
        
        }
        return c;
    }
    
}
