
package myshapetest;
import java.awt.Graphics;
import javax.swing.JPanel;

public abstract class MyShape extends JPanel{

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    
    public MyShape(int x3, int y3, int x4,int y4){
    x1=x3;
    y2=y3;
    x2 = x4;
    y2 = y4;
    }
    
    public void setX1(int x3){x1=x3;}
    public int getX1(){return x1;}
    
    public void setY1(int y3){y1=y3;}
    public int getY1(){return y1;}
    
    public void setX2(int x4){x2=x4;}
    public int getX2(){return x2;}
    
    public void setY2(int y4){y2=y4;}
    public int getY2(){return y2;}
    
    public abstract void paintComponent(Graphics g);
}
