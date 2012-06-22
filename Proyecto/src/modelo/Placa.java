
package modelo;

import javax.persistence.*;

/**
 *
 * @author Equipo 8
 */
@Entity
public class Placa {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private int numero;

    public Placa() {
    }

    public Placa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Placa other = (Placa) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numero != other.numero) {
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
        return "Placa{" + "id=" + id + ", numero=" + numero + '}';
    }  
    
}
