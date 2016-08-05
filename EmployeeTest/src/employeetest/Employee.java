

package employeetest;

public class Employee {
    private String first;
    private String last;
    private double salary;
    
    public Employee(String first,String last, double salary){
        this.first = first;
        this.last = last;
        this.salary= salary;
    }
    public void setFirst(String first){this.first = first;};
    public String getFirst(){return first;}
    
    public void setLast(String last){this.last = last;}
    public String getLast(){return last;}
    
    public void setSalary(double salary){this.salary = salary;}
    public double getSalary(){return salary;}
    
    public void displayEmployee(){
         if(salary<0)
                salary=0;
                System.out.println(first+"\t"+last+"\t"+salary);}
}
