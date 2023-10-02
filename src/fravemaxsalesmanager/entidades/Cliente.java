
package fravemaxsalesmanager.entidades;

import java.util.Objects;

/* @author PedroxVA */
public class Cliente {
    ///Atributos
    private int idCliente;
    private String apellido;
    private String nombre;
    private String direccion;
    private String localidad;
    private String codigoPostal;
    private String provincia;
    private String pais;
    private String telef;
    private String email;
    private String cuil;

    ///Constructores
    private Cliente(){}
    public Cliente(int idCliente, String apellido, String nombre, String direccion, String localidad, String codigoPostal, String provincia, String pais, String telef, String email, String cuil) {
        this.idCliente = idCliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
        this.telef = telef;
        this.email = email;
        this.cuil = cuil;
    }
    public Cliente(String apellido, String nombre, String direccion, String localidad, String codigoPostal, String provincia, String pais, String telef, String email, String cuil) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
        this.telef = telef;
        this.email = email;
        this.cuil = cuil;
    }
    
    ///Getters & Setters
    public int getIdCliente() {
        return idCliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public String getEmail() {
        return email;
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
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.localidad, other.localidad)) {
            return false;
        }
        if (!Objects.equals(this.codigoPostal, other.codigoPostal)) {
            return false;
        }
        if (!Objects.equals(this.provincia, other.provincia)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
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
