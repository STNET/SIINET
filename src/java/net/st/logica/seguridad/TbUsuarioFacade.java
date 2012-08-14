/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.st.logica.seguridad;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import net.st.entidad.seguridad.TbUsuario;

/**
 *
 * @author camilo
 */
@Stateless
public class TbUsuarioFacade extends AbstractFacade<TbUsuario> {
    @PersistenceContext(unitName = "PSiiNetPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TbUsuarioFacade() {
        super(TbUsuario.class);
    }
    
}
