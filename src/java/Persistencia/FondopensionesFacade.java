/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Fondopensiones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Usuario
 */
@Stateless
public class FondopensionesFacade extends AbstractFacade<Fondopensiones> implements FondopensionesFacadeLocal {

    @PersistenceContext(unitName = "PacientesWSPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FondopensionesFacade() {
        super(Fondopensiones.class);
    }
    
}
