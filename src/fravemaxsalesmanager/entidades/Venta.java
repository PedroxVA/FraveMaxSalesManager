
package fravemaxsalesmanager.entidades;

import java.time.LocalDate;
import java.util.Objects;

/* @author PedroxVA */
public class Venta {
    
    private int idVenta;
    private int idCliente;
    private LocalDate fechaVenta;
    private double importeBruto;
    
// Constructores

    public Venta() {}

    public Venta(int idVenta, int idCliente, LocalDate fechaVenta, double importeBruto) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
        this.importeBruto = importeBruto;
    }

    public Venta(int idCliente, LocalDate fechaVenta, double importeBruto) {
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
        this.importeBruto = importeBruto;
    }

    


    // Getters and Setters
    
    public double getImporteBruto() {    
        return importeBruto;
    }
    public void setImporteBruto(double importeBruto) {
        this.importeBruto = importeBruto;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    // Metodo to String

    @Override
    public String toString() {
        return "ID " + idVenta + " - Cliente N°" + idCliente + " (" + fechaVenta+") - $"+importeBruto;
    }
    
    // Hashcode & Equals

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.idVenta;
        hash = 53 * hash + this.idCliente;
        hash = 53 * hash + Objects.hashCode(this.fechaVenta);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.importeBruto) ^ (Double.doubleToLongBits(this.importeBruto) >>> 32));
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
        final Venta other = (Venta) obj;
        if (this.idVenta != other.idVenta) {
            return false;
        }
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (Double.doubleToLongBits(this.importeBruto) != Double.doubleToLongBits(other.importeBruto)) {
            return false;
        }
        if (!Objects.equals(this.fechaVenta, other.fechaVenta)) {
            return false;
        }
        return true;
    }

    
    
    

    
    

}
