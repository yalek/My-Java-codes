/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mousetracker;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class MouseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MouseTrackerFrame mouseTracker = new MouseTrackerFrame();
        mouseTracker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTracker.setSize(300, 100);
        mouseTracker.setVisible(true);
    }
    
}
