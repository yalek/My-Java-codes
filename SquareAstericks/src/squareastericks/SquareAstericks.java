
package squareastericks;
import java.util.Scanner;
        
public class SquareAstericks {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the size of your desired square: ");
       int size = input.nextInt();
       int side;
       
            for(side=1; side<=size;side++){
      
            System.out.print("*");}
            
                if(side==size)
                    System.out.print("*\n");
                System.out.println("");
                   
                    for(side=0; side<=--size;side++){
      
                    System.out.print("*\n");}
                
                            for(side=1;side<=size;side++){
      
                                System.out.print("*");}
                                
            }
}
