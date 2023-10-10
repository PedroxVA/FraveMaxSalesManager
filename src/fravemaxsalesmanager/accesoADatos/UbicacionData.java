
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Ubicacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/* @author PedroxVA */
public class UbicacionData {
    private Connection con = null;
    
    public UbicacionData(){
        this.con = Conexion.getConexion();
    }
    ///----------------------------------------------------------------------------------------------------//
    //Método para agregar una ubicacion-  1;
    public void altaUbicacion(Ubicacion ubicacion){
        String sql = "INSERT INTO ubicacion(direccion, localidad, codigoPostal, provincia, pais)"
                + "VALUES (? ,? ,? ,? ,? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, ubicacion.getDireccion());
            ps.setString(2, ubicacion.getLocalidad());
            ps.setString(3, ubicacion.getCodigoPostal());
            ps.setString(4, ubicacion.getProvincia());
            ps.setString(5, ubicacion.getPais());

            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                ubicacion.setIdUbicacion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha registrado la ubicación exitosamente.");
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ubicacion");
        }
    }
    
    //Método para eliminar un ubicacion - 1;   
    public void bajaUbicacionPorID(int idUbicacion){
        String sql = "DELETE FROM ubicacion WHERE idUbicacion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idUbicacion);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "Ubicacion Eliminada del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ubicacion.");
        }
    }   
     
    //Método para modificar un ubicacion - 1;
    public void modificarUbicacion(Ubicacion ubicacion){
        String sql = "UPDATE ubicacion "
                + "SET direccion= ?,localidad= ?,codigoPostal= ?, "
                + "provincia= ?, pais= ? "
                + "WHERE idUbicacion = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ubicacion.getDireccion());
            ps.setString(2, ubicacion.getLocalidad());
            ps.setString(3, ubicacion.getCodigoPostal());
            ps.setString(4, ubicacion.getProvincia());
            ps.setString(5, ubicacion.getPais());
            ps.setInt(6, ubicacion.getIdUbicacion());
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Ubicacion modificada con exito.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos(tabla ubicacion)");
        }
    }
    
    //Métodos de busqueda de ubicaciones - 1;
    public Ubicacion buscarUbicacionPorId(int id){
        Ubicacion ubicacion = new Ubicacion();
        
        String sql = "SELECT * FROM ubicacion WHERE idUbicacion = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idUbicacion = rs.getInt("idUbicacion");
                String direccion = rs.getString("direccion");
                String localidad = rs.getString("localidad");
                String codigoPostal = rs.getString("codigoPostal");
                String provincia = rs.getString("provincia");
                String pais = rs.getString("pais");
                
                ubicacion = new Ubicacion(idUbicacion, direccion, localidad, codigoPostal, provincia, pais);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla Ubicacion)");
        }

        return ubicacion;
    }

}
