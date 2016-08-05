
package commissionemployeetest;

public class BaseCommissionEmployee extends CommissionEmployee {
     private double salary;
     
    public BaseCommissionEmployee(String first, String last,String ssn, 
        double gros, double comm, double salary){
        super( first, last, ssn, gros, comm );
        setBaseSalary( salary );
    }

    public void setBaseSalary(double salarrry){
    if(salarrry>=0.0){salary = salarrry;}
    else
        throw new IllegalArgumentException("Base salary must be >= 0.0");
    }
    
    public double getBaseSalary(){
    return salary;
    }
    @Override
    public double earnings(){
    
    return salary+super.earnings();
    }
    @Override
    public String toString(){
    
    return String.format("%s %s\n%s %.2f", "Base salaried employee:", super.toString(), "Base salary", getBaseSalary());
    }
            
}
