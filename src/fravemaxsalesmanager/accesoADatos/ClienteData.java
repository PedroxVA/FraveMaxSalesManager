
package fravemaxsalesmanager.accesoADatos;

import fravemaxsalesmanager.entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteData {
    private Connection connection;

    public ClienteData(Connection connection) {
        this.connection = connection;
    }

    // Método para insertar un cliente en la base de datos
    public void altaCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO Cliente (apellido, nombre, telef, email, cuil) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cliente.getApellido());
            statement.setString(2, cliente.getNombre());
            //statement.setString(3, cliente.getTelef());
            //statement.setString(4, cliente.getEmail());
            statement.setString(5, cliente.getCuil());
            statement.executeUpdate();
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
    public void eliminarCliente(int clienteId) throws SQLException {
        String sql = "DELETE FROM Cliente WHERE idCliente=?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, clienteId);
            statement.executeUpdate();
        }
    }

    // Método para obtener un cliente por su ID
    public Cliente obtenerClientePorId(int clienteId) throws SQLException {
        
        String sql = "SELECT * FROM Cliente WHERE idCliente=?";
      
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, clienteId);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Cliente cliente = new Cliente();
                    cliente.setIdCliente(resultSet.getInt("idCliente"));
                    cliente.setApellido(resultSet.getString("apellido"));
                    cliente.setNombre(resultSet.getString("nombre"));
                   // cliente.setTelef(resultSet.getString("telef"));
                    cliente.setEmail(resultSet.getString("email"));
                    cliente.setCuil(resultSet.getString("cuil"));
                    return cliente;
                }
            }
        }
        return null;
    }

    // Método para obtener todos los clientes
    public List<Cliente> obtenerTodosLosClientes() throws SQLException {
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
        }
        return clientes;
    }
}
