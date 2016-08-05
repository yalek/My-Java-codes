
package exponentiation;

import java.util.Scanner;
public class Exponentiation {
    public static int base;
    public static int exp=1;
     public static int exponent=1;
    public static int result;
    
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your base: \n");
        base = input.nextInt();
        System.out.print("Enter your exponent: \n");
        exponent = input.nextInt();
        
        System.out.println(integerPower(base,exponent));
    }
    public static int integerPower(int base, int exponent){
        
            if(exponent==0)
                return base;
            if(exponent ==1)
                return 1;
           while(exponent>=exp)
                {
                    result*=base;
                    exponent++;
                       }
    return result;
    }
    
}
