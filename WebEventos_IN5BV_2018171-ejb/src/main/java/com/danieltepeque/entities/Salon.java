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
@Table(name = "salon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salon.findAll", query = "SELECT s FROM Salon s")
    , @NamedQuery(name = "Salon.findByIdsalon", query = "SELECT s FROM Salon s WHERE s.idsalon = :idsalon")
    , @NamedQuery(name = "Salon.findByDescripcion", query = "SELECT s FROM Salon s WHERE s.descripcion = :descripcion")})
public class Salon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsalon")
    private Integer idsalon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsalon")
    private List<Reservaciones> reservacionesList;

    public Salon() {
    }

    public Salon(Integer idsalon) {
        this.idsalon = idsalon;
    }

    public Salon(Integer idsalon, String descripcion) {
        this.idsalon = idsalon;
        this.descripcion = descripcion;
    }

    public Integer getIdsalon() {
        return idsalon;
    }

    public void setIdsalon(Integer idsalon) {
        this.idsalon = idsalon;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idsalon != null ? idsalon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salon)) {
            return false;
        }
        Salon other = (Salon) object;
        if ((this.idsalon == null && other.idsalon != null) || (this.idsalon != null && !this.idsalon.equals(other.idsalon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.danieltepeque.entities.Salon[ idsalon=" + idsalon + " ]";
    }
    
}
