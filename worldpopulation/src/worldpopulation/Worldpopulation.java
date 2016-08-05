

package worldpopulation;

import java.util.Scanner;
public class Worldpopulation {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       double cpop, rate, npop, years;
       
       System.out.println("What is the current population?");
       cpop = input.nextDouble();
       
       System.out.println("What is the growth rate?");
       rate=input.nextDouble();
       
       System.out.println("You want the population after how many years?");
       years = input.nextDouble();
       
       npop = cpop*rate*years;
       
       System.out.printf("The population after %f will be %f", years,npop);
    }
    
}
