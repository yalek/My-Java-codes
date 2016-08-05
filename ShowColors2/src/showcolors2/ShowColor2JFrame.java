
package showcolors2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JColorChooser;


public class ShowColor2JFrame extends JFrame{
    private JPanel colorPanel;
    private JButton colorButton;
    private Color color = Color.LIGHT_GRAY;
    
    public ShowColor2JFrame(){
    super("Using JColorChooser");
    
    colorPanel = new JPanel();
    colorPanel.setBackground(color);
    
    colorButton = new JButton("Change Color");
    colorButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                color = JColorChooser.showDialog(ShowColor2JFrame.this,"Choose a color", color);
                if(color==null)
                    color = Color.LIGHT_GRAY;
                colorPanel.setBackground(color);
            }
        });
    
    add(colorPanel, BorderLayout.CENTER);
    add(colorButton, BorderLayout.SOUTH);
    
    setSize(400,300);
    setVisible(true);
    
    }

}
