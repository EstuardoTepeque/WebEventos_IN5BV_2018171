package com.danieltepeque.entities;

import com.danieltepeque.entities.Facturacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Detallefactura.class)
public class Detallefactura_ { 

    public static volatile SingularAttribute<Detallefactura, Double> precio;
    public static volatile SingularAttribute<Detallefactura, Integer> idproductos;
    public static volatile SingularAttribute<Detallefactura, Facturacion> idfacturacion;
    public static volatile SingularAttribute<Detallefactura, Integer> cantidad;
    public static volatile SingularAttribute<Detallefactura, Integer> iddetallefactura;

}