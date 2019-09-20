package com.danieltepeque.entities;

import com.danieltepeque.entities.Cliente;
import com.danieltepeque.entities.Cotizacion;
import com.danieltepeque.entities.Motivoreservacion;
import com.danieltepeque.entities.Salon;
import com.danieltepeque.entities.Sucursal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Reservaciones.class)
public class Reservaciones_ { 

    public static volatile SingularAttribute<Reservaciones, Date> fechainicio;
    public static volatile ListAttribute<Reservaciones, Cotizacion> cotizacionList;
    public static volatile SingularAttribute<Reservaciones, Salon> idsalon;
    public static volatile SingularAttribute<Reservaciones, Date> fechasalida;
    public static volatile SingularAttribute<Reservaciones, Sucursal> idsucursal;
    public static volatile SingularAttribute<Reservaciones, Motivoreservacion> idmotivoreservacion;
    public static volatile SingularAttribute<Reservaciones, Integer> idreservacion;
    public static volatile SingularAttribute<Reservaciones, Cliente> idcliente;

}