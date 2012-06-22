/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.persistence.Entity;

/**
 *
 * @author Equipo 8
 */
@Entity
public class Administrador extends Usuario {
    private String cargo;

    public Administrador() {
    }

    public Administrador(String cargo, String nombre, String apellidos, int nit, String cuenta, String contrasenia, byte tipo) {
        super(nombre, apellidos, nit, cuenta, contrasenia, tipo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Administrador other = (Administrador) obj;
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
        if ((this.cargo == null) ? (other.cargo != null) : !this.cargo.equals(other.cargo)) {
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

    @Override
    public String toString() {
        return nombre+apellidos;
    }
    
    
}
