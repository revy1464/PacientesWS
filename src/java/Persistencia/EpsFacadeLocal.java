/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Eps;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface EpsFacadeLocal {

    void create(Eps eps);

    void edit(Eps eps);

    void remove(Eps eps);

    Eps find(Object id);

    List<Eps> findAll();

    List<Eps> findRange(int[] range);

    int count();
    
}
