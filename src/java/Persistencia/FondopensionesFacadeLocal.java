/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Modelo.Fondopensiones;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface FondopensionesFacadeLocal {

    void create(Fondopensiones fondopensiones);

    void edit(Fondopensiones fondopensiones);

    void remove(Fondopensiones fondopensiones);

    Fondopensiones find(Object id);

    List<Fondopensiones> findAll();

    List<Fondopensiones> findRange(int[] range);

    int count();
    
}
