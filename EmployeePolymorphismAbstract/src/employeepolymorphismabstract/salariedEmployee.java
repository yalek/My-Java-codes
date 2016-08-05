
package employeepolymorphismabstract;

public class salariedEmployee extends Employee {

    private double weeklySalary;
    
    public salariedEmployee(String first, String last, String ssn, double salary){
        super(first, last,ssn);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary(double salary){
        if(salary>0.0)
            weeklySalary = salary;
        else
            throw new IllegalArgumentException("Salary must be greater than 0.0");
    }
    public double getWeeklySalary(){
    return weeklySalary;
    }
    @Override
    public double earning(){
    return weeklySalary;
    }
    @Override
    public String toString(){
    
    return String.format("Salaried employee: %s,%s %.2f ", super.toString(),"WeeklySalary: ", getWeeklySalary());
    }
}
