
package samatula;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class SamAtula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Where do you live?: ");
        String place = input.next();
        System.out.print("How much is your rent?: ");
        int rent = input.nextInt();
        
        System.out.printf("My name is %s, %d years old, lives in %s and I pay ksh %d as rent to Nyawira, the landlord\n", name, age, place, rent);*/
        
       //System.out.print("Enter your name: ");
        
       String name = JOptionPane.showInputDialog("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        String place = JOptionPane.showInputDialog("Where do you live?: ");
        int rent = Integer.parseInt(JOptionPane.showInputDialog("How much is your rent?: "));
        System.out.printf("My name is %s, %d years old, lives in %s and I pay ksh %d as rent to Nyawira, the landlord\n", name, age, place, rent);
//JOptionPane.showMessageDialog(null,"My name is" %s, %d years old, lives in %s and I pay ksh %d as rent to Nyawira, the landlord\n", name, age, place, rent );
        JOptionPane.showMessageDialog(null,"My name is: "+ name+"\n"+ age+"years old\nlives in: "+place+"\nI pay ksh: "+rent+" as rent to Nyawira, the landlord");
    }
    
}
