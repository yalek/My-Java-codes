/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zeroexceptions;

/**
 *
 * @author USER
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ZeroExceptions {

    /**
     * @param args the command line arguments
     */
    public static int quotient(int numerator, int denominator)
    
             throws ArithmeticException
        {
            return numerator/denominator;
        }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean continueLoop = true;
        
        do{
        
            try{
                System.out.println("Enter your numerator");
                int numerator = input.nextInt();
                System.out.println("Enter your denominator");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);

                System.out.println("The result is: "+ result);
                continueLoop = false;
            }
            catch(InputMismatchException inputMismatchException)
            {
                System.err.printf( "\nException: %s\n",inputMismatchException );
                input.nextLine();
                System.out.println("You must enter integers. Please try again.\n" );
            }
            catch(ArithmeticException arithmeticException)
            {
            System.err.printf( "\nException: %s\n", arithmeticException );
            System.out.println("Zero is an invalid denominator. Please try again.\n" );
            }
        
        }
while(continueLoop);
}
    
}
