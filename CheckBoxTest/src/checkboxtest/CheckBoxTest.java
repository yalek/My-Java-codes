/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkboxtest;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class CheckBoxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CheckBoxFrame checkBox = new CheckBoxFrame();
        
        checkBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        checkBox.setSize(275,100);
        //checkBox.getContentPane().setBackground(Color.red);
        checkBox.setVisible(true);
    }
    
}
