/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Fondopensiones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FondoLogicaLocal {
        public void crearFondo(Fondopensiones fondo) throws Exception;
    public void modificarFondo(Fondopensiones fondo) throws Exception;
    public void eliminarFondo(Fondopensiones fondo) throws Exception;
    public Fondopensiones consultarFondo(int idFondo) throws Exception;
    public Fondopensiones consultarFondobyCodigo(String codigoFondo) throws Exception;
    public List<Fondopensiones> fondos() throws Exception;
}
