
package drawpaneltest;
import javax.swing.JFrame;
public class DrawPanelTest {

    public static void main(String[] args) {
      
        JFrame application = new JFrame();
        
        DrawPanel panel = new DrawPanel();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel);
        application.setSize(200, 250);
        application.setVisible(true);
    }
    
}
