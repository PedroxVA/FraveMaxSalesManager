
package fravemaxsalesmanager.entidades;

import java.time.LocalDate;
import java.util.Objects;

/* @author PedroxVA */
public class Venta {
    
    private int idVenta;
    private int idCliente;
    private LocalDate fechaVenta;
    
// Constructores

    private Venta() {}

    public Venta(int idVenta, int idCliente, LocalDate fechaVenta) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
    }

    public Venta(int idCliente, LocalDate fechaVenta) {
        this.idCliente = idCliente;
        this.fechaVenta = fechaVenta;
    }
    
    // Getters and Setters

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
        return "ID " + idVenta + " - Cliente N°" + idCliente + " (" + fechaVenta+")";
    }
    
    // Hashcode & Equals

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.idVenta;
        hash = 71 * hash + this.idCliente;
        hash = 71 * hash + Objects.hashCode(this.fechaVenta);
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
        if (!Objects.equals(this.fechaVenta, other.fechaVenta)) {
            return false;
        }
        return true;
    }
    
    

    
    

}
