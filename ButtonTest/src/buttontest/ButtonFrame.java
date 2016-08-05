
package buttontest;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
    private JButton plainButton;
    private JButton fancyButton;
    
    public ButtonFrame(){
        super("Testing Buttons");
        setLayout(new FlowLayout());
        
        plainButton = new JButton("Plain Button");
        add(plainButton);
        
        Icon bug1 = new ImageIcon(getClass().getResource("bug1.jpg"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.jpg"));
        fancyButton = new JButton("Fancy Button",bug1);
       // fancyButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        fancyButton.setRolloverIcon(bug2);
        add(fancyButton);
        
        ButtonHandler handler = new ButtonHandler();
        plainButton.addActionListener(handler);
        fancyButton.addActionListener(handler);
    }
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s",event.getActionCommand()));
        }
    }
}
