
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/* @author PedroxVA */
public class ProductoData {
    private Connection con=null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
    ///----------------------------------------------------------------------------------------------------//
    //Método para agregar un producto-  2;
    public void altaProducto(Producto producto){
        String sql = "INSERT INTO producto(categoria, nombreProducto, marca, modelo, descripcion, precioActual, stock, estado)"
                + "VALUES (? ,? ,? ,? ,? ,? ,? ,? )";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getCategoria());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getMarca());
            ps.setString(4, producto.getModelo());
            ps.setString(5, producto.getDescripcion());
            ps.setDouble(6, producto.getPrecioActual());
            ps.setInt(7, producto.getStock());
            ps.setBoolean(8, producto.getActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                producto.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se ha ingresado el producto exitosamente.");
            } 
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto");
        }
    }
    // 1+
    //Método para eliminar un producto - 3;
    public void bajaProductoPorID(int idProducto){
        String sql = "UPDATE producto set estado= 0 WHERE idProducto = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorNombre(String nombre){
        String sql = "UPDATE producto set estado= 0 WHERE nombreProducto = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorCategoria(String categoria){
        String sql = "UPDATE producto set estado= 0 WHERE categoria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorModelo(String modelo){
        String sql = "UPDATE producto set estado= 0 WHERE modelo = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modelo);
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    //Método para modificar un producto - 1;
    public void modificarProducto(Producto producto){
        String sql = "UPDATE producto SET "
                + "categoria= ?,nombreProducto= ?,marca= ?, modelo= ?, "
                + "descripcion= ?, precioActual= ?, stock= ? WHERE idProducto = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getCategoria());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getMarca());
            ps.setString(4, producto.getModelo());
            ps.setString(5, producto.getDescripcion());
            ps.setDouble(6, producto.getPrecioActual());
            ps.setInt(7, producto.getStock());
            ps.setInt(8, producto.getIdProducto());
            
            int exito = ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto modificado con exito.");
            }else{
                JOptionPane.showMessageDialog(null, "error");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
        }
    }
    
    //Métodos de busqueda de productos - 1;
    public void buscarProductoPorFechaDeVenta(LocalDate fechaVenta){
        String sql= "";
    }
}
