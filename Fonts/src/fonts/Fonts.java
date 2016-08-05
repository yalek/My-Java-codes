/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fonts;

/**
 *
 * @author USER
 */
import javax.swing.JFrame;
public class Fonts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame app = new JFrame("Using Fonts");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fontPanel p = new fontPanel();
        app.add(p);
        app.setSize(420, 250);
        app.setVisible(true);
        
        
    }
    
}
