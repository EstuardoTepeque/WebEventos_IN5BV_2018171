/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danieltepeque.sessionsBeans;

import com.danieltepeque.entities.Salon;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface SalonFacadeLocal {

    void create(Salon salon);

    void edit(Salon salon);

    void remove(Salon salon);

    Salon find(Object id);

    List<Salon> findAll();

    List<Salon> findRange(int[] range);

    int count();
    
}
