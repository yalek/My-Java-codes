
package payableinterfacetest;

public class SalariedEmployee extends Employee {
    private double Esalary;
    
    public SalariedEmployee(String first, String last, String ssn, double salary){
    super(first, last, ssn);
    setESalary(salary);
    }
    
    public void setESalary(double salary){
    if(salary >= 0.0)
        Esalary = salary;
    else
        throw new IllegalArgumentException("Salary must  be greater than 0.0");
    }
    public double getESalary(){return Esalary;}
@Override
public double getPaymentAmount(){
return Esalary;}

@Override
public String toString(){
return String.format("%s %s\n%s %.2f\n","Salaried Employee",super.toString(),"Salary",getESalary());
}
}
