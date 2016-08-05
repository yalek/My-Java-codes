/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package circles;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class Circles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Circle c = new Circle();
        frame.add(c);
        frame.setSize(800,500);
        frame.setVisible(true);
    }
    
}
