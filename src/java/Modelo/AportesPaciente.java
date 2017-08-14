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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "aportes_paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AportesPaciente.findAll", query = "SELECT a FROM AportesPaciente a")
    , @NamedQuery(name = "AportesPaciente.findByIdAportesPaciente", query = "SELECT a FROM AportesPaciente a WHERE a.idAportesPaciente = :idAportesPaciente")})
public class AportesPaciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idAportes_Paciente")
    private Integer idAportesPaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aportesPaciente")
    private List<Paciente> pacienteList;
    @JoinColumn(name = "Eps_idEps", referencedColumnName = "idEps")
    @ManyToOne(optional = false)
    private Eps epsidEps;
    @JoinColumn(name = "arl_idarl", referencedColumnName = "idarl")
    @ManyToOne(optional = false)
    private Arl arlIdarl;
    @JoinColumn(name = "fondoPensiones_idfondoPensiones", referencedColumnName = "idfondoPensiones")
    @ManyToOne(optional = false)
    private Fondopensiones fondoPensionesidfondoPensiones;

    public AportesPaciente() {
    }

    public AportesPaciente(Integer idAportesPaciente) {
        this.idAportesPaciente = idAportesPaciente;
    }

    public Integer getIdAportesPaciente() {
        return idAportesPaciente;
    }

    public void setIdAportesPaciente(Integer idAportesPaciente) {
        this.idAportesPaciente = idAportesPaciente;
    }

    @XmlTransient
    public List<Paciente> getPacienteList() {
        return pacienteList;
    }

    public void setPacienteList(List<Paciente> pacienteList) {
        this.pacienteList = pacienteList;
    }

    public Eps getEpsidEps() {
        return epsidEps;
    }

    public void setEpsidEps(Eps epsidEps) {
        this.epsidEps = epsidEps;
    }

    public Arl getArlIdarl() {
        return arlIdarl;
    }

    public void setArlIdarl(Arl arlIdarl) {
        this.arlIdarl = arlIdarl;
    }

    public Fondopensiones getFondoPensionesidfondoPensiones() {
        return fondoPensionesidfondoPensiones;
    }

    public void setFondoPensionesidfondoPensiones(Fondopensiones fondoPensionesidfondoPensiones) {
        this.fondoPensionesidfondoPensiones = fondoPensionesidfondoPensiones;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAportesPaciente != null ? idAportesPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AportesPaciente)) {
            return false;
        }
        AportesPaciente other = (AportesPaciente) object;
        if ((this.idAportesPaciente == null && other.idAportesPaciente != null) || (this.idAportesPaciente != null && !this.idAportesPaciente.equals(other.idAportesPaciente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.AportesPaciente[ idAportesPaciente=" + idAportesPaciente + " ]";
    }
    
}
