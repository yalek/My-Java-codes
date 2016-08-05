
package align;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class AlignDemo extends JFrame {
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JCheckBox check1;
    private JCheckBox check2;
    private JTextField field1;
    private JTextField field2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label1;
    private JLabel label2;
    
    private GridLayout layout;
 public AlignDemo(){
        super("Align");
        panel1 = new JPanel();
        layout = new GridLayout(1,3);
        panel1.setLayout(layout);
        
        panel4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        check1 = new JCheckBox("Snap to Grid");
        check2 = new JCheckBox("Show Grid");
        panel4.add(check1);
        panel4.add(check2);
        panel1.add(panel4);
        
        panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        label1 = new JLabel("X: ");
        field1 = new JTextField(12);
        label2 = new JLabel("Y: ");
        field2 = new JTextField(12);
        panel3.add(label1);
        panel3.add(field1);
        panel3.add(label2);
        panel3.add(field2);
        panel1.add(panel3);
        
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER));
        button1 = new JButton("Ok           ");
        button2 = new JButton("Cancel       ");
        button3 = new JButton("Help  ");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        panel1.add(panel2);
        
        add(panel1);
        super.validate();
    }

}
