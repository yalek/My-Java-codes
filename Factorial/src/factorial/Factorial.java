
package factorial;

import java.util.Scanner;
public class Factorial {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int n;
         int fac;
         System.out.println("Enter your number: ");
        n= input.nextInt();
        
        if(n>=0){
        fac = (n*(n-1)*(n-2)*(n-3)*(n-4));
            System.out.println(fac);
        
        }
        
    }
    
}
