
package fravemaxsalesmanager;

import fravemaxsalesmanager.accesoADatos.ProductoData;
import fravemaxsalesmanager.entidades.Producto;

/* @author PedroxVA */
public class FraveMaxSalesManager {

    public static void main(String[] args) {
    //Prueba de los métodos de ProductoData
    ProductoData proData = new ProductoData();
    //----------Alta-----------
    String categoria = "Electrodomestico";
    String nombreProducto = "Heladera";
    String marca = "Whirpool";
    String modelo = "Ultra Frost";
    String descripcion = "Ergonómico, compacto eco-friendly, negro, con wifi incluido";
    Double precio = 1000000.00;
    int stock = 10;
    Boolean estado = true;
    
    Producto producto = new Producto(2, categoria, nombreProducto, marca, modelo, descripcion, precio, stock, estado);
    //proData.altaProducto(producto);
    //proData.altaProductoLogica(producto);
    
    //------------Baja--------------
    //proData.bajaProductoPorID(1);
    //proData.bajaProductoPorNombre("Heladera");
    //proData.bajaProductoPorModelo("Ultra Frost");
    //proData.bajaProductoPorCategoria("Electrodomestico");
    
    //--------------Modificar--------------
    int idProducto = 1;
    String categoriaM = "Electrodomestico";
    String nombreProductoM = "Heladera";
    String marcaM = "Siam";
    String modeloM = "Ultra Frost";
    String descripcionM = "Ergonómico, compacto eco-friendly, blanco, con wifi incluido";
    Double precioM = 1000000.00;
    int stockM = 10;
    Boolean estadoM = true;
    
    Producto productoM = new Producto(idProducto, categoriaM, nombreProductoM, marcaM, modeloM, descripcionM, precioM, stockM, estadoM);
    //proData.modificarProducto(productoM);
    }
}
