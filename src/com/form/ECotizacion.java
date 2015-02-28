/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.form;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author daniel
 */
@Entity
@Table(name = "ECotizacion", catalog = "scrym", schema = "")
@NamedQueries({
    @NamedQuery(name = "ECotizacion.findAll", query = "SELECT e FROM ECotizacion e"),
    @NamedQuery(name = "ECotizacion.findByIdCotizacion", query = "SELECT e FROM ECotizacion e WHERE e.idCotizacion = :idCotizacion"),
    @NamedQuery(name = "ECotizacion.findByEmpresa", query = "SELECT e FROM ECotizacion e WHERE e.empresa = :empresa"),
    @NamedQuery(name = "ECotizacion.findByContacto", query = "SELECT e FROM ECotizacion e WHERE e.contacto = :contacto"),
    @NamedQuery(name = "ECotizacion.findByFecha", query = "SELECT e FROM ECotizacion e WHERE e.fecha = :fecha"),
    @NamedQuery(name = "ECotizacion.findByVendedor", query = "SELECT e FROM ECotizacion e WHERE e.vendedor = :vendedor"),
    @NamedQuery(name = "ECotizacion.findByTelCel", query = "SELECT e FROM ECotizacion e WHERE e.telCel = :telCel"),
    @NamedQuery(name = "ECotizacion.findByObservacion", query = "SELECT e FROM ECotizacion e WHERE e.observacion = :observacion"),
    @NamedQuery(name = "ECotizacion.findByDescuento", query = "SELECT e FROM ECotizacion e WHERE e.descuento = :descuento")})
public class ECotizacion implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idCotizacion")
    private Integer idCotizacion;
    @Column(name = "Empresa")
    private String empresa;
    @Column(name = "Contacto")
    private String contacto;
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "Vendedor")
    private String vendedor;
    @Column(name = "TelCel")
    private String telCel;
    @Column(name = "Observacion")
    private String observacion;
    @Column(name = "descuento")
    private Long descuento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eCotizacion")
    private List<DCotizacion> dCotizacionList;

    public ECotizacion() {
    }

    public ECotizacion(Integer idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public Integer getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(Integer idCotizacion) {
        Integer oldIdCotizacion = this.idCotizacion;
        this.idCotizacion = idCotizacion;
        changeSupport.firePropertyChange("idCotizacion", oldIdCotizacion, idCotizacion);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        String oldEmpresa = this.empresa;
        this.empresa = empresa;
        changeSupport.firePropertyChange("empresa", oldEmpresa, empresa);
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        String oldContacto = this.contacto;
        this.contacto = contacto;
        changeSupport.firePropertyChange("contacto", oldContacto, contacto);
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        Date oldFecha = this.fecha;
        this.fecha = fecha;
        changeSupport.firePropertyChange("fecha", oldFecha, fecha);
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        String oldVendedor = this.vendedor;
        this.vendedor = vendedor;
        changeSupport.firePropertyChange("vendedor", oldVendedor, vendedor);
    }

    public String getTelCel() {
        return telCel;
    }

    public void setTelCel(String telCel) {
        String oldTelCel = this.telCel;
        this.telCel = telCel;
        changeSupport.firePropertyChange("telCel", oldTelCel, telCel);
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        String oldObservacion = this.observacion;
        this.observacion = observacion;
        changeSupport.firePropertyChange("observacion", oldObservacion, observacion);
    }

    public Long getDescuento() {
        return descuento;
    }

    public void setDescuento(Long descuento) {
        Long oldDescuento = this.descuento;
        this.descuento = descuento;
        changeSupport.firePropertyChange("descuento", oldDescuento, descuento);
    }

    public List<DCotizacion> getDCotizacionList() {
        return dCotizacionList;
    }

    public void setDCotizacionList(List<DCotizacion> dCotizacionList) {
        this.dCotizacionList = dCotizacionList;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCotizacion != null ? idCotizacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ECotizacion)) {
            return false;
        }
        ECotizacion other = (ECotizacion) object;
        if ((this.idCotizacion == null && other.idCotizacion != null) || (this.idCotizacion != null && !this.idCotizacion.equals(other.idCotizacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.form.ECotizacion[ idCotizacion=" + idCotizacion + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
