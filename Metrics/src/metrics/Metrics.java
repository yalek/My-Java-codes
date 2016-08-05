/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metrics;
import javax.swing.JFrame;
/**
 *
 * @author USER
 */
public class Metrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame app = new JFrame("Demonstrating FontMetrics");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        MetricsPanel met = new MetricsPanel();
        app.add(met);
        
        app.setSize(500, 300);
        app.setVisible(true);
    }
    
}
