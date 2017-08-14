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
@Table(name = "arl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arl.findAll", query = "SELECT a FROM Arl a")
    , @NamedQuery(name = "Arl.findByIdarl", query = "SELECT a FROM Arl a WHERE a.idarl = :idarl")
    , @NamedQuery(name = "Arl.findByCodigoARL", query = "SELECT a FROM Arl a WHERE a.codigoARL = :codigoARL")
    , @NamedQuery(name = "Arl.findByNombreArl", query = "SELECT a FROM Arl a WHERE a.nombreArl = :nombreArl")
    , @NamedQuery(name = "Arl.findByDireccionArl", query = "SELECT a FROM Arl a WHERE a.direccionArl = :direccionArl")
    , @NamedQuery(name = "Arl.findByCiudadArl", query = "SELECT a FROM Arl a WHERE a.ciudadArl = :ciudadArl")
    , @NamedQuery(name = "Arl.findByTelefonoArl", query = "SELECT a FROM Arl a WHERE a.telefonoArl = :telefonoArl")
    , @NamedQuery(name = "Arl.findByEmailArl", query = "SELECT a FROM Arl a WHERE a.emailArl = :emailArl")})
public class Arl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idarl")
    private Integer idarl;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigoARL")
    private String codigoARL;
    @Size(max = 45)
    @Column(name = "nombreArl")
    private String nombreArl;
    @Size(max = 45)
    @Column(name = "direccionArl")
    private String direccionArl;
    @Size(max = 45)
    @Column(name = "ciudadArl")
    private String ciudadArl;
    @Size(max = 45)
    @Column(name = "telefonoArl")
    private String telefonoArl;
    @Size(max = 45)
    @Column(name = "emailArl")
    private String emailArl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "arlIdarl")
    private List<AportesPaciente> aportesPacienteList;

    public Arl() {
    }

    public Arl(Integer idarl) {
        this.idarl = idarl;
    }

    public Arl(Integer idarl, String codigoARL) {
        this.idarl = idarl;
        this.codigoARL = codigoARL;
    }

    public Integer getIdarl() {
        return idarl;
    }

    public void setIdarl(Integer idarl) {
        this.idarl = idarl;
    }

    public String getCodigoARL() {
        return codigoARL;
    }

    public void setCodigoARL(String codigoARL) {
        this.codigoARL = codigoARL;
    }

    public String getNombreArl() {
        return nombreArl;
    }

    public void setNombreArl(String nombreArl) {
        this.nombreArl = nombreArl;
    }

    public String getDireccionArl() {
        return direccionArl;
    }

    public void setDireccionArl(String direccionArl) {
        this.direccionArl = direccionArl;
    }

    public String getCiudadArl() {
        return ciudadArl;
    }

    public void setCiudadArl(String ciudadArl) {
        this.ciudadArl = ciudadArl;
    }

    public String getTelefonoArl() {
        return telefonoArl;
    }

    public void setTelefonoArl(String telefonoArl) {
        this.telefonoArl = telefonoArl;
    }

    public String getEmailArl() {
        return emailArl;
    }

    public void setEmailArl(String emailArl) {
        this.emailArl = emailArl;
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
        hash += (idarl != null ? idarl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arl)) {
            return false;
        }
        Arl other = (Arl) object;
        if ((this.idarl == null && other.idarl != null) || (this.idarl != null && !this.idarl.equals(other.idarl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Arl[ idarl=" + idarl + " ]";
    }
    
}
