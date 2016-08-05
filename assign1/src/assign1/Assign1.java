
package assign1;
import java.util.Scanner;
public class Assign1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y,z,result;
        System.out.println("Enter the first integer?");
        x = input.nextInt();
        System.out.println("Enter the second integer?");
        y=input.nextInt();
        System.out.println("Enter the third integer?");
        z=input.nextInt();
        
        result = x*y*z;
        System.out.printf("Product is %d", result);
        
    }
    
}
