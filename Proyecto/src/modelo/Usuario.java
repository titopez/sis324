
package modelo;

import javax.persistence.*;

/**
 *
 * @author Roberto
 */

@Entity
@Inheritance(strategy= InheritanceType.JOINED)
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected long id;
    protected String nombre;
    protected String apellidos;
    protected int nit;
    protected String cuenta;
    protected String contrasenia;
    protected byte tipo;

    public Usuario() {
    }

    protected Usuario (String nombre, String apellidos,int nit,String cuenta, String contrasenia, byte tipo) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.nit=nit;
        this.cuenta = cuenta;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public long getId() {
        return id;
    }

    public int getNit() {
        return nit;
    }

    private void setId(long id) {
        this.id = id;
    }  

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return cuenta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.apellidos == null) ? (other.apellidos != null) : !this.apellidos.equals(other.apellidos)) {
            return false;
        }
        if (this.nit != other.nit) {
            return false;
        }
        if ((this.cuenta == null) ? (other.cuenta != null) : !this.cuenta.equals(other.cuenta)) {
            return false;
        }
        if ((this.contrasenia == null) ? (other.contrasenia != null) : !this.contrasenia.equals(other.contrasenia)) {
            return false;
        }
        if (this.tipo != other.tipo) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
    
}
