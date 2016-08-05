
package employeepolymorphismabstract;

public class BasePlusCommissionEmployee extends CommissionEmployee {
private double baseSalary;

    public BasePlusCommissionEmployee(String first, String last, String ssn,double sales, double commission, double salary){
    
    super(first, last, ssn, sales, commission);
    setBaseSalary(salary);
    }
    
    public void setBaseSalary(double salary){
        if(salary>=0.0)
            baseSalary=salary;
        else
            throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
    public double getBaseSalary(){
    return baseSalary;}
    
    @Override
    public double earning(){
    return baseSalary + super.earning();
    }
    
    @Override
    public String toString(){
    return String.format("%s %s\n%s %.2f", "Base Plus Commission Employee: ",super.toString(),"Base Salary", getBaseSalary());
    }
}
