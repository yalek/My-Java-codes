
package printer;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
public class Print extends JFrame {
    
    private JLabel label1;
     private JLabel label2;
     private JLabel label3;
    private JTextArea area1;
    private JTextArea area2;
    private JTextArea area3;
    private JCheckBox box1;
    private JCheckBox box2;
    private JCheckBox box3;
    private JCheckBox boxP;
    private JRadioButton radio1;
    private JRadioButton radio2;
    private JRadioButton radio3;
    private ButtonGroup buttongroup;
    private JComboBox combo;
    private static final String [] names = {"High", "Moderate", "Poor"};
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JPanel panel6;
    private JPanel panel7;
    private JPanel panel8;
    private JPanel panel9;
    private JPanel motherPanel;
    private JPanel panel11;
    private JPanel panel12;
    private JPanel panel13;
    
    
    public Print(){
    super("Printer");
    motherPanel = new JPanel(new GridLayout(3,1));
        
    panel1 = new JPanel();
    panel1.setLayout(new GridLayout(1,3));
    label1 = new JLabel("Printer: My Printer");
    label3 = new JLabel("");
    JLabel label4 = new JLabel("");
    JLabel label5 = new JLabel("");
    JLabel label6 = new JLabel("");
    btn1 = new JButton("OK");
    panel1.add(label1);
    panel1.add(label3);
    panel1.add(label4);
    panel1.add(label5);
    panel1.add(label6);
    panel1.add(btn1);
    motherPanel.add(panel1);
    
    panel2 = new JPanel();
    panel2.setLayout(new GridLayout(1,6));
    
    panel3 = new JPanel(new BorderLayout());
    area1 = new JTextArea(3,3);
    panel3.add(area1, BorderLayout.CENTER);
    panel2.add(panel3);
    
        panel4 = new JPanel(new GridLayout(3,1));
        box1 = new JCheckBox("Image");
        box2 = new JCheckBox("Text");
        box3 = new JCheckBox("Code");
        panel4.add(box1);
        panel4.add(box2);
        panel4.add(box3);
    panel2.add(panel4);
    
        panel5 = new JPanel(new BorderLayout());
        area2 = new JTextArea(3,2);
        panel5.add(area2, BorderLayout.CENTER);
        panel2.add(panel5);
        
        panel6 = new JPanel(new GridLayout(3,1));
        radio1 = new JRadioButton("Selection");
        radio2 = new JRadioButton("All");
        radio3 = new JRadioButton("Applet");
        buttongroup = new ButtonGroup();
        buttongroup.add(radio1);
        buttongroup.add(radio2);
        buttongroup.add(radio3);
        panel6.add(radio1);
        panel6.add(radio2);
        panel6.add(radio3);
        panel2.add(panel6);
        
        panel7 = new JPanel(new BorderLayout());
        area3 = new JTextArea(3,3);
        panel7.add(area3, BorderLayout.CENTER);
        panel2.add(panel7);
        
        panel8 = new JPanel(new GridLayout(2,1));
        btn2 = new JButton("Cancel");
        btn3 = new JButton("Setup");
        panel8.add(btn2);
        panel8.add(btn3);
        panel2.add(panel8);
        
   motherPanel.add(panel2);
    
        panel9 = new JPanel(new FlowLayout());
        label2 = new JLabel("Print Quality: ");
        combo = new JComboBox(names);
        boxP= new JCheckBox("Print to File");
        btn4 = new JButton("Help");
        panel9.add(label2);
        panel9.add(combo);
        panel9.add(boxP);
        panel9.add(btn4);
  motherPanel.add(panel9);
  
    add(motherPanel);
    
    }
}
