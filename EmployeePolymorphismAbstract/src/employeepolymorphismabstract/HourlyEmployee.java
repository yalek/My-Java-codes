
package employeepolymorphismabstract;

public class HourlyEmployee extends Employee {
private double hours;
private double wages;

    public HourlyEmployee(String first, String last, String ssn, double hourlyWage, double hoursWorked){
        super(first, last, ssn);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }
    
    public void setWage(double hourlyWage){
    if(hourlyWage>=0.0)
        wages = hourlyWage;
    else
        throw new IllegalArgumentException("Hourly wage must be >= 0.0");
    }
   public double getWages(){ return wages;}
   
   public void setHours(double hoursWorked){
       if(hoursWorked>0.0 && hoursWorked<=168)
           hours = hoursWorked;
       else
           throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
   
   }
   public double getHours(){return hours;}
   
   @Override
   public double earning(){
       if(getHours()<=40)
           return getHours()*getWages();
       else
           return getHours()*getWages() + ((getHours()-40)*getWages()*1.5);
   }
   public String toString(){
   
   return String.format("Hourly Employee: %s\n%s %.2f,%s %.2f",super.toString(),"Hourly Wage: ", getWages(),"Hours Worked: ", getHours() );
   }
    
}
