/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.logica.seguridad;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.st.entidad.seguridad.TbModulo;

/**
 *
 * @author camilo
 */
@Stateless
public class TbModuloFacade extends AbstractFacade<TbModulo> {
    @PersistenceContext(unitName = "PSiiNetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbModuloFacade() {
        super(TbModulo.class);
    }
    
}
