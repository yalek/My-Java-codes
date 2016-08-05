/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcface;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class CalcFace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calc calculator = new Calc();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator.setSize(300, 200);
        calculator.setVisible(true);
    }
    
}
