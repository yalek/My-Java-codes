/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hollowsquare;

/**
 *
 * @author USER
 */
public class HollowSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int u =10;
        
        for(int h=1; h<=u;h++){
            for(int l=1;l<=u;l++){
                 
                if(h==1||h==10){
                    System.out.print("*");
                }
                else if(l==1||l==10)
                {
                System.out.print("*");
                }
                else
                    System.out.print(" ");
           // System.out.print("*");
            }
        System.out.print("\n");
        }
    }
    
}
