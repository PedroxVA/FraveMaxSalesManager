
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteData {
    private DetalleVentaData deVenData = new DetalleVentaData();
    private VentaData venData = new VentaData();
    private Connection connection;

    public ClienteData() {
        this.connection = Conexion.getConexion();
    }

    // Método para insertar un cliente en la base de datos
    public void altaCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (apellido, nombre, telefono, email, cuil, idUbicacion) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getApellido());
            statement.setString(2, cliente.getNombre());
            statement.setString(3, cliente.getTelef());
            statement.setString(4, cliente.getEmail());
            statement.setString(5, cliente.getCuil());
            statement.setInt(6, cliente.getUbicacion().getIdUbicacion());
            statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Método para actualizar un cliente en la base de datos
    public void modificarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE Cliente SET apellido=?, nombre=?, telef=?, email=?, cuil=? WHERE idCliente=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getApellido());
            statement.setString(2, cliente.getNombre());
            //statement.setString(3, cliente.getTelef());
            //statement.setString(4, cliente.getEmail());
            statement.setString(5, cliente.getCuil());
            statement.setInt(6, cliente.getIdCliente());
            statement.executeUpdate();
        }
    }

    // Método para eliminar un cliente de la base de datos
    public void eliminarCliente(int clienteId) {
        int resultado = JOptionPane.showConfirmDialog(null, "¿Estas seguro?¡Se eliminaran todas las ventas y detallesVentas relacionadas!");
        if(resultado==1){
            deVenData.bajaDetalleVentaPorIdCliente(clienteId);
            venData.bajaVentaPorIdCliente(clienteId);
            
            
            String sql = "DELETE FROM Cliente WHERE idCliente=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, clienteId);
            
            int filasEliminadas = statement.executeUpdate();
            if(filasEliminadas!=0){
                JOptionPane.showMessageDialog(null, "El cliente se ha eliminado correctamente.");
            }
        }   catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error al cargar la tabla cliente");
            }
        }
        
        
        
    }

    // Método para obtener un cliente por su ID
    public Cliente obtenerClientePorId(int clienteId) {
        
        String sql = "SELECT * FROM Cliente WHERE idCliente=?";
      
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, clienteId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(resultSet.getInt("idCliente"));
                    cliente.setApellido(resultSet.getString("apellido"));
                    cliente.setNombre(resultSet.getString("nombre"));
                    cliente.setTelef(resultSet.getString("telefono"));
                    cliente.setEmail(resultSet.getString("email"));
                    cliente.setCuil(resultSet.getString("cuil"));
                    return cliente;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
        return null;
    }

    // Método para obtener todos los clientes
    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM Cliente";
        try (PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                
                cliente.setIdCliente(resultSet.getInt("idCliente"));
                cliente.setApellido(resultSet.getString("apellido"));
                cliente.setNombre(resultSet.getString("nombre"));
                cliente.setTelef(resultSet.getString("telef"));
                cliente.setEmail(resultSet.getString("email"));
                cliente.setCuil(resultSet.getString("cuil"));
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cliente");
        }
        return clientes;
    }
}
