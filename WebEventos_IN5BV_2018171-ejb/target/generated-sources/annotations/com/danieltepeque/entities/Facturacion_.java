package com.danieltepeque.entities;

import com.danieltepeque.entities.Cotizacion;
import com.danieltepeque.entities.Detallefactura;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, String> descripcion;
    public static volatile ListAttribute<Facturacion, Detallefactura> detallefacturaList;
    public static volatile SingularAttribute<Facturacion, Cotizacion> idcotizacion;
    public static volatile SingularAttribute<Facturacion, Integer> idfacturacion;

}