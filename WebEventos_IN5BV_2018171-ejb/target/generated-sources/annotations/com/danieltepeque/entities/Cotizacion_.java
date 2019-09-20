package com.danieltepeque.entities;

import com.danieltepeque.entities.Detallecotizacion;
import com.danieltepeque.entities.Facturacion;
import com.danieltepeque.entities.Reservaciones;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Cotizacion.class)
public class Cotizacion_ { 

    public static volatile SingularAttribute<Cotizacion, Date> fechacotizacion;
    public static volatile SingularAttribute<Cotizacion, Detallecotizacion> iddetallecotizacion;
    public static volatile SingularAttribute<Cotizacion, Integer> idcotizacion;
    public static volatile ListAttribute<Cotizacion, Facturacion> facturacionList;
    public static volatile SingularAttribute<Cotizacion, Reservaciones> idreservacion;

}