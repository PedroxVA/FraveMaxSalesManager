
package fravemaxsalesmanager.entidades;

import java.util.Objects;

/* @author PedroxVA */
public class Cliente {
    ///Atributos
    private int idCliente;
    private String apellido;
    private String nombre;
    private String telef;
    private String email;
    private String cuil;
    private Ubicacion ubicacion;

    ///Constructores

    public Cliente() {
    }
     

    public Cliente(int idCliente, String apellido, String nombre, String telef, String email, String cuil, Ubicacion ubicacion) {
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telef = telef;
        this.email = email;
        this.cuil = cuil;
        this.ubicacion = ubicacion;
    }

    public Cliente(String apellido, String nombre, String telef, String email, String cuil, Ubicacion ubicacion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.telef = telef;
        this.email = email;
        this.cuil = cuil;
        this.ubicacion = ubicacion;
    }
    
    
    ///Getters & Setters
    public int getIdCliente() {
        return idCliente;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEmail() {
        return email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }
    
    ///Método toString;
    @Override
    public String toString() {
        return "ID "+this.idCliente+" - "+this.apellido+", "+this.nombre;
    }
    
    ///Método HashCode & Equals;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + this.idCliente;
        hash = 53 * hash + Objects.hashCode(this.apellido);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.cuil);
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
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telef, other.telef)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.cuil, other.cuil)) {
            return false;
        }
        return true;
    }
    
}
