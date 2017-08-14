/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Eps;
import Persistencia.EpsFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class EpsLogica implements EpsLogicaLocal {

    @EJB
    private EpsFacadeLocal epsFacade;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void crearEps(Eps e) throws Exception {
        epsFacade.create(e);
    }

    @Override
    public void modificarEps(Eps e) throws Exception {
        
        epsFacade.edit(e);
    }

    @Override
    public void eliminarEps(Eps e) throws Exception {
        epsFacade.remove(e);
    }

    @Override
    public Eps consultarEps(int idEps) throws Exception {
        return epsFacade.find(idEps);
    }

    @Override
    public List<Eps> eps_s() throws Exception {
        return epsFacade.findAll();
    }

    @Override
    public Eps consultarEpsbyCodigo(String codigoEps) throws Exception {
                Eps e=new Eps();
        List<Eps> listEpses=epsFacade.findAll();        
        for (int i = 0; i < epsFacade.count(); i++) {
            if((listEpses.get(i).getCodigoEPS()).equals(codigoEps)){
                e=listEpses.get(i);
                System.out.println("yes");
            }
        }
        System.out.println("Logica.FondoLogica.consultarFondobyCodigo() Fondo"+e.getCodigoEPS());
        return e;
    }
}
