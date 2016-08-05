/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package textareademo;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class TextAreaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextAreaFrame test= new TextAreaFrame();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(450,200);
        test.setVisible(true);
    }
    
}
