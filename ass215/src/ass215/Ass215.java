

package ass215;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ass215 {

    
    public static void main(String[] args) {
      //Scanner input = new Scanner(System.in);
      int a,b,sum,product, diff, quo;
      /*System.out.print("Enter the first integer:");
      a=input.nextInt();
      System.out.print("Enter the second integer:");
      b=input.nextInt();*/
      
      a = Integer.parseInt(JOptionPane.showInputDialog("Enter the first integer"));
      b = Integer.parseInt(JOptionPane.showInputDialog("Enter your second integer"));
      
      if(a>b){
      System.out.println("a is larger");}
      if(a==b){
      System.out.println("They are equal");}
      if(a<b){
      System.out.println("b is larger while a is smaller");}
      
      sum= a+b;
      product = a*b;
      diff = a-b;
      quo = a/b;
      
      System.out.printf("The sum is %d, product is %d, difference is %d, and the quotient is %d", sum,product,diff,quo);
     
              
      
    }
    
}
