/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flowlayouttest;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class FlowLayoutTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FlowLayoutFrame flow = new FlowLayoutFrame();
        flow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flow.setSize(300,75);
        flow.setVisible(true);
    }
    
}
