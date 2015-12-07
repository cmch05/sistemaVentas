/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bc;

import be.MateriaPrima;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author argos
 */
@Stateless
public class MateriaPrimaFacade extends AbstractFacade<MateriaPrima> implements MateriaPrimaFacadeLocal {
    @PersistenceContext(unitName = "sistema-ejbPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public MateriaPrimaFacade() {
        super(MateriaPrima.class);
    }

}
