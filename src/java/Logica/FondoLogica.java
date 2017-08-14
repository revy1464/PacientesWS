/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Fondopensiones;
import Persistencia.FondopensionesFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class FondoLogica implements FondoLogicaLocal {
    @EJB
    private FondopensionesFacadeLocal fondoFacade;

    @Override
    public void crearFondo(Fondopensiones fondo) throws Exception {
        fondoFacade.create(fondo);
    }

    @Override
    public void modificarFondo(Fondopensiones fondo) throws Exception {
        fondoFacade.edit(fondo);
    }

    @Override
    public void eliminarFondo(Fondopensiones fondo) throws Exception {
        fondoFacade.remove(fondo);
    }

    @Override
    public Fondopensiones consultarFondo(int idFondo) throws Exception {
        return fondoFacade.find(idFondo);
    }

    @Override
    public List<Fondopensiones> fondos() throws Exception {
        return fondoFacade.findAll();
    }

    @Override
    public Fondopensiones consultarFondobyCodigo(String codigoFondo) throws Exception {                
        Fondopensiones fondo=new Fondopensiones();
        List<Fondopensiones> listFondos=fondoFacade.findAll();
        System.out.println("Logica.FondoLogica.consultarFondobyCodigo()");
        for (int i = 0; i < fondoFacade.count(); i++) {
            System.out.println(listFondos.get(i).toString());
            System.out.println(codigoFondo);
            if((listFondos.get(i).getCodigoFondo()).equals(codigoFondo)){
                fondo=listFondos.get(i);
                System.out.println("yes");
            }
        }
        System.out.println("Logica.FondoLogica.consultarFondobyCodigo() Fondo"+fondo.getIdfondoPensiones());
        return fondo;
    }

}
