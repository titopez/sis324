/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
/**
 *
 * @author Roberto
 */
@Entity
public class Vendedor extends Usuario{
    private String turno;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Factura> facturas=new ArrayList<Factura>();

    public Vendedor() {
    }

    public Vendedor(String nombre, String apellidos,int nit,String cuenta,String contrasenia,String turno, byte tipo) {
        super(nombre,apellidos,nit,cuenta,contrasenia,tipo);
        this.turno=turno;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return nombre + apellidos;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
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
        if ((this.turno == null) ? (other.turno != null) : !this.turno.equals(other.turno)) {
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
    public void aniadirFactura(Factura fact){
        this.facturas.add(fact);
    }
}
