
package maximumfinder;
import java.util.Scanner;
public class MaximumFinder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three floating numbers separated by a space");
        double number1= input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();
        
        double result = maximum(number1,number2,number3);
        
        System.out.println("Maximum value is: "+ result);
        
       
    }
    
    public static double maximum( double x, double y, double z){
    
        double maximumvalue = x;
        
        if(y>maximumvalue)
            maximumvalue = y;
        if(z>maximumvalue)
            maximumvalue = z;
        
        return maximumvalue;
    
    }
    
}
