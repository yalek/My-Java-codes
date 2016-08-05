
package mousedetails;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import  javax.swing.JPanel;
public class MouseDetailsFrame extends JFrame{

    private String details;
    private JLabel statusBar;
    
    
    public MouseDetailsFrame(){
        super("Mouse events using Mouse Adapter");
        
        statusBar = new JLabel("");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
        //MouseClickHandler handler = new MouseClickHandler();
        //super.addMouseListener(handler);
        
    }
    
    private class MouseClickHandler extends MouseAdapter{
        
        public void mouseClicked(MouseEvent event){
            
        int xPos= event.getX();
        int yPos = event.getY();
        
        details = String.format("Clicked %d time(s)", event.getClickCount());
        
        if(event.isMetaDown())
            details+="With right Mouse Button";
        else if(event.isAltDown())
            details +="With centre Mouse Button";
        else
            details +="With left Mouse Button";
        
        if(event.getClickCount()==5)
            getContentPane().setBackground(Color.red);
        else
            getContentPane().setBackground(Color.magenta);
        statusBar.setText(details);
              
        }
    
    }
}
