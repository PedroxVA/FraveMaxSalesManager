
package fravemaxsalesmanager.entidades;

import java.util.Objects;

/* @author PedroxVA */
public class Producto {
//atributos
    private int idProducto;
    private String categoria; //Heladera, televisores, hornos, celulares
    private String nombreProducto; 
    private String marca;
    private String modelo;
    private String descripcion;
    private double precioActual;
    private int stock;
    private Boolean activo;
    
    

//constructores
private Producto(){}

    public Producto(int idProducto, String categoria, String nombreProducto, String marca, String modelo, String descripcion, double precioActual, int stock, Boolean activo) {
        this.idProducto = idProducto;
        this.categoria = categoria;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.activo = activo;
    }
    public Producto(String categoria, String nombreProducto, String marca, String modelo, String descripcion, double precioActual, int stock, Boolean activo) {
        this.categoria = categoria;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precioActual = precioActual;
        this.stock = stock;
        this.activo = activo;
    }

    //Getters & Setters  
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {    
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombtre) {
        this.nombreProducto = nombtre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioActual() {
        return precioActual;
    }

    public void setPrecioActual(double precioActual) {
        this.precioActual = precioActual;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
    
    //Método toString;

    @Override
    public String toString() {
        return "ID "+idProducto+" - "+nombreProducto+", $"+precioActual;
    }
    
     //Método HashCode & Equals;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.idProducto;
        hash = 59 * hash + Objects.hashCode(this.nombreProducto);
        hash = 59 * hash + Objects.hashCode(this.descripcion);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.precioActual) ^ (Double.doubleToLongBits(this.precioActual) >>> 32));
        hash = 59 * hash + this.stock;
        hash = 59 * hash + Objects.hashCode(this.activo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioActual) != Double.doubleToLongBits(other.precioActual)) {
            return false;
        }
        if (this.stock != other.stock) {
            return false;
        }
        if (!Objects.equals(this.nombreProducto, other.nombreProducto)) {
            return false;
        }
        if (!Objects.equals(this.descripcion, other.descripcion)) {
            return false;
        }
        if (!Objects.equals(this.activo, other.activo)) {
            return false;
        }
        return true;
    }
    
    
}


