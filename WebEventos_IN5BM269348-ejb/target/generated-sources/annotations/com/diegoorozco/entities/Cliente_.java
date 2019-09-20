package com.diegoorozco.entities;

import com.diegoorozco.entities.Facturacion;
import com.diegoorozco.entities.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-20T12:49:46")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> apellidos;
    public static volatile SingularAttribute<Cliente, String> telefono;
    public static volatile SingularAttribute<Cliente, String> dpi;
    public static volatile ListAttribute<Cliente, Facturacion> facturacionList;
    public static volatile SingularAttribute<Cliente, Integer> idcliente;
    public static volatile ListAttribute<Cliente, Reservacion> reservacionList;
    public static volatile SingularAttribute<Cliente, String> email;
    public static volatile SingularAttribute<Cliente, String> nombres;

}