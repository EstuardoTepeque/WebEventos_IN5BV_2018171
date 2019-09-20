package com.danieltepeque.entities;

import com.danieltepeque.entities.Detallecotizacion;
import com.danieltepeque.entities.Tipoproductos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Detallecotizacion> detallecotizacionList;
    public static volatile SingularAttribute<Productos, Tipoproductos> idtipoproductos;

}