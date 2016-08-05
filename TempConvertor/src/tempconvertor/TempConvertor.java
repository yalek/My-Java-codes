/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tempconvertor;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class TempConvertor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temp t = new Temp();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        t.setSize(500, 300);
        t.setVisible(true);
    }
    
}
