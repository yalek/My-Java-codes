/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package showcolors;

/**
 *
 * @author USER
 */
import javax.swing.JFrame;
public class ShowColors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Using Colors");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorJPanel panel = new ColorJPanel();
        frame.add(panel);
        frame.setSize(400, 180);
        frame.setVisible(true);
    }
    
}
