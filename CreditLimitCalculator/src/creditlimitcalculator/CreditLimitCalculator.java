
package creditlimitcalculator;
import java.util.Scanner;
public class CreditLimitCalculator {

    public static void main(String[] args) {
       
        int accountNo;
        int begBalance;
        int charges;
        int credit;
        int creditLimit=100;
        int newBal;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your accountNO: ");
        accountNo = input.nextInt();
        System.out.print("Enter your balance last month: ");
        begBalance = input.nextInt();
        System.out.print("Enter your charges: ");
        charges = input.nextInt();
        System.out.print("Enter your credit: ");
        credit = input.nextInt();
        
        newBal = ((begBalance + charges)-credit);
        
        System.out.println("New balance is: "+ newBal);
        
        if(newBal>creditLimit )
            System.out.println("Credit Limit Exceeded! Sorry");
    }
    
}
