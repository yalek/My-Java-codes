

package accounttest;

import java.util.Scanner;
public class AccountTest {

    public static void main(String[] args) {
        
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        
        System.out.printf("Account1 balance:%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance:%.2f\n\n",account2.getBalance());
        
        Scanner input = new Scanner(System.in);
        
        double depositAmount;
        double withdraw;
        System.out.println("Enter deposit amount for account1");
        depositAmount = input.nextDouble();
        System.out.printf("\n adding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);
        
        System.out.printf("Account1 balance: %.2f\n",account1.getBalance());
        System.out.printf("Account2 balance: %.2f\n\n", account2.getBalance());
        
        System.out.println("Enter deposit amount for account2");
        depositAmount = input.nextDouble();
        System.out.printf("\n adding %.2f to account1 balance\n\n", depositAmount);
        account2.credit(depositAmount);
        
        System.out.printf("Account1 balance: %.2f\n",account1.getBalance());
        System.out.printf("Account2 balance: %.2f\n\n", account2.getBalance());
        
        System.out.println("Enter amount to withdraw");
        withdraw = input.nextDouble();
        System.out.printf("\n substracting %.2f from account1\n", withdraw);
        account1.debit(withdraw);
        
        System.out.printf("Account1 balance: %.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: %.2f\n", account2.getBalance());
    }
    
}
