package com.diegoorozco.entities;

import com.diegoorozco.entities.Cliente;
import com.diegoorozco.entities.Cotizacion;
import com.diegoorozco.entities.Detallefacturacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:49:46")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, String> descripcion;
    public static volatile SingularAttribute<Facturacion, Double> total;
    public static volatile SingularAttribute<Facturacion, Date> nombrefactura;
    public static volatile ListAttribute<Facturacion, Detallefacturacion> detallefacturacionList;
    public static volatile SingularAttribute<Facturacion, Integer> idfacturacion;
    public static volatile SingularAttribute<Facturacion, Integer> productosIdproductos;
    public static volatile SingularAttribute<Facturacion, Cotizacion> cotizacionIdcotizacion;
    public static volatile SingularAttribute<Facturacion, Cliente> idcliente;

}