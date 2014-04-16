package org.FraudValidation.ejb.business.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.FraudValidation.ejb.business.domain.Customerpersonaldetails;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2014-04-16T03:09:23")
@StaticMetamodel(Customerbankingdetails.class)
public class Customerbankingdetails_ { 

    public static volatile SingularAttribute<Customerbankingdetails, Date> paymentDate;
    public static volatile SingularAttribute<Customerbankingdetails, Integer> bankAccountNum;
    public static volatile SingularAttribute<Customerbankingdetails, String> bankName;
    public static volatile SingularAttribute<Customerbankingdetails, Customerpersonaldetails> iDNumber;

}