package roundingoff;
import java.util.Scanner;
public class RoundingOff {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your number: ");
        double number = input.nextDouble();
        
        int y = (int)(Math.floor(number+0.5));
        System.out.println("Original Number\tNew number");
                System.out.println(number +"\t\t"+ y);
        
    }
    
}
