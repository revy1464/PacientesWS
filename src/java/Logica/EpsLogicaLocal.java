/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Eps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface EpsLogicaLocal {
    public void crearEps(Eps e) throws Exception;
    public void modificarEps(Eps e) throws Exception;
    public void eliminarEps(Eps e) throws Exception;
    public Eps consultarEps(int idEps) throws Exception;
    public Eps consultarEpsbyCodigo(String codigoEps) throws Exception;
    public List<Eps> eps_s() throws Exception;
}
