package com.danieltepeque.entities;

import com.danieltepeque.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Salon.class)
public class Salon_ { 

    public static volatile SingularAttribute<Salon, String> descripcion;
    public static volatile ListAttribute<Salon, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Salon, Integer> idsalon;

}