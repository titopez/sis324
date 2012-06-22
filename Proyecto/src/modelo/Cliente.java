
package modelo;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Roberto
 */
@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String apellidos;
    private int nit;
    private int ci;
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Placa> placa=new ArrayList<Placa>();
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Factura> facturas= new ArrayList<Factura>();

    public Cliente() {
    }

    public Cliente(long id, String nombre, String apellidos, int nit, int ci) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nit = nit;
        this.ci = ci;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public int getNit() {
        return nit;
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

    public List<Placa> getPlaca() {
        return placa;
    }

    public void setPlaca(List<Placa> placa) {
        this.placa = placa;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nit=" + nit + ", ci=" + ci + ", placa=" + placa + ", facturas=" + facturas + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
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
        if (this.ci != other.ci) {
            return false;
        }
        if ((this.placa == null) ? (other.placa != null) : !this.placa.equals(other.placa)) {
            return false;
        }
        if (this.facturas != other.facturas && (this.facturas == null || !this.facturas.equals(other.facturas))) {
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