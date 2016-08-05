
package tempconvertor;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Temp extends JFrame {
private JPanel panel;
private JLabel tempF;
private JLabel tempC;
private JLabel tempCD;
private JTextField tempFD;
private JTextField tempD;
private double f;
//private double celsius;
private String c;


public Temp(){
    super("Temperature Conversion");
    panel= new JPanel(new FlowLayout());
    tempF = new JLabel("Enter your Temperature here in Fahrenheit: ");
    tempFD = new JTextField(10);
    tempC = new JLabel("Temp converted to Celcius");
    tempCD = new JLabel();
    tempCD.setVisible(true);
    
   
    panel.add(tempF);
    panel.add(tempFD);
    panel.add(tempC);
    panel.add(tempCD);
      
    add(panel);
        TextField handler = new TextField();
        tempFD.addActionListener(handler);
   
    }

    private class TextField implements ActionListener{
            public void actionPerformed(ActionEvent event){
                try {
                        f = Double.parseDouble(tempFD.getText());
                        double celsius = ((Double.parseDouble(tempFD.getText())-32));
                        c = Double.toString(celsius * 5/8);
                        tempCD.setText(c);
                }catch(NumberFormatException e){
                        System.out.println("NumberFormatException: "+ e);
                }
            }
        }
}
