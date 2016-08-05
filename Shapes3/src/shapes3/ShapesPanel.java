
package shapes3;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import java.awt.Color;
import javax.swing.JPanel;

public class ShapesPanel extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Random random = new Random();
        
        int [] xValues = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int [] yValues = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        
        Graphics2D g2d = (Graphics2D)g;
        GeneralPath star = new GeneralPath();
        
        star.moveTo(xValues[0],yValues[0]);
        
        for(int count=1; count<xValues.length; count++){
            star.lineTo(xValues[count],yValues[count]);
        }
        
        star.closePath();
        
        g2d.translate(150, 150);
        
        for(int count=1; count<=20; count++){
            g2d.rotate(Math.PI/10.0);
            g2d.setColor(new Color(random.nextInt(256), random.nextInt(256),random.nextInt(256)));
            g2d.fill(star);
        }
    }
}
