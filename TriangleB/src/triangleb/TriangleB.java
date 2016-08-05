/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triangleb;

/**
 *
 * @author USER
 */
public class TriangleB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int u = 10;
        
        for(int h=0;h<=u;h++){
            for(int l=1;l<=10-h;l++){
            System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
