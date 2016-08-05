
package shapetest;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapeTest {
    public static void main(String[] args) {
       String number = JOptionPane.showInputDialog("Enter 1 for Rectangle\n" +"Enter 2 for oval");
        
       int choice = Integer.parseInt(number);
        
       Shape p = new Shape(choice); 
       JFrame frame = new JFrame();
                     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(p);
        frame.setSize(300,300);
        frame.setVisible(true);
       }
}