package com.diegoorozco.entities;

import com.diegoorozco.entities.Detallecotizacion;
import com.diegoorozco.entities.Detallefacturacion;
import com.diegoorozco.entities.Tipoproducto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:49:46")
@StaticMetamodel(Productos.class)
public class Productos_ { 

    public static volatile SingularAttribute<Productos, String> descripcion;
    public static volatile SingularAttribute<Productos, Integer> idproductos;
    public static volatile ListAttribute<Productos, Detallecotizacion> detallecotizacionList;
    public static volatile ListAttribute<Productos, Detallefacturacion> detallefacturacionList;
    public static volatile SingularAttribute<Productos, Double> precioVenta;
    public static volatile SingularAttribute<Productos, Tipoproducto> tipoproductoIdtipoproducto;

}