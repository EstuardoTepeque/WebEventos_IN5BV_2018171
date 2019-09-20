package com.danieltepeque.entities;

import com.danieltepeque.entities.Reservaciones;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:59:13")
@StaticMetamodel(Motivoreservacion.class)
public class Motivoreservacion_ { 

    public static volatile SingularAttribute<Motivoreservacion, Short> aniversario;
    public static volatile SingularAttribute<Motivoreservacion, Short> cumpleaños;
    public static volatile SingularAttribute<Motivoreservacion, Short> boda;
    public static volatile SingularAttribute<Motivoreservacion, String> otro;
    public static volatile ListAttribute<Motivoreservacion, Reservaciones> reservacionesList;
    public static volatile SingularAttribute<Motivoreservacion, Integer> idmotivoreservacion;
    public static volatile SingularAttribute<Motivoreservacion, Short> graduacion;

}