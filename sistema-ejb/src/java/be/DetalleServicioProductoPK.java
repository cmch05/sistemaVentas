/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package be;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author argos
 */
@Embeddable
public class DetalleServicioProductoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "ID_SERVICIO")
    private int idServicio;
    @Basic(optional = false)
    @Column(name = "ID_PRODUCTO")
    private int idProducto;

    public DetalleServicioProductoPK() {
    }

    public DetalleServicioProductoPK(int idServicio, int idProducto) {
        this.idServicio = idServicio;
        this.idProducto = idProducto;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idServicio;
        hash += (int) idProducto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleServicioProductoPK)) {
            return false;
        }
        DetalleServicioProductoPK other = (DetalleServicioProductoPK) object;
        if (this.idServicio != other.idServicio) {
            return false;
        }
        if (this.idProducto != other.idProducto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "be.DetalleServicioProductoPK[idServicio=" + idServicio + ", idProducto=" + idProducto + "]";
    }

}
