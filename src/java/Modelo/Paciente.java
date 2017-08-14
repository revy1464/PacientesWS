/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Usuario
 */
@Entity
@Table(name = "paciente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paciente.findAll", query = "SELECT p FROM Paciente p")
    , @NamedQuery(name = "Paciente.findByIdPaciente", query = "SELECT p FROM Paciente p WHERE p.pacientePK.idPaciente = :idPaciente")
    , @NamedQuery(name = "Paciente.findByCedulaPaciente", query = "SELECT p FROM Paciente p WHERE p.cedulaPaciente = :cedulaPaciente")
    , @NamedQuery(name = "Paciente.findByNombrePaciente", query = "SELECT p FROM Paciente p WHERE p.nombrePaciente = :nombrePaciente")
    , @NamedQuery(name = "Paciente.findByApellidoPaciente", query = "SELECT p FROM Paciente p WHERE p.apellidoPaciente = :apellidoPaciente")
    , @NamedQuery(name = "Paciente.findByTelefonoPaciente", query = "SELECT p FROM Paciente p WHERE p.telefonoPaciente = :telefonoPaciente")
    , @NamedQuery(name = "Paciente.findByDireccionPaciente", query = "SELECT p FROM Paciente p WHERE p.direccionPaciente = :direccionPaciente")
    , @NamedQuery(name = "Paciente.findByCiudadPaciente", query = "SELECT p FROM Paciente p WHERE p.ciudadPaciente = :ciudadPaciente")
    , @NamedQuery(name = "Paciente.findByDepartamenPaciente", query = "SELECT p FROM Paciente p WHERE p.departamenPaciente = :departamenPaciente")
    , @NamedQuery(name = "Paciente.findByFechaNacimientoPaciente", query = "SELECT p FROM Paciente p WHERE p.fechaNacimientoPaciente = :fechaNacimientoPaciente")
    , @NamedQuery(name = "Paciente.findByLugarNacimientoPaciente", query = "SELECT p FROM Paciente p WHERE p.lugarNacimientoPaciente = :lugarNacimientoPaciente")
    , @NamedQuery(name = "Paciente.findBySexoPaciente", query = "SELECT p FROM Paciente p WHERE p.sexoPaciente = :sexoPaciente")
    , @NamedQuery(name = "Paciente.findByEstadoCivilPaciente", query = "SELECT p FROM Paciente p WHERE p.estadoCivilPaciente = :estadoCivilPaciente")
    , @NamedQuery(name = "Paciente.findByOcupacionPaciente", query = "SELECT p FROM Paciente p WHERE p.ocupacionPaciente = :ocupacionPaciente")
    , @NamedQuery(name = "Paciente.findByEscolaridadPaciente", query = "SELECT p FROM Paciente p WHERE p.escolaridadPaciente = :escolaridadPaciente")
    , @NamedQuery(name = "Paciente.findByFotoPaciente", query = "SELECT p FROM Paciente p WHERE p.fotoPaciente = :fotoPaciente")
    , @NamedQuery(name = "Paciente.findByAportesPacienteidAportesPaciente", query = "SELECT p FROM Paciente p WHERE p.pacientePK.aportesPacienteidAportesPaciente = :aportesPacienteidAportesPaciente")})
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PacientePK pacientePK;
    @Size(max = 45)
    @Column(name = "cedulaPaciente")
    private String cedulaPaciente;
    @Size(max = 45)
    @Column(name = "nombrePaciente")
    private String nombrePaciente;
    @Size(max = 45)
    @Column(name = "apellidoPaciente")
    private String apellidoPaciente;
    @Size(max = 45)
    @Column(name = "telefonoPaciente")
    private String telefonoPaciente;
    @Size(max = 45)
    @Column(name = "direccionPaciente")
    private String direccionPaciente;
    @Size(max = 45)
    @Column(name = "ciudadPaciente")
    private String ciudadPaciente;
    @Size(max = 45)
    @Column(name = "departamenPaciente")
    private String departamenPaciente;
    @Size(max = 45)
    @Column(name = "fechaNacimientoPaciente")
    private String fechaNacimientoPaciente;
    @Size(max = 45)
    @Column(name = "lugarNacimientoPaciente")
    private String lugarNacimientoPaciente;
    @Size(max = 45)
    @Column(name = "sexoPaciente")
    private String sexoPaciente;
    @Size(max = 45)
    @Column(name = "estadoCivilPaciente")
    private String estadoCivilPaciente;
    @Size(max = 45)
    @Column(name = "ocupacionPaciente")
    private String ocupacionPaciente;
    @Size(max = 45)
    @Column(name = "escolaridadPaciente")
    private String escolaridadPaciente;
    @Size(max = 100)
    @Column(name = "fotoPaciente")
    private String fotoPaciente;
    @JoinColumn(name = "Aportes_Paciente_idAportes_Paciente", referencedColumnName = "idAportes_Paciente", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AportesPaciente aportesPaciente;

    public Paciente() {
    }

    public Paciente(PacientePK pacientePK) {
        this.pacientePK = pacientePK;
    }

    public Paciente(int idPaciente, int aportesPacienteidAportesPaciente) {
        this.pacientePK = new PacientePK(idPaciente, aportesPacienteidAportesPaciente);
    }

    public PacientePK getPacientePK() {
        return pacientePK;
    }

    public void setPacientePK(PacientePK pacientePK) {
        this.pacientePK = pacientePK;
    }

    public String getCedulaPaciente() {
        return cedulaPaciente;
    }

    public void setCedulaPaciente(String cedulaPaciente) {
        this.cedulaPaciente = cedulaPaciente;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getApellidoPaciente() {
        return apellidoPaciente;
    }

    public void setApellidoPaciente(String apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public String getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public void setTelefonoPaciente(String telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public String getDireccionPaciente() {
        return direccionPaciente;
    }

    public void setDireccionPaciente(String direccionPaciente) {
        this.direccionPaciente = direccionPaciente;
    }

    public String getCiudadPaciente() {
        return ciudadPaciente;
    }

    public void setCiudadPaciente(String ciudadPaciente) {
        this.ciudadPaciente = ciudadPaciente;
    }

    public String getDepartamenPaciente() {
        return departamenPaciente;
    }

    public void setDepartamenPaciente(String departamenPaciente) {
        this.departamenPaciente = departamenPaciente;
    }

    public String getFechaNacimientoPaciente() {
        return fechaNacimientoPaciente;
    }

    public void setFechaNacimientoPaciente(String fechaNacimientoPaciente) {
        this.fechaNacimientoPaciente = fechaNacimientoPaciente;
    }

    public String getLugarNacimientoPaciente() {
        return lugarNacimientoPaciente;
    }

    public void setLugarNacimientoPaciente(String lugarNacimientoPaciente) {
        this.lugarNacimientoPaciente = lugarNacimientoPaciente;
    }

    public String getSexoPaciente() {
        return sexoPaciente;
    }

    public void setSexoPaciente(String sexoPaciente) {
        this.sexoPaciente = sexoPaciente;
    }

    public String getEstadoCivilPaciente() {
        return estadoCivilPaciente;
    }

    public void setEstadoCivilPaciente(String estadoCivilPaciente) {
        this.estadoCivilPaciente = estadoCivilPaciente;
    }

    public String getOcupacionPaciente() {
        return ocupacionPaciente;
    }

    public void setOcupacionPaciente(String ocupacionPaciente) {
        this.ocupacionPaciente = ocupacionPaciente;
    }

    public String getEscolaridadPaciente() {
        return escolaridadPaciente;
    }

    public void setEscolaridadPaciente(String escolaridadPaciente) {
        this.escolaridadPaciente = escolaridadPaciente;
    }

    public String getFotoPaciente() {
        return fotoPaciente;
    }

    public void setFotoPaciente(String fotoPaciente) {
        this.fotoPaciente = fotoPaciente;
    }

    public AportesPaciente getAportesPaciente() {
        return aportesPaciente;
    }

    public void setAportesPaciente(AportesPaciente aportesPaciente) {
        this.aportesPaciente = aportesPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pacientePK != null ? pacientePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paciente)) {
            return false;
        }
        Paciente other = (Paciente) object;
        if ((this.pacientePK == null && other.pacientePK != null) || (this.pacientePK != null && !this.pacientePK.equals(other.pacientePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.Paciente[ pacientePK=" + pacientePK + " ]";
    }
    
}
