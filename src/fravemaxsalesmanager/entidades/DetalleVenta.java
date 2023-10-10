
package fravemaxsalesmanager.entidades;

/* @author PedroxVA */
public class DetalleVenta {
    
    private int idDetalleVenta;
    private int cantidad;
    private int idVenta;
    private double precioVenta;
    private double importeBruto;
    private double descuentos;
    private double IVA;
    private int idProducto;
    
    //constructores

    public DetalleVenta() {}

    public DetalleVenta(int idDetalleVenta, int cantidad, int idVenta, double precioVenta, double importeBruto, double descuentos, double IVA, int idProducto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.idVenta = idVenta;
        this.precioVenta = precioVenta;
        this.importeBruto = importeBruto;
        this.descuentos = descuentos;
        this.IVA = IVA;
        this.idProducto = idProducto;
    }

    public DetalleVenta(int cantidad, int idVenta, double precioVenta, double importeBruto, double descuentos, double IVA, int idProducto) {
        this.cantidad = cantidad;
        this.idVenta = idVenta;
        this.precioVenta = precioVenta;
        this.importeBruto = importeBruto;
        this.descuentos = descuentos;
        this.IVA = IVA;
        this.idProducto = idProducto;
    }

    
    // Getters & Setters
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(double importeBruto) {
        this.importeBruto = importeBruto;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    // Metodo to String

    @Override
    public String toString() {
        return "ID " + idDetalleVenta + " - " + cantidad+ " unidades, Venta N°" + idVenta + ", $" + precioVenta + ", ID del Producto: " + idProducto;
    }
    
    // Hashcode & Equals

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idDetalleVenta;
        hash = 53 * hash + this.cantidad;
        hash = 53 * hash + this.idVenta;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.precioVenta) ^ (Double.doubleToLongBits(this.precioVenta) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.importeBruto) ^ (Double.doubleToLongBits(this.importeBruto) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.descuentos) ^ (Double.doubleToLongBits(this.descuentos) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.IVA) ^ (Double.doubleToLongBits(this.IVA) >>> 32));
        hash = 53 * hash + this.idProducto;
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
        final DetalleVenta other = (DetalleVenta) obj;
        if (this.idDetalleVenta != other.idDetalleVenta) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (this.idVenta != other.idVenta) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioVenta) != Double.doubleToLongBits(other.precioVenta)) {
            return false;
        }
        if (Double.doubleToLongBits(this.importeBruto) != Double.doubleToLongBits(other.importeBruto)) {
            return false;
        }
        if (Double.doubleToLongBits(this.descuentos) != Double.doubleToLongBits(other.descuentos)) {
            return false;
        }
        if (Double.doubleToLongBits(this.IVA) != Double.doubleToLongBits(other.IVA)) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }


    
    
    
    
    
    

}
