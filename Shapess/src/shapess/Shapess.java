/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapess;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class Shapess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame app = new JFrame("Drawing lines, rectangles and ovals");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Shapes sh = new Shapes();
        //sh.setBackground(Color.BLACK);
        app.add(sh);
        app.setSize(400,210);
        app.setVisible(true);
    }
    
}
