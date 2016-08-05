
package drawarcs;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ArcsPanel  extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.RED);
        g.drawRect(15, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(15, 35, 80, 80,0,360);
        
        g.setColor(Color.red);
        g.drawRect(100, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(100, 35, 80, 80, 0, 110);
        
        g.setColor(Color.red);
        g.drawRect(185, 35, 80, 80);
        g.setColor(Color.BLACK);
        g.drawArc(185, 35, 80, 80, 0, -270);
        
        g.fillArc(15, 35, 80, 80,0,360);
        
        g.fillArc(100, 35, 80, 80, 0, 110);
        
        g.fillArc(185, 35, 80, 80, 0, -270);
        
        
                
        
    
    }

}
