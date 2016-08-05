/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mousedetails;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class MouseDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MouseDetailsFrame details = new MouseDetailsFrame();
        details.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        details.setSize(500, 300);
        details.setVisible(true);
    }
    
}
