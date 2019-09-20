package com.diegoorozco.entities;

import com.diegoorozco.entities.Area;
import com.diegoorozco.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:49:46")
@StaticMetamodel(Lugarevento.class)
public class Lugarevento_ { 

    public static volatile SingularAttribute<Lugarevento, String> descripcion;
    public static volatile SingularAttribute<Lugarevento, Area> areaidArea;
    public static volatile ListAttribute<Lugarevento, Reservacion> reservacionList;
    public static volatile SingularAttribute<Lugarevento, Integer> idlugarevento;

}