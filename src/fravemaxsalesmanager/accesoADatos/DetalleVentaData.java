
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/* @author PedroxVA */
public class DetalleVentaData {
    private Connection con = null;

    public DetalleVentaData() {
        con = Conexion.getConexion();
    }
    ///----------------------------------------------------------------------------------------------------//
    //Método para agregar un producto-  1;   
    public void altaDetalleVenta(DetalleVenta DetalleVenta){
        String sql = "INSERT INTO detalleventa(cantidad, idVenta, precioVenta, idProducto)"
                + "VALUES (? ,? , ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, DetalleVenta.getCantidad());
            ps.setInt(2, DetalleVenta.getIdVenta());
            ps.setDouble(3, DetalleVenta.getPrecioVenta());
            ps.setInt(4, DetalleVenta.getIdProducto());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                DetalleVenta.setIdDetalleVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha registrado el DetalleVenta exitosamente.");
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalleventa");
        }
    }
    
    //Método para eliminar un producto - 3;    
    public void bajaDetalleVentaPorID(int idDetalleVenta){
        String sql = "DELETE * FROM detalleventa WHERE idDetalleVenta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDetalleVenta);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalleventa.");
        }
    }   
    
    public void bajaDetalleVentaPorIdVenta(int idVenta){
        String sql = "DELETE * FROM detalleventa WHERE idVenta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVenta);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "DetallesVentas eliminados del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "DetallesVentas no encontrados.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalleventa.");
        }
    }  
    
    public void bajaDetalleVentaPorIdCliente(int idCliente){
        String sql = "DELETE * FROM detalleventa WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "DetallesVentas eliminados del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "DetallesVentas no encontrados.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla detalleventa.");
        }
    }  
    
    //Método para modificar un producto - 1;  
    public void modificarDetalleVenta(DetalleVenta detalleVenta){
        String sql = "UPDATE detalleVenta SET "
                + "cantidad= ?,idVenta= ?,precioVenta= ?, idProducto= ? "
                + "WHERE idDetalleVenta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, detalleVenta.getCantidad());
            ps.setInt(2, detalleVenta.getIdVenta());
            ps.setDouble(3, detalleVenta.getPrecioVenta());
            ps.setInt(4, detalleVenta.getIdProducto());
            ps.setInt(5, detalleVenta.getIdDetalleVenta());

            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "DetalleVenta modificado con exito.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
    //Métodos de busqueda de productos - 1;
    public DetalleVenta buscarDetalleVentaPorId(int id){
        DetalleVenta detalleVenta = null;
        
        String sql = "SELECT * FROM detalleVenta WHERE detalleVenta.idDetalleVenta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int cantidad = rs.getInt("cantidad");
                int idVenta = rs.getInt("idVenta");
                int precioVenta = rs.getInt("precioVenta");
                int idProducto = rs.getInt("idProducto");
                
                detalleVenta = new DetalleVenta(id, cantidad, idVenta, precioVenta, idProducto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla detalleVenta)");
        }

        return detalleVenta;
    }

}
