
package flowlayouttest;
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

public class FlowLayoutFrame extends JFrame{
    private JButton leftButton;
    private JButton centerButton;
    private JButton rightButton;
    private FlowLayout layout;
    private Container container;
    
    public FlowLayoutFrame(){
    super("FlowLayout Testing");
    
    layout = new FlowLayout();
    container = getContentPane();
    setLayout(layout);
    
    leftButton = new JButton("Left");
    add(leftButton);
    leftButton.addActionListener( new ActionListener(){
        public void actionPerformed(ActionEvent event){
            layout.setAlignment(FlowLayout.LEFT);
            layout.layoutContainer(container);
            container.setBackground(Color.red);
        }
     }
    );
    
    centerButton = new JButton("Center");
    add(centerButton);
    centerButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
            layout.setAlignment(FlowLayout.CENTER);
            layout.layoutContainer(container);
            container.setBackground(Color.GREEN);
        }
    }
    );
    
    rightButton = new JButton("Right");
    add(rightButton);
    rightButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
        layout.setAlignment(FlowLayout.RIGHT);
        layout.layoutContainer(container);
        container.setBackground(Color.YELLOW);
        }
    }
    );
    }
}
