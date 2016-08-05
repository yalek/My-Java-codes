/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comboboxtest;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class ComboBoxTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComboBoxFrame comboBox = new ComboBoxFrame();
        comboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        comboBox.getContentPane().setBackground(Color.pink);
        comboBox.setSize(500, 300);
        comboBox.setVisible(true);
    }
    
}
