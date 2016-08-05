

package accounttest;

public class Account {
    private double balance;
    
    public Account(double initialBalance){
        if(initialBalance>0.0) 
            balance=initialBalance;
        }
    public void credit(double amount){
        balance = balance + amount;
        }
    public void debit(double withdraw){
        if(withdraw>balance)
        {System.out.println("Debit amount exceeded account balance");
        balance = balance;}
        else
        balance = balance-withdraw;
            
        }
    public double getBalance(){
        return balance;
        }
}
