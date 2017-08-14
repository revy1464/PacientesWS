/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Paciente;
import Persistencia.PacienteFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class PacienteLogica implements PacienteLogicaLocal {
    
    @EJB
    private PacienteFacadeLocal pacienteFacade;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void crearPaciente(Paciente p) throws Exception {
        pacienteFacade.create(p);
    }

    @Override
    public void modificarArl(Paciente p) throws Exception {
        pacienteFacade.edit(p);
    }

    @Override
    public void eliminarArl(Paciente p) throws Exception {
        pacienteFacade.remove(p);
    }

    @Override
    public Paciente consultarArl(int idPaciente) throws Exception {
        return pacienteFacade.find(idPaciente);
    }

    @Override
    public List<Paciente> pacientesAll() throws Exception {
        return pacienteFacade.findAll();
    }
    
}
