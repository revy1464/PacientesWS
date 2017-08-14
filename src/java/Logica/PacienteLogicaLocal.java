/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Paciente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface PacienteLogicaLocal {
            public void crearPaciente(Paciente p) throws Exception;
    public void modificarArl(Paciente p) throws Exception;
    public void eliminarArl(Paciente p) throws Exception;
    public Paciente consultarArl(int idPaciente) throws Exception;
    public List<Paciente> pacientesAll() throws Exception;
}
