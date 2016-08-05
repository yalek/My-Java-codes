/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myshapetest;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
public class MyShapeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int times = 0;
        int number = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the number of time times to generate the shapes"));
        
        JFrame application = new JFrame();
        JPanel panel = new JPanel();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        Myline line = new Myline(0, 0, 300, 300);
        MyOval oval = new MyOval(200,0,400 , 300);
        MyRectangle rectangle = new MyRectangle(300,200 ,600, 400);
                
        MyShape[]shapes = new MyShape[3];
        
        shapes[0]=line;
        shapes[1]=oval;
        shapes[2]=rectangle;
        
       // application.add(oval);
        //application.add(rectangle);
        //application.add(line);
        
       while(times<=number){
        for(MyShape currentShape:shapes){
            
            application.add(currentShape);
            application.setSize(1000, 800);
            application.setVisible(true);
        }
        }
        
    }
    
}
