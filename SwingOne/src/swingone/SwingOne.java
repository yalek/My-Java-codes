/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swingone;

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;
public class SwingOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstNumber = JOptionPane.showInputDialog("Enter first Integer");
        String secondNumber = JOptionPane.showInputDialog("Enter second Integer");
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sum = number1+ number2;
        
       // JOptionPane.showMessageDialog(null, sum);
        JOptionPane.showMessageDialog(null, "The sum is: "+sum, "Sum of two Integers", JOptionPane.QUESTION_MESSAGE);
    }
    
}
