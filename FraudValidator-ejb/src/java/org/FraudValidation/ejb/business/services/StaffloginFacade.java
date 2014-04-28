/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.FraudValidation.ejb.business.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.FraudValidation.ejb.business.domain.Stafflogin;

/**
 *
 * @author Lebogang
 */
@Stateless
public class StaffloginFacade extends AbstractFacade<Stafflogin> implements StaffloginFacadeLocal {
    @PersistenceContext(unitName = "FraudValidator-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StaffloginFacade() {
        super(Stafflogin.class);
    }
    
    @Override
    public boolean validateLogin(String uName, String pass){
       Query query = em.createNamedQuery("Stafflogin.findAll");
       boolean isLogin = false;
       if(query.getMaxResults() != 0){
           if (uName.equalsIgnoreCase(query.getParameter("UserName").toString()) && pass.equals(query.getParameter("Password").toString())){
            isLogin = true;
        }
       }
       return isLogin;  
    }
    
    public List staffInformation(String uName){
        List staffInfoList = null;
        Query query = em.createNamedQuery("Stafflogin.findByUserName");
        if(query.getMaxResults() != 0){
            staffInfoList.add(query.getParameter("EntityNum"));
            staffInfoList.add(query.getParameter("FirstName"));
            staffInfoList.add(query.getParameter("LastName"));
            staffInfoList.add(query.getParameter("EmailAddress"));
            staffInfoList.add(query.getParameter("JobTitle"));
        }
        return staffInfoList;
    }
    
}
