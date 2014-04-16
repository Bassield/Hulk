package org.FraudValidation.ejb.business.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.FraudValidation.ejb.business.domain.Customerpersonaldetails;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2014-04-16T03:09:23")
@StaticMetamodel(Customeraccountdetails.class)
public class Customeraccountdetails_ { 

    public static volatile SingularAttribute<Customeraccountdetails, Float> balance;
    public static volatile SingularAttribute<Customeraccountdetails, Integer> accountNumber;
    public static volatile SingularAttribute<Customeraccountdetails, String> paymentStatus;
    public static volatile SingularAttribute<Customeraccountdetails, Float> amountDue;
    public static volatile SingularAttribute<Customeraccountdetails, Customerpersonaldetails> iDNo;

}