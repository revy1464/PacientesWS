/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Arl;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface ArlFacadeLocal {

    void create(Arl arl);

    void edit(Arl arl);

    void remove(Arl arl);

    Arl find(Object id);

    List<Arl> findAll();

    List<Arl> findRange(int[] range);

    int count();
    
}
