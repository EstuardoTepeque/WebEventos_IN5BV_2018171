/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danieltepeque.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "reservaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reservaciones.findAll", query = "SELECT r FROM Reservaciones r")
    , @NamedQuery(name = "Reservaciones.findByIdreservacion", query = "SELECT r FROM Reservaciones r WHERE r.idreservacion = :idreservacion")
    , @NamedQuery(name = "Reservaciones.findByFechainicio", query = "SELECT r FROM Reservaciones r WHERE r.fechainicio = :fechainicio")
    , @NamedQuery(name = "Reservaciones.findByFechasalida", query = "SELECT r FROM Reservaciones r WHERE r.fechasalida = :fechasalida")})
public class Reservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idreservacion")
    private Integer idreservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fechasalida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechasalida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idreservacion")
    private List<Cotizacion> cotizacionList;
    @JoinColumn(name = "idcliente", referencedColumnName = "idcliente")
    @ManyToOne(optional = false)
    private Cliente idcliente;
    @JoinColumn(name = "idmotivoreservacion", referencedColumnName = "idmotivoreservacion")
    @ManyToOne(optional = false)
    private Motivoreservacion idmotivoreservacion;
    @JoinColumn(name = "idsalon", referencedColumnName = "idsalon")
    @ManyToOne(optional = false)
    private Salon idsalon;
    @JoinColumn(name = "idsucursal", referencedColumnName = "idsucursal")
    @ManyToOne(optional = false)
    private Sucursal idsucursal;

    public Reservaciones() {
    }

    public Reservaciones(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Reservaciones(Integer idreservacion, Date fechainicio, Date fechasalida) {
        this.idreservacion = idreservacion;
        this.fechainicio = fechainicio;
        this.fechasalida = fechasalida;
    }

    public Integer getIdreservacion() {
        return idreservacion;
    }

    public void setIdreservacion(Integer idreservacion) {
        this.idreservacion = idreservacion;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(Date fechasalida) {
        this.fechasalida = fechasalida;
    }

    @XmlTransient
    public List<Cotizacion> getCotizacionList() {
        return cotizacionList;
    }

    public void setCotizacionList(List<Cotizacion> cotizacionList) {
        this.cotizacionList = cotizacionList;
    }

    public Cliente getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Cliente idcliente) {
        this.idcliente = idcliente;
    }

    public Motivoreservacion getIdmotivoreservacion() {
        return idmotivoreservacion;
    }

    public void setIdmotivoreservacion(Motivoreservacion idmotivoreservacion) {
        this.idmotivoreservacion = idmotivoreservacion;
    }

    public Salon getIdsalon() {
        return idsalon;
    }

    public void setIdsalon(Salon idsalon) {
        this.idsalon = idsalon;
    }

    public Sucursal getIdsucursal() {
        return idsucursal;
    }

    public void setIdsucursal(Sucursal idsucursal) {
        this.idsucursal = idsucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreservacion != null ? idreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reservaciones)) {
            return false;
        }
        Reservaciones other = (Reservaciones) object;
        if ((this.idreservacion == null && other.idreservacion != null) || (this.idreservacion != null && !this.idreservacion.equals(other.idreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.danieltepeque.entities.Reservaciones[ idreservacion=" + idreservacion + " ]";
    }
    
}
