

package roundingnumbers;
import java.util.Scanner;
public class RoundingNumbers {
    public static double y;
    public static double x;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number:");
        x = input.nextDouble();
        
        System.out.println("Original No\tNew Number");
               // roundToInteger(x);
                //roundToTenth(x);
                //roundToHundreths(x);
                //roundToThousandths(x);
                System.out.printf("As an integer: %f\n",roundToInteger(x) );
                System.out.printf("As an Tenths: %f\n",roundToHundreths(x) );
                System.out.printf("As an a hundreths: %f\n",roundToThousandths(x));
                System.out.printf("As a thousandths:%f\n",roundToThousandths(x));              
                

    }
    public static double roundToInteger(double x){
        y = Math.floor(x*10+0.5)/10;
    return y;
    }
     public static double roundToTenth(double x){
        y = Math.floor(x*100+0.5)/100;
    return y;
    }
      public static double roundToHundreths(double x){
        y = Math.floor(x*1000+0.5)/1000;
    return y;
    }
        public static double roundToThousandths(double x){
        y = Math.floor(x*10000+0.5)/10000;
    return y;
    }    
    

    
}
