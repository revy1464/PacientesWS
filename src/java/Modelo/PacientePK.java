/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Usuario
 */
@Embeddable
public class PacientePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idPaciente")
    private int idPaciente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Aportes_Paciente_idAportes_Paciente")
    private int aportesPacienteidAportesPaciente;

    public PacientePK() {
    }

    public PacientePK(int idPaciente, int aportesPacienteidAportesPaciente) {
        this.idPaciente = idPaciente;
        this.aportesPacienteidAportesPaciente = aportesPacienteidAportesPaciente;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getAportesPacienteidAportesPaciente() {
        return aportesPacienteidAportesPaciente;
    }

    public void setAportesPacienteidAportesPaciente(int aportesPacienteidAportesPaciente) {
        this.aportesPacienteidAportesPaciente = aportesPacienteidAportesPaciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPaciente;
        hash += (int) aportesPacienteidAportesPaciente;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacientePK)) {
            return false;
        }
        PacientePK other = (PacientePK) object;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.aportesPacienteidAportesPaciente != other.aportesPacienteidAportesPaciente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelo.PacientePK[ idPaciente=" + idPaciente + ", aportesPacienteidAportesPaciente=" + aportesPacienteidAportesPaciente + " ]";
    }
    
}
