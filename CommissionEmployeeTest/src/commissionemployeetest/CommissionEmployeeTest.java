/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package commissionemployeetest;

/**
 *
 * @author USER
 */
public class CommissionEmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*BaseCommissionEmployee employee = new BaseCommissionEmployee(
                "Sue", "Jones", "222-22-2222", 10000, .06,1000);
        System.out.println("Employee information obtained by get methods: \n");
        System.out.printf( "%s %s\n", "First name is",employee.getFirstName());
        System.out.printf("%s %s\n","Last name is", employee.getlastName() );
        System.out.printf("%s %s\n", "Social security number", employee.getSocialSecurity());
        System.out.printf("%s %.2f\n", "Gross sales is", employee.getGross());
        System.out.printf("%s %.2f\n","Commission is", employee.getCommission() );
        
        System.out.printf("%s %.2f\n", "Your earnings are: ", employee.earnings());
     
        
        employee.setGross(500);
        employee.setCommission(0.1);
        System.out.printf("\n%s \n\n%s \n","Updated employee information is: ", employee);*/
        CommissionEmployee commissionEmployee =  new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        BaseCommissionEmployee baseComm = new BaseCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        System.out.printf("%s %s\n\n%s\n\n","Call CommissionEmployee's toString with superclass reference ",
                "to superclass object",commissionEmployee.toString());
        System.out.printf("%s %s\n\n%s\n\n","Call BasePlusCommissionEmployee's toString with subclass",
                "reference to subclass object",baseComm.toString());
        
        CommissionEmployee commissionEmployee2 = baseComm;
        System.out.printf("%s %s\n\n%s\n\n","Call BasePlusCommissionEmployee's toString with superclass",
                "reference to subclass object", commissionEmployee2.toString());
        
    }
    
}
