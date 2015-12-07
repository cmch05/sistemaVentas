/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bc;

import be.TipoEmpleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author argos
 */
@Stateless
public class TipoEmpleadoFacade extends AbstractFacade<TipoEmpleado> implements TipoEmpleadoFacadeLocal {
    @PersistenceContext(unitName = "sistema-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoEmpleadoFacade() {
        super(TipoEmpleado.class);
    }

}
