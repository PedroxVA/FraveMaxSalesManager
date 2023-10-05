
package fravemaxsalesmanager.entidades;

import java.util.Objects;

/* @author PedroxVA */
public class Ubicacion {
    private int idUbicacion;
    private String direccion;
    private String localidad;
    private String codigoPostal;
    private String provincia;
    private String pais;

    ///Constructores
    public Ubicacion() {
    }

    public Ubicacion(int idUbicacion, String direccion, String localidad, String codigoPostal, String provincia, String pais) {
        this.idUbicacion = idUbicacion;
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
    }

    public Ubicacion(String direccion, String localidad, String codigoPostal, String provincia, String pais) {
        this.direccion = direccion;
        this.localidad = localidad;
        this.codigoPostal = codigoPostal;
        this.provincia = provincia;
        this.pais = pais;
    }
    
    
    ///Getters & Setters   

    public int getIdUbicacion() {
        return idUbicacion;
    }

    public void setIdUbicacion(int idUbicacion) {
        this.idUbicacion = idUbicacion;
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
    
    ///Método toString; 
    @Override
    public String toString() {
        return localidad+", "+provincia+"("+pais+")";
    }

    ///Método HashCode & Equals;

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Ubicacion other = (Ubicacion) obj;
        if (this.idUbicacion != other.idUbicacion) {
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
        return true;
    }
    
    
}
