
package modelo;

import java.util.Date;
import javax.persistence.*;
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int numero;
    private String codControl; 
    @Temporal(TemporalType.DATE)
    private Date fechaEmision;
    private int cantidad;
    private double precioTotal;
    private boolean estado;
    @ManyToOne
    private Cliente cliente;
//    @ManyToOne
//    private Vendedor vendedor;
    @ManyToOne
    private OrdenFact orden;
    @ManyToOne
    private Producto producto;

    public Factura() {
    }

    public Factura(int numero, String codControl, int cantidad, double precioTotal, boolean estado, Date fechaEmision)  {
        this.numero = numero;
        this.codControl = codControl;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
        this.estado = estado;
        this.fechaEmision=fechaEmision;
    }

//    public void calcularCantVendida(){
//        
//    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getCodControl() {
        return codControl;
    }

    public void setCodControl(String codControl) {
        this.codControl = codControl;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

//    public Vendedor getVendedor() {
//        return vendedor;
//    }
//
//    public void setVendedor(Vendedor vendedor) {
//        this.vendedor = vendedor;
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
            return false;
        }
        if ((this.codControl == null) ? (other.codControl != null) : !this.codControl.equals(other.codControl)) {
            return false;
        }
        if (this.fechaEmision != other.fechaEmision && (this.fechaEmision == null || !this.fechaEmision.equals(other.fechaEmision))) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Double.doubleToLongBits(this.precioTotal) != Double.doubleToLongBits(other.precioTotal)) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        if (this.cliente != other.cliente && (this.cliente == null || !this.cliente.equals(other.cliente))) {
            return false;
        }
//        if (this.vendedor != other.vendedor && (this.vendedor == null || !this.vendedor.equals(other.vendedor))) {
//            return false;
//        }
        if (this.orden != other.orden && (this.orden == null || !this.orden.equals(other.orden))) {
            return false;
        }
        if (this.producto != other.producto && (this.producto == null || !this.producto.equals(other.producto))) {
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
        return "Factura{" + "numero=" + numero + ", codControl=" + codControl + ", fechaEmision=" + fechaEmision + ", cantidad=" + cantidad + ", precioTotal=" + precioTotal + ", estado=" + estado + ", cliente=" + cliente + ", orden=" + orden + ", producto=" + producto + '}';
    }
  
}
