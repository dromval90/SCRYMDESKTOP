/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "DCotizacion", catalog = "scrym", schema = "")
@NamedQueries({
    @NamedQuery(name = "DCotizacion.findAll", query = "SELECT d FROM DCotizacion d"),
    @NamedQuery(name = "DCotizacion.findByIddetcotizacion", query = "SELECT d FROM DCotizacion d WHERE d.dCotizacionPK.iddetcotizacion = :iddetcotizacion"),
    @NamedQuery(name = "DCotizacion.findByIdCotizacion", query = "SELECT d FROM DCotizacion d WHERE d.dCotizacionPK.idCotizacion = :idCotizacion"),
    @NamedQuery(name = "DCotizacion.findByCantidad", query = "SELECT d FROM DCotizacion d WHERE d.cantidad = :cantidad"),
    @NamedQuery(name = "DCotizacion.findByDescripcion", query = "SELECT d FROM DCotizacion d WHERE d.descripcion = :descripcion"),
    @NamedQuery(name = "DCotizacion.findByPunitario", query = "SELECT d FROM DCotizacion d WHERE d.punitario = :punitario"),
    @NamedQuery(name = "DCotizacion.findByDiva", query = "SELECT d FROM DCotizacion d WHERE d.diva = :diva"),
    @NamedQuery(name = "DCotizacion.findByDtotal", query = "SELECT d FROM DCotizacion d WHERE d.dtotal = :dtotal")})
public class DCotizacion implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DCotizacionPK dCotizacionPK;
    @Column(name = "Cantidad")
    private Long cantidad;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "punitario")
    private Long punitario;
    @Column(name = "diva")
    private Long diva;
    @Column(name = "dtotal")
    private Long dtotal;
    @JoinColumn(name = "idCotizacion", referencedColumnName = "idCotizacion", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ECotizacion eCotizacion;

    public DCotizacion() {
    }

    public DCotizacion(DCotizacionPK dCotizacionPK) {
        this.dCotizacionPK = dCotizacionPK;
    }

    public DCotizacion(int iddetcotizacion, int idCotizacion) {
        this.dCotizacionPK = new DCotizacionPK(iddetcotizacion, idCotizacion);
    }

    public DCotizacionPK getDCotizacionPK() {
        return dCotizacionPK;
    }

    public void setDCotizacionPK(DCotizacionPK dCotizacionPK) {
        this.dCotizacionPK = dCotizacionPK;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        Long oldCantidad = this.cantidad;
        this.cantidad = cantidad;
        changeSupport.firePropertyChange("cantidad", oldCantidad, cantidad);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        String oldDescripcion = this.descripcion;
        this.descripcion = descripcion;
        changeSupport.firePropertyChange("descripcion", oldDescripcion, descripcion);
    }

    public Long getPunitario() {
        return punitario;
    }

    public void setPunitario(Long punitario) {
        Long oldPunitario = this.punitario;
        this.punitario = punitario;
        changeSupport.firePropertyChange("punitario", oldPunitario, punitario);
    }

    public Long getDiva() {
        return diva;
    }

    public void setDiva(Long diva) {
        Long oldDiva = this.diva;
        this.diva = diva;
        changeSupport.firePropertyChange("diva", oldDiva, diva);
    }

    public Long getDtotal() {
        return dtotal;
    }

    public void setDtotal(Long dtotal) {
        Long oldDtotal = this.dtotal;
        this.dtotal = dtotal;
        changeSupport.firePropertyChange("dtotal", oldDtotal, dtotal);
    }

    public ECotizacion getECotizacion() {
        return eCotizacion;
    }

    public void setECotizacion(ECotizacion eCotizacion) {
        ECotizacion oldECotizacion = this.eCotizacion;
        this.eCotizacion = eCotizacion;
        changeSupport.firePropertyChange("ECotizacion", oldECotizacion, eCotizacion);
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dCotizacionPK != null ? dCotizacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DCotizacion)) {
            return false;
        }
        DCotizacion other = (DCotizacion) object;
        if ((this.dCotizacionPK == null && other.dCotizacionPK != null) || (this.dCotizacionPK != null && !this.dCotizacionPK.equals(other.dCotizacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.form.DCotizacion[ dCotizacionPK=" + dCotizacionPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
