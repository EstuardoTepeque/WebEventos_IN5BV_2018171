package com.danieltepeque.entities;

import com.danieltepeque.entities.Cotizacion;
import com.danieltepeque.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Detallecotizacion.class)
public class Detallecotizacion_ { 

    public static volatile SingularAttribute<Detallecotizacion, Double> precio;
    public static volatile SingularAttribute<Detallecotizacion, Productos> idproductos;
    public static volatile SingularAttribute<Detallecotizacion, Integer> iddetallecotizacion;
    public static volatile ListAttribute<Detallecotizacion, Cotizacion> cotizacionList;
    public static volatile SingularAttribute<Detallecotizacion, Integer> cantidad;

}