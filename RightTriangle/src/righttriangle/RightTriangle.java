

package righttriangle;

import java.util.Scanner;
public class RightTriangle {

    public static void main(String[] args) {
        int x,y,z;
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter the first side: ");
       x= input.nextInt();
         System.out.println("Enter the second side: ");
       y= input.nextInt();
         System.out.println("Enter the third side: ");
       z= input.nextInt();
       
       int s = (x*x)+(y*y);
       int t = z*z;
       
       if(t==s)
           System.out.println("This is a right angle triangle");
       else
           System.out.println("This is a normal triangle");
       
    }
    
}
