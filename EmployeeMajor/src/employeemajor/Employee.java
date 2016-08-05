
package employeemajor;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String first, String last, Date dateOfBirth, Date dateOfHire){
    firstName = first;
    lastName = last;
    birthDate = dateOfBirth;
    hireDate = dateOfBirth;
    }
    public String toString(){
    
    return String.format( "%s, %s Hired: %s Birthday: %s",lastName, firstName, hireDate, birthDate );
    }
            
            

}
