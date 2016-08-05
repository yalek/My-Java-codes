
package myshapetest;
import java.awt.Color;
import java.awt.Graphics;
public class MyOval extends MyShape {

    public MyOval(int x3, int y3, int x4, int y4){
    super(x3,y3,x4,y4);
    }
    @Override
    public void paintComponent(Graphics g){
    g.setColor(Color.YELLOW);
    g.fillOval(getX1(),getY1(),getX2(),getY2());
    }
}
