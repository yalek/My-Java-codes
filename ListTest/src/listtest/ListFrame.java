
package listtest;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;

public class ListFrame extends JFrame{
private JList colorJlist;
private static final String [] colorNames={"Black", "Blue", "Cyan", "Dark Gray", 
    "Gray", "Green", "Light Gray", "Magenta","Orange", 
    "Pink", "Red", "White", "Yellow"};
private static final Color[]color = {Color.BLACK, Color.BLUE,Color.CYAN, 
                                    Color.DARK_GRAY, Color.GRAY, Color.GREEN,
                                    Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, 
                                    Color.PINK,Color.RED, Color.WHITE, Color.YELLOW};
public ListFrame(){
    super("List Testing");
    setLayout(new FlowLayout());
    
    colorJlist = new JList(colorNames);
    colorJlist.setVisibleRowCount(5);
    
    colorJlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    add(new JScrollPane(colorJlist));
    //getContentPane().setBackground(Color.red);
    
    colorJlist.addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent event){
                    getContentPane().setBackground(color[colorJlist.getSelectedIndex()]);
                }
        
    }
    );

}
}
