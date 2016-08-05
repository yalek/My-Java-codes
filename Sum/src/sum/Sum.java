package sum;

import java.util.Scanner;
public class Sum {

     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num, num1, sum;
       System.out.println("Enter the first number");
       num = input.nextInt();
       System.out.println("Enter the second number");
       num1 = input.nextInt();
       
       sum = num + num1;
       System.out.println(sum);
    }
    
}
