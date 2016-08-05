/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gridlayoutframe;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class GridLayoutFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GridLayoutDemo grid = new GridLayoutDemo();
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid.setSize(300, 200);
        grid.setVisible(true);
    }
    
}
