
package hypotenusecalc;

import java.util.Scanner;
public class HypotenuseCalc {
    public static double length;
    public static double width;
    public static double hyp;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your length: ");
        length = input.nextDouble();
        System.out.print("Enter your width: ");
        width = input.nextDouble();
      
        System.out.printf("The hypotenuse is: %.2f\n",hypotenuseM(length,width));
    }
    public static double hypotenuseM(double length, double width){
    
    hyp = Math.sqrt((length*length)+(width*width));
    return hyp;
    }
    
}
