/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package diamond;

/**
 *
 * @author USER
 */
public class Diamond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int x=5;
         int y=6;
        
        for(int h=1; h<=5; h++){
         
            for(int l=0;l<=10;l++){
                 if(l==x || l==y)
                    System.out.print("*");
                 else 
                     if(l>x && l<y)
                         System.out.print("*");
                 else
                     System.out.print(" ");
                }
            System.out.println();
             x--;
             y++;
        }
        for(int h=1; h<=5; h++){
            for(int l=0; l<=10; l++){
                if(l==x || l==y)
                    System.out.print("*");
                else if(l>x && l<y)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
            x++;
            y--;
        
        }
      
    }
    
}
