
package calcface;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calc extends JFrame {
private GridLayout layout = new GridLayout(4,4);
private JPanel panel;
private JTextField field;
private JButton button1 = new JButton("7");
private JButton button2 = new JButton("8");
private JButton button3 = new JButton("9");
private JButton button4 = new JButton("/");
private JButton button5 = new JButton("4");
private JButton button6 = new JButton("5");
private JButton button7 = new JButton("6");
private JButton button8 = new JButton("*");
private JButton button9 = new JButton("1");
private JButton button10 = new JButton("2");
private JButton button11 = new JButton("3");
private JButton button12 = new JButton("-");
private JButton button13 = new JButton("0");
private JButton button14 = new JButton(".");
private JButton button15 = new JButton("=");
private JButton button16 = new JButton("+");

public Calc(){
super("Calculator");
super.setLayout(new FlowLayout());
field = new JTextField(15);
add(field);

panel = new JPanel();
panel.setLayout(layout);
panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(button4);
panel.add(button5);
panel.add(button6);
panel.add(button7);
panel.add(button8);
panel.add(button9);
panel.add(button10);
panel.add(button11);
panel.add(button12);
panel.add(button13);
panel.add(button14);
panel.add(button15);
panel.add(button16);

add(panel);
}
}
