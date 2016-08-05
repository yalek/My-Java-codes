
package commissionemployeetest;

public class CommissionEmployee extends Object {
private String firstName;
private String lastName;
private String socialsecuritynumber;
private double gross;
private double commission;

public CommissionEmployee(String first, String last, String ssn, double gros, double comm){
    firstName = first;
    lastName = last;
    socialsecuritynumber=ssn;
    gross = gros;
    commission = comm;

}
public void setFirstName(String first){
firstName=first;
}
public String getFirstName(){
return firstName;
}
public void setLastName(String last){
lastName=last;
}
public String getlastName(){
return lastName;
}
public void setSocialSecurity(String ssn){
socialsecuritynumber=ssn;
}
public String getSocialSecurity(){
return socialsecuritynumber;
}
public void setGross(double gros){
    if(gros>=0.0)
    gross=gros;
    else
        throw new IllegalArgumentException("Gross sales must be >= 0.0");
}
public double getGross(){
return gross;
}
public void setCommission(double comm){
    if(comm>0.0 && comm<1.0)
    commission=comm;
    else
        throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
}
public double getCommission(){
return commission;
}
public double earnings(){

    return commission*gross;
}

@Override
public String toString(){

return String.format("%s %s %s\n%s%s\n%s %.2f\n%S%.2f\n%s%.2f",
        "Commission employee",getFirstName(), 
        getlastName(),"Social security no:",getSocialSecurity(), 
        "Gross sales: ", getGross(),"Commission",getCommission(),"Earnings", earnings());

}

}
