
package employeepolymorphismabstract;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String first, String last, String ssn, double sales, double commission){
        super(first, last, ssn);
        setSales(sales);
        setCommission(commission);
    }
    
    public void setSales(double sales){
        if(sales>=0.0)
            grossSales=sales;
        else
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
    }
    public double getSales(){
    
    return grossSales;}
    
    public void setCommission(double commission){
        if(commission>0.0 & commission<1.0)
            commissionRate = commission;
        else
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
    }
    public double getCommission(){
    return commissionRate;}
    
    @Override
    public double earning(){
    return commissionRate*grossSales;
    }
    @Override
    public String toString(){
    return String.format("%s %s\n%s %.2f\n%s %.2f","CommissionEmployee: ", super.toString(),"Gross Sales: ",getSales(),"CommissionRate: ", getCommission());
    }
}
