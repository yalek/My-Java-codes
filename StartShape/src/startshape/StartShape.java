/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package startshape;

/**
 *
 * @author USER
 */
public class StartShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        for(int h=0; h<=10; h++){
            for(int l=0;l<=10;l++){
                if(l<=x)
                System.out.print(" ");
                else 
                 System.out.print("*");
            }
        System.out.println();
        x--;
        }
        
        System.out.println("For Geniuses!");
        
       int t=0;
        for(int h=0; h<=10; h++){
            for(int l=0;l<=10;l++){
                if(l<=t)
                System.out.print(" ");
                else 
                 System.out.print("*");
            }
        System.out.println();
        t++;
        }
    }
    
}
