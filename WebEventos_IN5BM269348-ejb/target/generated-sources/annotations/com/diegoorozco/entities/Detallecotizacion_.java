package com.diegoorozco.entities;

import com.diegoorozco.entities.Cotizacion;
import com.diegoorozco.entities.Productos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:49:46")
@StaticMetamodel(Detallecotizacion.class)
public class Detallecotizacion_ { 

    public static volatile SingularAttribute<Detallecotizacion, String> descripcion;
    public static volatile SingularAttribute<Detallecotizacion, Integer> iddetallecotizacion;
    public static volatile SingularAttribute<Detallecotizacion, Productos> productosIdproductos;
    public static volatile SingularAttribute<Detallecotizacion, String> cantidad;
    public static volatile SingularAttribute<Detallecotizacion, String> precioventa;
    public static volatile SingularAttribute<Detallecotizacion, Cotizacion> cotizacionIdcotizacion;

}