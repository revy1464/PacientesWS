/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Arl;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface ArlLogicaLocal {
        public void crearArl(Arl a) throws Exception;
    public void modificarArl(Arl a) throws Exception;
    public void eliminarArl(Arl a) throws Exception;
    public Arl consultarArl(int idArl) throws Exception;
        public Arl consultarArlbyCodigo(String codigoArl) throws Exception;                

    public List<Arl> arls() throws Exception;
}
