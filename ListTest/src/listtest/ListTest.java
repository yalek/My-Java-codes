/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listtest;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListFrame listFrame = new ListFrame();
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(500, 300);
        listFrame.setVisible(true);
    }
    
}
