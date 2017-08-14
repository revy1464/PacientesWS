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
@Table(name = "eps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Eps.findAll", query = "SELECT e FROM Eps e")
    , @NamedQuery(name = "Eps.findByIdEps", query = "SELECT e FROM Eps e WHERE e.idEps = :idEps")
    , @NamedQuery(name = "Eps.findByCodigoEPS", query = "SELECT e FROM Eps e WHERE e.codigoEPS = :codigoEPS")
    , @NamedQuery(name = "Eps.findByNombreEPS", query = "SELECT e FROM Eps e WHERE e.nombreEPS = :nombreEPS")
    , @NamedQuery(name = "Eps.findByDireccionEPS", query = "SELECT e FROM Eps e WHERE e.direccionEPS = :direccionEPS")
    , @NamedQuery(name = "Eps.findByCiudadEPS", query = "SELECT e FROM Eps e WHERE e.ciudadEPS = :ciudadEPS")
    , @NamedQuery(name = "Eps.findByTelefonoEPS", query = "SELECT e FROM Eps e WHERE e.telefonoEPS = :telefonoEPS")
    , @NamedQuery(name = "Eps.findByEmailEPS", query = "SELECT e FROM Eps e WHERE e.emailEPS = :emailEPS")})
public class Eps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idEps")
    private Integer idEps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigoEPS")
    private String codigoEPS;
    @Size(max = 45)
    @Column(name = "nombreEPS")
    private String nombreEPS;
    @Size(max = 45)
    @Column(name = "direccionEPS")
    private String direccionEPS;
    @Size(max = 45)
    @Column(name = "ciudadEPS")
    private String ciudadEPS;
    @Size(max = 45)
    @Column(name = "telefonoEPS")
    private String telefonoEPS;
    @Size(max = 45)
    @Column(name = "emailEPS")
    private String emailEPS;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "epsidEps")
    private List<AportesPaciente> aportesPacienteList;

    public Eps() {
    }

    public Eps(Integer idEps) {
        this.idEps = idEps;
    }

    public Eps(Integer idEps, String codigoEPS) {
        this.idEps = idEps;
        this.codigoEPS = codigoEPS;
    }

    public Integer getIdEps() {
        return idEps;
    }

    public void setIdEps(Integer idEps) {
        this.idEps = idEps;
    }

    public String getCodigoEPS() {
        return codigoEPS;
    }

    public void setCodigoEPS(String codigoEPS) {
        this.codigoEPS = codigoEPS;
    }

    public String getNombreEPS() {
        return nombreEPS;
    }

    public void setNombreEPS(String nombreEPS) {
        this.nombreEPS = nombreEPS;
    }

    public String getDireccionEPS() {
        return direccionEPS;
    }

    public void setDireccionEPS(String direccionEPS) {
        this.direccionEPS = direccionEPS;
    }

    public String getCiudadEPS() {
        return ciudadEPS;
    }

    public void setCiudadEPS(String ciudadEPS) {
        this.ciudadEPS = ciudadEPS;
    }

    public String getTelefonoEPS() {
        return telefonoEPS;
    }

    public void setTelefonoEPS(String telefonoEPS) {
        this.telefonoEPS = telefonoEPS;
    }

    public String getEmailEPS() {
        return emailEPS;
    }

    public void setEmailEPS(String emailEPS) {
        this.emailEPS = emailEPS;
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
        hash += (idEps != null ? idEps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eps)) {
            return false;
        }
        Eps other = (Eps) object;
        if ((this.idEps == null && other.idEps != null) || (this.idEps != null && !this.idEps.equals(other.idEps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Eps[ idEps=" + idEps + " ]";
    }
    
}
