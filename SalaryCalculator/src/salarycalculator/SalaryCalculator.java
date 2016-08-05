
package salarycalculator;
import java.util.Scanner;
public class SalaryCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        String emp1, emp2,emp3;
        int hours1, hours2, hours3;
        int xhours1, xhours2, xhours3;
        double rate1, rate2, rate3;
        double gross1, gross2, gross3;
        
        System.out.print("Enter first employee: ");
        emp1 = input.next();
         System.out.print("Enter second employee: ");
        emp2 = input.next();
         System.out.print("Enter third employee: ");
        emp3 = input.next();
        
        System.out.print("Enter the normal hours worked by " + emp1+" is: ");
        hours1 = input.nextInt();
        System.out.print("Enter the extra hours worked by "+ emp1+" is: ");
        xhours1 = input.nextInt();
        System.out.print("Enter the rate for " + emp1 + " is: ");
        rate1 = input.nextDouble();
        gross1 = ((hours1*rate1) + (xhours1*(rate1/2)));
        System.out.printf("The gross pay for %s is %.2f\n",emp1,gross1);
        
        
        System.out.print("Enter the normal hours worked by: " + emp2);
        hours2 = input.nextInt();
        System.out.print("Enter the extra hours worked by: "+ emp2);
        xhours2 = input.nextInt();
        System.out.print("Enter the rate for : "+ emp2);
        rate2 = input.nextDouble();
        gross2 = ((hours2*rate2) + (xhours2*(rate2/2)));
        System.out.printf("The gross pay for %s is: %2\n",emp2, gross2);
        
       
        System.out.print("Enter the normal hours worked by: " + emp3);
        hours3 = input.nextInt();
        System.out.print("Enter the extra hours worked by: " + emp3);
        xhours3 = input.nextInt();
        System.out.print("Enter the rate for: " + emp3);
        rate3 = input.nextDouble();
        gross3 = ((hours3*rate3) + (xhours3*(rate3/2)));
        System.out.printf("The gross pay for %s is %.2f\n: ",emp3, gross3);
    }
    
}
