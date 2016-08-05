
package circles;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Circle extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        int c=100;
        int d=100;
        int x = 100;
        int y = 100;
        
        for(int count=0; count<=10; count++){
            g.drawArc(x, y, c, d, 0, 360);
             x-=10;y-=10;c+=20;d+=20;
        }
       // g.drawArc(90,90,120,120,0,360);
    
    }

}
