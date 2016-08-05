/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textfieldmetest;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class TextFieldMeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextField textField = new TextField();
        textField.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textField.setSize(300, 100);
        textField.setVisible(true);
    }
    
}
