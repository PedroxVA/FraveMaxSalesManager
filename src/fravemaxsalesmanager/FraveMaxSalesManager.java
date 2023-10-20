
package fravemaxsalesmanager;

import fravemaxsalesmanager.accesoADatos.ClienteData;
import fravemaxsalesmanager.accesoADatos.DetalleVentaData;
import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.accesoADatos.UbicacionData;
import fravemaxsalesmanager.accesoADatos.VentaData;
import fravemaxsalesmanager.entidades.Cliente;
import fravemaxsalesmanager.entidades.DetalleVenta;
import fravemaxsalesmanager.entidades.Producto;
import fravemaxsalesmanager.entidades.Ubicacion;
import fravemaxsalesmanager.entidades.Venta;

/* @author PedroxVA */
public class FraveMaxSalesManager {

    public static void main(String[] args) {
    //Prueba de los métodos de ProductoData
    //ProductoData proData = new ProductoData();
    //UbicacionData ubiData = new UbicacionData();
    //ClienteData cliData = new ClienteData();
    //VentaData venData = new VentaData();
    //DetalleVentaData deVenData = new DetalleVentaData();
    
    //----------Alta-----------
    //String categoria = "Tecnología";
    //String nombreProducto = "Celular";
    //String marca = "Samsung";
    //String modelo = "Galaxy A1";
    //String descripcion = "Ergonómico, compacto eco-friendly, negro, con wifi incluido";
    //Double precio = 199999.00;
    //int stock = 19;
    //Boolean estado = true;
    
    //Producto producto = new Producto(categoria, nombreProducto, marca, modelo, descripcion, precio, stock, estado);
    //proData.altaProducto(producto);
    //proData.altaProductoLogica(producto);
    //ubiData.altaUbicacion(new Ubicacion("sucasa", "suciudad", "4512", "Jujuy", "Argentina"));
    //cliData.altaCliente(new Cliente("Vides", "Pedro", "3886123123", "pedro@pedromail", "123123123", ubiData.buscarUbicacionPorId(2)));
    //venData.altaVenta(new Venta(7, LocalDate.now()));
    //deVenData.altaDetalleVenta(new DetalleVenta(1, 5, 19999, 19999, 0, (0.21*19999), 4)); //Salen dos carteles;
    
    
    //------------Baja--------------
    //proData.bajaProductoPorID(1);
    //proData.bajaProductoPorNombre("Heladera");
    //proData.bajaProductoPorModelo("Ultra Frost");
    //proData.bajaProductoPorCategoria("Electrodomestico");
    //deVenData.bajaDetalleVentaPorID(4);
    //venData.bajaVentaPorID(2);
    //cliData.eliminarCliente(6);
    //ubiData.bajaUbicacionPorID(2);
    
    //--------------Modificar--------------
    //int idProducto = 1;
    //String categoriaM = "Electrodomestico";
    //String nombreProductoM = "Heladera";
    //String marcaM = "Siam";
    //String modeloM = "Ultra Frost";
    //String descripcionM = "Ergonómico, compacto eco-friendly, blanco, con wifi incluido";
    //Double precioM = 1000000.00;
    //int stockM = 10;
    //Boolean estadoM = true;
    
    //Producto productoM = new Producto(idProducto, categoriaM, nombreProductoM, marcaM, modeloM, descripcionM, precioM, stockM, estadoM);
    //proData.modificarProducto(productoM);
    //Ubicacion ubicacion = ubiData.buscarUbicacionPorId(2);
    //ubicacion.setDireccion("laCasaAlFrente");
    //ubiData.modificarUbicacion(ubicacion);
    //Cliente cliente = cliData.obtenerClientePorId(6);
    //cliente.setApellido("Vides Aparicio");
    //cliData.modificarCliente(cliente); //no se puede usar / dentro de syntaxis sql;
    //Venta venta = venData.buscarVentaPorId(2);
    //venta.setFechaVenta(LocalDate.of(2001, Month.MARCH, 23)); //venta eliminada previamente;
    //venData.modificarVenta(venta);
    //DetalleVenta detalleVenta = deVenData.buscarDetalleVentaPorId(3);
    //detalleVenta.setPrecioVenta(1000000);
    //deVenData.modificarDetalleVenta(detalleVenta);
    }
}
