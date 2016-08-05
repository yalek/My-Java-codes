

package salescommissioncal;

import java.util.Scanner;
public class SalesCommissionCal {

    public static void main(String[] args) {
        
        double basic = 200;
        double tot=0;
        double item=0;
        double comm;
        double salary;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your total sales for the week. Enter -1 to Stop");
        item = input.nextDouble();
        
        while(item!=-1.0){
        item = input.nextDouble();
        tot+=item;
        }
        comm = 0.09*tot;
        salary = basic + comm;
        
        System.out.printf("Your commission is$ :%f\nYour salary is$ :%f", comm,salary);
        
        
    }
    
}
