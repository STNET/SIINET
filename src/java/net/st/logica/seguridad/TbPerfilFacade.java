/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.logica.seguridad;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.st.entidad.seguridad.TbPerfil;

/**
 *
 * @author camilo
 */
@Stateless
public class TbPerfilFacade extends AbstractFacade<TbPerfil> {
    @PersistenceContext(unitName = "PSiiNetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbPerfilFacade() {
        super(TbPerfil.class);
    }
    
}
