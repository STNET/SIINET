/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.logica.seguridad;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.st.entidad.seguridad.TbSucursal;

/**
 *
 * @author camilo
 */
@Stateless
public class TbSucursalFacade extends AbstractFacade<TbSucursal> {
    @PersistenceContext(unitName = "PSiiNetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbSucursalFacade() {
        super(TbSucursal.class);
    }
    
}
