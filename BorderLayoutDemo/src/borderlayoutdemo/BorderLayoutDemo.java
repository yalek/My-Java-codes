/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package borderlayoutdemo;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class BorderLayoutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BorderLayoutFrame border = new BorderLayoutFrame();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setSize(300, 200);
        border.setVisible(true);
    }
    
}
