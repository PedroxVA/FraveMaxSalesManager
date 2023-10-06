
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Venta;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/* @author PedroxVA */
public class VentaData {
    private Connection con = null;
    private DetalleVentaData deVenData = null;

    public VentaData() {
        con = Conexion.getConexion(); 
        deVenData = new DetalleVentaData();
    }
    ///----------------------------------------------------------------------------------------------------//
    //Método para agregar un producto-  1;
    public void altaVenta(Venta venta){
        String sql = "INSERT INTO venta(idCliente, fechaVenta)"
                + "VALUES (? ,? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getIdCliente());
            ps.setDate(2,Date.valueOf(venta.getFechaVenta()));
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                venta.setIdVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha registrado la venta exitosamente.");
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta");
        }
    }

    //Método para eliminar un producto - 1;    
    public void bajaVentaPorID(int idVenta){
        int result = JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar esta Venta? ¡Esto eliminará todos los DetallesVenta relacionados!");
        
        if(result==1){
            deVenData.bajaDetalleVentaPorIdVenta(idVenta);
            
            String sql = "DELETE * FROM venta WHERE idVenta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVenta);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "Venta eliminada del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Venta no encontrada.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        }
        
    }   
    
    public void bajaVentaPorIdCliente(int idCliente){
            deVenData.bajaDetalleVentaPorIdCliente(idCliente);
            
            String sql = "DELETE * FROM venta WHERE idCliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            int filasEliminadas = ps.executeUpdate();
            
            if(filasEliminadas>=1){
                JOptionPane.showMessageDialog(null, "Ventas eliminadas del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Ventas no encontradas.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla venta.");
        }
        
        
    }  
    //Método para modificar un producto - 1;
    public void modificarVenta(Venta Venta){
        String sql = "UPDATE venta SET "
                + "idCliente= ?,fechaVenta= ? "
                + "WHERE idVenta = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, Venta.getIdCliente());
            ps.setDate(2, Date.valueOf(Venta.getFechaVenta()));
            ps.setInt(3, Venta.getIdVenta());

            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Venta modificada con exito.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al modificar");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
        //Métodos de busqueda de productos - 1;
    public Venta buscarVentaPorId(int id){
        Venta venta = null;
        
        String sql = "SELECT * FROM venta WHERE venta.idVenta = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                int idCliente = rs.getInt("idCliente");
                LocalDate fechaVenta = rs.getDate("fechaVenta").toLocalDate();
                
                venta = new Venta(id, idCliente, fechaVenta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla detalleVenta)");
        }

        return venta;
    }
    
    public List<Venta> buscarVentaPorFecha(LocalDate fechaVenta){
        ArrayList<Venta> listaVentas = new ArrayList();
        
        String sql= "SELECT v.idVenta, v.idCliente, v.fechaVenta "
                + "FROM venta as v "
                + "WHERE v.fechaVenta = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaVenta));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idVenta = rs.getInt("idVenta");
                int idCliente = rs.getInt("idCliente");
                LocalDate fecha = rs.getDate("fechaVenta").toLocalDate();
                
                Venta venta = new Venta(idVenta, idCliente, fecha);
                listaVentas.add(venta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla venta)");
        }
        return listaVentas;
    }
    
    public List<Venta> buscarVentaPorCliente(int idCliente){
        ArrayList<Venta> listaVentas = new ArrayList();
        
        String sql= "SELECT v.idVenta, v.idCliente, v.fechaVenta "
                + "FROM venta as v "
                + "WHERE v.idCliente = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCliente);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int idVenta = rs.getInt("idVenta");
                int id = rs.getInt("idCliente");
                LocalDate fecha = rs.getDate("fechaVenta").toLocalDate();
                
                Venta venta = new Venta(idVenta, id, fecha);
                listaVentas.add(venta);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla venta)");
        }
        return listaVentas;
    }
}
