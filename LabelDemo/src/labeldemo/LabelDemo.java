/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package labeldemo;

/**
 *
 * @author USER
 */
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;
public class LabelDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JLabel northLabel = new JLabel("North");
        
        ImageIcon labelIcon = new ImageIcon("C:\\Users\\USER\\Desktop\\JavaDeite\\LabelDemo\\build\\classes\\labeldemo\\logo.gif");
        
        JLabel southLabel = new JLabel(labelIcon);
       
        JLabel centerLabel = new JLabel(labelIcon);
        
        southLabel.setText("South");
        
        JFrame application = new JFrame();
        
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(northLabel, BorderLayout.NORTH);
        application.add(southLabel, BorderLayout.SOUTH);
        application.add(centerLabel, BorderLayout.CENTER);
        
        application.setSize(300,300);
        application.setVisible(true);
    }
    
}
