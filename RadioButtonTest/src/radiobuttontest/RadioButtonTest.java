/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package radiobuttontest;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class RadioButtonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        RadioButtonFrame radioButton = new RadioButtonFrame();
        radioButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        radioButton.setSize(300,100);
        radioButton.setVisible(true);
    }
    
}
