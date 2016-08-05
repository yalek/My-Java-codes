
package atmcasestudy;

public class ATM {
    private boolean userAunthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;
    private BankDatabase bankDatabase;
    
    private static final int BALANCE_INQUIRY =1;
    private static final int WITHDRAWAL =2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
    
    public ATM(){
        userAunthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        depositSlot = new DepositSlot();
        bankDatabase = new BankDatabase();
        
    }
    public void run(){
        while(true){
                while(!userAunthenticated){
                    screen.displayMessageLine("\nWelcome!");
                    aunthenticateUser();
                }
                performTransactions();
                userAunthenticated = false;
                currentAccountNumber = 0;
                screen.displayMessageLine("\nThank you! Goodbye!");
        }
    }
    public void aunthenticateUser(){
        screen.displayMessage("\nPlease enter your account number: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nEnter your PIN: ");
        int pin = keypad.getInput();
        
        userAunthenticated = bankDatabase.authenticateUser(accountNumber, pin);
        
        if(userAunthenticated){
            currentAccountNumber = accountNumber;
        }
        else
            screen.displayMessageLine("Invalid account number or PIN. Please try again.");
    }
    public void performTransactions(){
        Transaction currentTransaction = null;
        boolean userExited = false;
        
        while(!userExited){
            int mainMenuSelection = displayMainMenu();
            
                switch(mainMenuSelection){
                    case BALANCE_INQUIRY:
                    case WITHDRAWAL:
                    case DEPOSIT:
                        currentTransaction = createTransaction(mainMenuSelection);
                        currentTransaction.execute();
                        break;
                    case EXIT:
                        screen.displayMessage("\nExiting the system...");
                        userExited= true;
                        break;
                    default:
                        screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
                        break;
                }
            }
    }
    
    private int displayMainMenu(){
    
        screen.displayMessage("\nMain menu:");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash");
        screen.displayMessageLine("3 - Deposit funds");
        screen.displayMessageLine("4 - Exit\n");
        screen.displayMessageLine("Enter a choice: ");
        return keypad.getInput();
    }
    
    private Transaction createTransaction(int type){
        Transaction temp = null;
        
        switch(type){
            case BALANCE_INQUIRY:
                temp = new BalanceInquiry(currentAccountNumber, screen, bankDatabase);
                break;
            case WITHDRAWAL:
                temp = new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
                break;
            case DEPOSIT:
                temp = new Deposit(currentAccountNumber, screen, bankDatabase, keypad, depositSlot);
                break;
        }
        return temp;
    
    }
    

}
