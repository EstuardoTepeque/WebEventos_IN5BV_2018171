/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danieltepeque.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "motivoreservacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motivoreservacion.findAll", query = "SELECT m FROM Motivoreservacion m")
    , @NamedQuery(name = "Motivoreservacion.findByIdmotivoreservacion", query = "SELECT m FROM Motivoreservacion m WHERE m.idmotivoreservacion = :idmotivoreservacion")
    , @NamedQuery(name = "Motivoreservacion.findByAniversario", query = "SELECT m FROM Motivoreservacion m WHERE m.aniversario = :aniversario")
    , @NamedQuery(name = "Motivoreservacion.findByCumplea\u00f1os", query = "SELECT m FROM Motivoreservacion m WHERE m.cumplea\u00f1os = :cumplea\u00f1os")
    , @NamedQuery(name = "Motivoreservacion.findByBoda", query = "SELECT m FROM Motivoreservacion m WHERE m.boda = :boda")
    , @NamedQuery(name = "Motivoreservacion.findByGraduacion", query = "SELECT m FROM Motivoreservacion m WHERE m.graduacion = :graduacion")
    , @NamedQuery(name = "Motivoreservacion.findByOtro", query = "SELECT m FROM Motivoreservacion m WHERE m.otro = :otro")})
public class Motivoreservacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmotivoreservacion")
    private Integer idmotivoreservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aniversario")
    private short aniversario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cumplea\u00f1os")
    private short cumpleaños;
    @Basic(optional = false)
    @NotNull
    @Column(name = "boda")
    private short boda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "graduacion")
    private short graduacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "otro")
    private String otro;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmotivoreservacion")
    private List<Reservaciones> reservacionesList;

    public Motivoreservacion() {
    }

    public Motivoreservacion(Integer idmotivoreservacion) {
        this.idmotivoreservacion = idmotivoreservacion;
    }

    public Motivoreservacion(Integer idmotivoreservacion, short aniversario, short cumpleaños, short boda, short graduacion, String otro) {
        this.idmotivoreservacion = idmotivoreservacion;
        this.aniversario = aniversario;
        this.cumpleaños = cumpleaños;
        this.boda = boda;
        this.graduacion = graduacion;
        this.otro = otro;
    }

    public Integer getIdmotivoreservacion() {
        return idmotivoreservacion;
    }

    public void setIdmotivoreservacion(Integer idmotivoreservacion) {
        this.idmotivoreservacion = idmotivoreservacion;
    }

    public short getAniversario() {
        return aniversario;
    }

    public void setAniversario(short aniversario) {
        this.aniversario = aniversario;
    }

    public short getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(short cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public short getBoda() {
        return boda;
    }

    public void setBoda(short boda) {
        this.boda = boda;
    }

    public short getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(short graduacion) {
        this.graduacion = graduacion;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }

    @XmlTransient
    public List<Reservaciones> getReservacionesList() {
        return reservacionesList;
    }

    public void setReservacionesList(List<Reservaciones> reservacionesList) {
        this.reservacionesList = reservacionesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmotivoreservacion != null ? idmotivoreservacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motivoreservacion)) {
            return false;
        }
        Motivoreservacion other = (Motivoreservacion) object;
        if ((this.idmotivoreservacion == null && other.idmotivoreservacion != null) || (this.idmotivoreservacion != null && !this.idmotivoreservacion.equals(other.idmotivoreservacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.danieltepeque.entities.Motivoreservacion[ idmotivoreservacion=" + idmotivoreservacion + " ]";
    }
    
}
