package com.danieltepeque.entities;

import com.danieltepeque.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Tipoproductos.class)
public class Tipoproductos_ { 

    public static volatile SingularAttribute<Tipoproductos, String> descripcion;
    public static volatile SingularAttribute<Tipoproductos, Integer> idtipoproductos;
    public static volatile ListAttribute<Tipoproductos, Productos> productosList;

}