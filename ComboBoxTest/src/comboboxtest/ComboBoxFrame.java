
package comboboxtest;
import java.awt.FlowLayout;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Icon;
import javax.swing.ImageIcon;

        
public class ComboBoxFrame extends JFrame {
    private JComboBox imagesComboBox;
    private JLabel label;
    private JLabel me;
    private static final String[]names={"a.jpg","b.jpg","c.jpg","d.jpg"};
    private Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))
        };
    public ComboBoxFrame(){
        super("Combo with anonymous class");
        setLayout(new FlowLayout());
        
        imagesComboBox = new JComboBox(names);
        imagesComboBox.setMaximumRowCount(3);
        
        imagesComboBox.addItemListener( new ItemListener(){
                
                public void itemStateChanged(ItemEvent event){
                
                    if(event.getStateChange()==ItemEvent.SELECTED)
                        label.setIcon(icons[imagesComboBox.getSelectedIndex()]);
                }
            }
        );
        
        add(imagesComboBox);
        
        label = new JLabel(icons[0]);
        add(label);
        me = new JLabel("My Wonderful Work");
        add(me);
    }
    
}
