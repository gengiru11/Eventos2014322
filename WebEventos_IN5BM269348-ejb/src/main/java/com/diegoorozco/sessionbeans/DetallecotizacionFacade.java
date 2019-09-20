/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegoorozco.sessionbeans;

import com.diegoorozco.entities.Detallecotizacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class DetallecotizacionFacade extends AbstractFacade<Detallecotizacion> implements DetallecotizacionFacadeLocal {

    @PersistenceContext(unitName = "WebEventos_IN5BV_2014322PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DetallecotizacionFacade() {
        super(Detallecotizacion.class);
    }
    
}
