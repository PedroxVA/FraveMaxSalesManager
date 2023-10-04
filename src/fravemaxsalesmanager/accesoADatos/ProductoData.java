
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Producto;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
            ps.setBoolean(8, true);
            
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
    
    public void altaProductoLogica(Producto producto){
        String sql = "UPDATE producto set estado = 1 WHERE idProducto = ? AND estado = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getIdProducto());
            int exito = ps.executeUpdate();
            
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Producto Agregado al catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }  
    }
    //Método para eliminar un producto - 3;
    public void bajaProductoPorID(int idProducto){
        String sql = "UPDATE producto set estado= 0 WHERE idProducto = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int filasCambiadas = ps.executeUpdate();
            
            if(filasCambiadas>=1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorNombre(String nombre){
        String sql = "UPDATE producto set estado= 0 WHERE nombreProducto = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            int filasCambiadas = ps.executeUpdate();
            
            if(filasCambiadas>=1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorCategoria(String categoria){
        String sql = "UPDATE producto set estado = 0 WHERE categoria = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, categoria);
            int filasCambiadas = ps.executeUpdate();
            
            if(filasCambiadas>=1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }else{ 
                JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
        }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto.");
        }
    }
    
    public void bajaProductoPorModelo(String modelo){
        String sql = "UPDATE producto set estado = 0 WHERE modelo = ? AND estado = 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modelo);
            int filasCambiadas = ps.executeUpdate();
            
            if(filasCambiadas>=1){
                JOptionPane.showMessageDialog(null, "Producto Eliminado del catálogo.");
            }else{ JOptionPane.showMessageDialog(null, "Elemento no encontrado.");
            
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
    public Producto buscarProductoPorId(int id){
        Producto producto = null;
        
        String sql = "SELECT * FROM producto WHERE producto.idProducto = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                String categoria = rs.getString("categoria");
                String nombreProducto = rs.getString("nombreProducto");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String descripcion = rs.getString("descripcion");
                Double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                
                producto = new Producto(categoria, nombreProducto, marca, modelo, descripcion, precioActual, stock, true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla producto)");
        }

        return producto;
    }
    
    public List<Producto> buscarProductoPorFechaDeVenta(LocalDate fechaVenta){
        ArrayList<Producto> listaProductos = new ArrayList();
        
        String sql= "SELECT p.nombreProducto "
                + "FROM producto as p "
                + "JOIN detalleventa AS dv ON (dv.idProducto=p.idProducto) "
                + "JOIN venta AS v ON (dv.idVenta=v.idVenta) "
                + "WHERE v.fechaVenta = ?;";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaVenta));
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                String categoria = rs.getString("categoria");
                String nombreProducto = rs.getString("nombreProducto");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String descripcion = rs.getString("descripcion");
                Double precioActual = rs.getDouble("precioActual");
                int stock = rs.getInt("stock");
                
                Producto producto = new Producto(categoria, nombreProducto, marca, modelo, descripcion, precioActual, stock, true);
                listaProductos.add(producto);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la Base de Datos(Tabla producto)");
        }
        return listaProductos;
    }
}
