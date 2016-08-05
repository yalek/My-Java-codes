/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package drawarcs;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class DrawArcs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame arc= new JFrame("Drawing arcs");
        arc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArcsPanel panel = new ArcsPanel();
        arc.add(panel);
        arc.setSize(400,210);
        arc.setVisible(true);
    }
    
}
