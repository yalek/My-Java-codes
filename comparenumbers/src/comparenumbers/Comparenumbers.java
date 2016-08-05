
package comparenumbers;
import java.util.Scanner;
public class Comparenumbers {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num, number;
      
     System.out.println("Enter the first number");
     num = input.nextInt();
     System.out.println("Enter the second numer");
     number = input.nextInt();
     
     if(num==number){
         System.out.println("Equal");}
     if(num != number){
             System.out.println("Not equal");}
     if(num<=number){
         System.out.println("num is less than number");}
    }
    
}
