
package radiobuttontest;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class RadioButtonFrame extends JFrame {
    private JTextField textField;
    private Font plainFont;
    private Font boldFont;
    private Font italicFont;
    private Font italicBoldFont;
    private JRadioButton plainButton;
    private JRadioButton boldButton;
    private JRadioButton italicButton;
    private JRadioButton italicBoldButton;
    private ButtonGroup buttonGroup;
    
    public RadioButtonFrame(){
        super("Radio Buttons Testing");
        setLayout(new FlowLayout());
        
        textField = new JTextField("Watch font change in style", 25);
        add(textField);
        
        plainButton = new JRadioButton("Plain", true);
        boldButton = new JRadioButton("Bold", false);
        italicButton = new JRadioButton("Italic", false);
        italicBoldButton = new JRadioButton("Bold/Italic", false);
        add(plainButton);
        add(boldButton);
        add(italicButton);
        add(italicBoldButton);
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(plainButton);
        buttonGroup.add(boldButton);
        buttonGroup.add(italicButton);
        buttonGroup.add(italicBoldButton);
        
        plainFont = new Font("Serif", Font.PLAIN, 14);
        boldFont = new Font("Serif", Font.BOLD, 14);
        italicFont = new Font("Serif", Font.ITALIC, 14);
        italicBoldFont=new Font("Serif", Font.BOLD + Font.ITALIC, 14);
        
        textField.setFont(plainFont);
        
        //RadioButtonHandler handler = new RadioButtonHandler();
        plainButton.addItemListener(new RadioButtonHandler(plainFont));
        boldButton.addItemListener(new RadioButtonHandler(boldFont));
        italicButton.addItemListener(new RadioButtonHandler(italicFont));
        italicBoldButton.addItemListener(new RadioButtonHandler(italicBoldFont));
                
    }
    
    private class RadioButtonHandler implements ItemListener{
        private Font font;
        public RadioButtonHandler(Font f){
            font = f;
        }
        public void itemStateChanged(ItemEvent event){
            textField.setFont(font);
        }
    
    }
    
}
