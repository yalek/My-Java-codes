/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buttontest;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class ButtonTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ButtonFrame buttonFrame = new ButtonFrame();
        
        buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFrame.setSize(275,110);
        buttonFrame.setVisible(true);
    }
    
}
