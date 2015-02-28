/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author daniel
 */
@Embeddable
public class DCotizacionPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "iddetcotizacion")
    private Integer iddetcotizacion;
    @Basic(optional = false)
    @Column(name = "idCotizacion")
    private int idCotizacion;

    public DCotizacionPK() {
    }

    public DCotizacionPK(int iddetcotizacion, int idCotizacion) {
        this.iddetcotizacion = iddetcotizacion;
        this.idCotizacion = idCotizacion;
    }

    public int getIddetcotizacion() {
        return iddetcotizacion;
    }

    public void setIddetcotizacion(Integer iddetcotizacion) {
        this.iddetcotizacion = iddetcotizacion;
    }

    public int getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(int idCotizacion) {
        this.idCotizacion = idCotizacion;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) iddetcotizacion;
        hash += (int) idCotizacion;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DCotizacionPK)) {
            return false;
        }
        DCotizacionPK other = (DCotizacionPK) object;
        if (this.iddetcotizacion != other.iddetcotizacion) {
            return false;
        }
        if (this.idCotizacion != other.idCotizacion) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.form.DCotizacionPK[ iddetcotizacion=" + iddetcotizacion + ", idCotizacion=" + idCotizacion + " ]";
    }
    
}
