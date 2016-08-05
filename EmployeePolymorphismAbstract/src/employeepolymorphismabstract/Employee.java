
package employeepolymorphismabstract;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    
    public Employee(String first, String last, String ssn){
    firstName = first;
    lastName = last;
    socialSecurityNumber = ssn;
    }
    
    public void setFirstName(String first){firstName = first;}
    public String getFirstName(){return firstName;}
    
    public void setLastName(String last){lastName = last;}
    public String getLastName(){return lastName;}
    
    public void setSsn(String ssn){socialSecurityNumber=ssn;}
    public String getSsn(){return socialSecurityNumber;}
    
    @Override
    public String toString(){
        return String.format("%s %s\nSocial Security Number: %s", getFirstName(),getLastName(),getSsn());}
    
    public abstract double earning();
}



