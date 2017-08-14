/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "fondopensiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fondopensiones.findAll", query = "SELECT f FROM Fondopensiones f")
    , @NamedQuery(name = "Fondopensiones.findByIdfondoPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.idfondoPensiones = :idfondoPensiones")
    , @NamedQuery(name = "Fondopensiones.findByCodigoFondo", query = "SELECT f FROM Fondopensiones f WHERE f.codigoFondo = :codigoFondo")
    , @NamedQuery(name = "Fondopensiones.findByNombreFondoPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.nombreFondoPensiones = :nombreFondoPensiones")
    , @NamedQuery(name = "Fondopensiones.findByDireccionPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.direccionPensiones = :direccionPensiones")
    , @NamedQuery(name = "Fondopensiones.findByCiudadPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.ciudadPensiones = :ciudadPensiones")
    , @NamedQuery(name = "Fondopensiones.findByTelefonoPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.telefonoPensiones = :telefonoPensiones")
    , @NamedQuery(name = "Fondopensiones.findByEmailPensiones", query = "SELECT f FROM Fondopensiones f WHERE f.emailPensiones = :emailPensiones")})
public class Fondopensiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idfondoPensiones")
    private Integer idfondoPensiones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigoFondo")
    private String codigoFondo;
    @Size(max = 45)
    @Column(name = "nombreFondoPensiones")
    private String nombreFondoPensiones;
    @Size(max = 45)
    @Column(name = "direccionPensiones")
    private String direccionPensiones;
    @Size(max = 45)
    @Column(name = "ciudadPensiones")
    private String ciudadPensiones;
    @Size(max = 45)
    @Column(name = "telefonoPensiones")
    private String telefonoPensiones;
    @Size(max = 45)
    @Column(name = "emailPensiones")
    private String emailPensiones;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fondoPensionesidfondoPensiones")
    private List<AportesPaciente> aportesPacienteList;

    public Fondopensiones() {
    }

    public Fondopensiones(Integer idfondoPensiones) {
        this.idfondoPensiones = idfondoPensiones;
    }

    public Fondopensiones(Integer idfondoPensiones, String codigoFondo) {
        this.idfondoPensiones = idfondoPensiones;
        this.codigoFondo = codigoFondo;
    }

    public Integer getIdfondoPensiones() {
        return idfondoPensiones;
    }

    public void setIdfondoPensiones(Integer idfondoPensiones) {
        this.idfondoPensiones = idfondoPensiones;
    }

    public String getCodigoFondo() {
        return codigoFondo;
    }

    public void setCodigoFondo(String codigoFondo) {
        this.codigoFondo = codigoFondo;
    }

    public String getNombreFondoPensiones() {
        return nombreFondoPensiones;
    }

    public void setNombreFondoPensiones(String nombreFondoPensiones) {
        this.nombreFondoPensiones = nombreFondoPensiones;
    }

    public String getDireccionPensiones() {
        return direccionPensiones;
    }

    public void setDireccionPensiones(String direccionPensiones) {
        this.direccionPensiones = direccionPensiones;
    }

    public String getCiudadPensiones() {
        return ciudadPensiones;
    }

    public void setCiudadPensiones(String ciudadPensiones) {
        this.ciudadPensiones = ciudadPensiones;
    }

    public String getTelefonoPensiones() {
        return telefonoPensiones;
    }

    public void setTelefonoPensiones(String telefonoPensiones) {
        this.telefonoPensiones = telefonoPensiones;
    }

    public String getEmailPensiones() {
        return emailPensiones;
    }

    public void setEmailPensiones(String emailPensiones) {
        this.emailPensiones = emailPensiones;
    }

    @XmlTransient
    public List<AportesPaciente> getAportesPacienteList() {
        return aportesPacienteList;
    }

    public void setAportesPacienteList(List<AportesPaciente> aportesPacienteList) {
        this.aportesPacienteList = aportesPacienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfondoPensiones != null ? idfondoPensiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fondopensiones)) {
            return false;
        }
        Fondopensiones other = (Fondopensiones) object;
        if ((this.idfondoPensiones == null && other.idfondoPensiones != null) || (this.idfondoPensiones != null && !this.idfondoPensiones.equals(other.idfondoPensiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Fondopensiones[ idfondoPensiones=" + idfondoPensiones + " ]";
    }
    
}
