package com.danieltepeque.entities;

import com.danieltepeque.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Sucursal.class)
public class Sucursal_ { 

    public static volatile SingularAttribute<Sucursal, String> descripcion;
    public static volatile ListAttribute<Sucursal, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Sucursal, Integer> idsucursal;

}