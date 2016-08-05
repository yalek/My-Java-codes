
package graphics41;

import javax.swing.JFrame;

public class Graphics41 {

   
    public static void main(String[] args) {
        
        JFrame app = new JFrame();
        
        Graphic panel = new Graphic();
        
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(panel);
        app.setSize(700, 700);
        app.setVisible(true);
    }
    
}
