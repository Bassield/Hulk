package org.FraudValidation.ejb.business.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.FraudValidation.ejb.business.domain.Customeraccountdetails;
import org.FraudValidation.ejb.business.domain.Customerbankingdetails;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2014-04-16T03:09:23")
@StaticMetamodel(Customerpersonaldetails.class)
public class Customerpersonaldetails_ { 

    public static volatile SingularAttribute<Customerpersonaldetails, Date> dateOfBirth;
    public static volatile SingularAttribute<Customerpersonaldetails, String> contactNumber;
    public static volatile SingularAttribute<Customerpersonaldetails, Customerbankingdetails> customerbankingdetails;
    public static volatile SingularAttribute<Customerpersonaldetails, String> surname;
    public static volatile SingularAttribute<Customerpersonaldetails, String> employeeStatus;
    public static volatile SingularAttribute<Customerpersonaldetails, String> race;
    public static volatile SingularAttribute<Customerpersonaldetails, Integer> iDNumber;
    public static volatile SingularAttribute<Customerpersonaldetails, String> nationality;
    public static volatile ListAttribute<Customerpersonaldetails, Customeraccountdetails> customeraccountdetailsList;
    public static volatile SingularAttribute<Customerpersonaldetails, String> name;
    public static volatile SingularAttribute<Customerpersonaldetails, String> company;
    public static volatile SingularAttribute<Customerpersonaldetails, Character> gender;
    public static volatile SingularAttribute<Customerpersonaldetails, String> postalAddress;
    public static volatile SingularAttribute<Customerpersonaldetails, String> jobTitle;

}