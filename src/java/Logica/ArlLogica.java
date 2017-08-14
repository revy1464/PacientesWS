/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;


import Modelo.Arl;
import Persistencia.ArlFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Usuario
 */
@Stateless
public class ArlLogica implements ArlLogicaLocal {
    @EJB
    private ArlFacadeLocal arlFacade;

    @Override
    public void crearArl(Arl a) throws Exception {
        arlFacade.create(a);
    }

    @Override
    public void modificarArl(Arl a) throws Exception {
        arlFacade.edit(a);
    }

    @Override
    public void eliminarArl(Arl a) throws Exception {
        arlFacade.remove(a);
    }

    @Override
    public Arl consultarArl(int idArl) throws Exception {
        return arlFacade.find(idArl);
    }

    @Override
    public List<Arl> arls() throws Exception {
        return arlFacade.findAll();
    }
    
    @Override
    public Arl consultarArlbyCodigo(String codigoArl) throws Exception {                
        Arl a=new Arl();
        List<Arl> listaArls=arlFacade.findAll();        
        for (int i = 0; i < arlFacade.count(); i++) {
            if((listaArls.get(i).getCodigoARL()).equals(codigoArl)){
                a=listaArls.get(i);
            }
        }
        return a;
    }
    
    
}
