/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.danieltepeque.sessionsBeans;

import com.danieltepeque.entities.Sucursal;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface SucursalFacadeLocal {

    void create(Sucursal sucursal);

    void edit(Sucursal sucursal);

    void remove(Sucursal sucursal);

    Sucursal find(Object id);

    List<Sucursal> findAll();

    List<Sucursal> findRange(int[] range);

    int count();
    
}
