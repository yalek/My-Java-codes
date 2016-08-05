
package textfieldmetest;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class TextField extends JFrame {
    
    private JTextField textField1;
    
    public TextField(){
        super("Kevin Testing");
        setLayout(new FlowLayout());
        
        textField1 = new JTextField("Enter your text here");
        add(textField1);
        
        TextFieldHandler handler = new TextFieldHandler();
        textField1.addActionListener(handler);
    
    }
    
    private class TextFieldHandler implements ActionListener{
        
        public void actionPerformed(ActionEvent event){
                //JOptionPane.showMessageDialog(TextField.this,"You wrote: ",event.getActionCommand());
                
               String string =  "";
               string = String.format("You wrote: %s", event.getActionCommand());
               JOptionPane.showMessageDialog(null, string);
        }
    
    }
}
