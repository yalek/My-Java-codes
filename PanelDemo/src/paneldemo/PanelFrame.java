
package paneldemo;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class PanelFrame extends JFrame {
    private JPanel buttonPanel;
    private JButton [] buttons;
    
public PanelFrame(){
    super ("Multiple layouts demo");
    super.getContentPane().setBackground(Color.BLUE);
    buttons = new JButton[5];
    
    buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(1,buttons.length));
    
    for(int count = 0; count<buttons.length;count++){
        buttons[count] = new JButton("button" +(count+1));
        buttons[count].setBackground(Color.red);
        
        buttonPanel.add(buttons[count]);
    }
    add(buttonPanel, BorderLayout.SOUTH);
}
}
