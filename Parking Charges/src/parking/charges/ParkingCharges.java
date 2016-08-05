
package parking.charges;

import java.util.Scanner;
public class ParkingCharges {
    public static int hours;
    public static double charge;
    public static double totalCharge;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the hours for a customer");
        hours = input.nextInt();
        calculateCharges(hours);
        System.out.printf("The charge for %d hours is $%f\n", hours,charge);
        totalCharge = charge+ charge;
        System.out.printf("The total is: %.2f\n", totalCharge);
    }
    public static double calculateCharges(int hours){
        if(hours<=3.0)
            charge = 2.00;
        if(hours>3.0 && hours<=24)
            charge = (hours - 3.0)*0.50;
        else
            if(hours>24){
            charge = 10.0;
            }
        
        return charge;
    }
    
}
