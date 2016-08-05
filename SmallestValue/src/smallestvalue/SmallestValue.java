/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smallestvalue;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class SmallestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest;
        int b=0;
        System.out.println("How many no do you want to input");
        int a = input.nextInt();
        
        for(int s = 1; s<=a;s++){
                System.out.println("Enter value: ");
                 b = input.nextInt();
                }
        //smallest =
             System.out.println("The smallest is: "+ b);
       /* 
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        
        smallest = a;
        
            if(b<smallest){
                smallest = b;
                    if(c<smallest)
                        smallest=c;
                        if(d<smallest)
                            smallest=d;
            }
        
        System.out.println("The smallest is: "+smallest);*/
        
    }
    
}
