
package colorselect;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Color extends JFrame {
    private JCheckBox box1;
    private JCheckBox box2;
    private JButton btn1;
    private JButton btn2;
    private JComboBox combo;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private static final String [] names = {"RED","BLUE", "GREEN"};
    
    public Color(){
    super("ColorSelect");
    setLayout(new GridLayout(3,1));
    
    combo = new JComboBox(names);
    panel1 = new JPanel();
    panel1.add(combo);
    add(panel1);
    
    
    box1 = new JCheckBox("Background");
    box2 = new JCheckBox("Foreground");
    panel2 = new JPanel();
    panel2.add(box1);
    panel2.add(box2);
    add(panel2);
    add(panel2);
    
    btn1 = new JButton("Ok");
    btn2 = new JButton("Cancel");
    panel3 = new JPanel();
    panel3.add(btn1);
    panel3.add(btn2);
    add(panel3);
    add(panel3);
    }
}
