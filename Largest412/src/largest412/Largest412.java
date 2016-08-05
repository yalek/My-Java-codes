
package largest412;

import java.util.Scanner;
public class Largest412 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int counter = 10;
        int number=0;
        int max;
              
        while(counter<=10)
            {
        System.out.print("Enter your number: ");
        number = input.nextInt();
        counter++;
            }
       
        max = Math.max(number, number);
        System.out.println(max);
        
            /*for(int counter = 1; counter<=10; counter++)
            {
            System.out.println(counter);}
            }*/
    }
}

