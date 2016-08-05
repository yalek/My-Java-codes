
package textareademo;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TextAreaFrame extends JFrame {

    private JTextArea textarea1;
    private JTextArea textarea2;
    private JButton copyButton;
    
public TextAreaFrame(){
    super("TextArea Demos");
    Box box = Box.createHorizontalBox();
    String demo = "This is a demo string to\n"
            + "illustrate copying text\n"
            + "from one textarea to another textarea\n"
            + "using an external event";
    
    textarea1 = new JTextArea(demo, 10,15);
    box.add(new JScrollPane(textarea1));
    
    copyButton = new JButton("Copy>>>");
    box.add(copyButton);
    copyButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        textarea2.setText(textarea1.getSelectedText());
        }
    });
      
    textarea2 = new JTextArea(10,15);
    textarea2.setEditable(false);
    box.add(new JScrollPane(textarea2));
    
    add(box);
    }
}
