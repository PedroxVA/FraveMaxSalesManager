
package fravemaxsalesmanager.accesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* @author PedroxVA */
public class Conexion {
    //Atributos propios de la base de datos necesarios para la conexión
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="fravemaxsalesdb";//fravemaxsalesdb, nombre de la bd;
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;

    private Conexion(){}
    
    //Método para establecer una conexión con la base de datos.
    public static Connection getConexion() {

        if (connection == null) {

            try {
                //cargar el driver;
                Class.forName("org.mariadb.jdbc.Driver");
                
                //conectar a la bd;
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos");
            }
        }

        return connection;
    }
}
