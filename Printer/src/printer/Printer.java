/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package printer;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Printer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Print p = new Print();
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setSize(500, 300);
        p.setVisible(true);
    }
    
}
