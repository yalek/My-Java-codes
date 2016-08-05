/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paneldemo;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class PanelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PanelFrame frame = new PanelFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,200);
        frame.setVisible(true);
    }
    
}
