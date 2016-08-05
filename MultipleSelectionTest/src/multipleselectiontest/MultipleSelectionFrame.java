
package multipleselectiontest;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame{

    private JList colorJlist;
    private JList copyJlist;
    private JButton copyButton;
    private static final String[] colorNames= {"Black", "Blue", "Cyan", "Dark Gray", 
    "Gray", "Green", "Light Gray", "Magenta","Orange", 
    "Pink", "Red", "White", "Yellow"};
    
    public MultipleSelectionFrame(){
        super("Multiple Selection Test");
        setLayout(new FlowLayout());
        
        colorJlist = new JList(colorNames);
        colorJlist.setVisibleRowCount(5);
        colorJlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJlist));
        
        copyButton = new JButton("Copy>>>");
        copyButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent event){
                copyJlist.setListData(colorJlist.getSelectedValues());
                }
            }
        );
        add(copyButton);
        
        copyJlist = new JList();
        copyJlist.setVisibleRowCount(5);
        copyJlist.setFixedCellWidth(100);
        copyJlist.setFixedCellHeight(20);
        copyJlist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        
        add(new JScrollPane(copyJlist));
        
    
    }
}
