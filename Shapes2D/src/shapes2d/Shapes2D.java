/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes2d;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Shapes2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ShapesPanel panel = new ShapesPanel();
        frame.add(panel);
        
        frame.setSize(450, 200);
        frame.setVisible(true);
    }
    
}
