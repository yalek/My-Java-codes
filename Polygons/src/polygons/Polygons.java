/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polygons;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class Polygons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PolygonPanel pan = new PolygonPanel();
        frame.add(pan);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
    
}
