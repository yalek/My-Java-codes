

package graphics41;

import java.awt.Graphics;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Graphic extends JPanel {
        
    public void paintComponent(Graphics g){
            super.paintComponent(g);
    int width = getWidth();
    int height= getHeight();
    int wplus = (getWidth()/2)/15;
    int hminus = (getHeight()/2)/15;
        /*
        do{
        g.drawLine(0,0,width,height);
        width = width+wplus;
        height = height-hminus;
        }
    while(height>=0);*/
       
      /*  while(height>=0){
        g.drawLine(0,0,width,height);
        width = width+wplus;
        height = height-hminus;
        }*/
  for(width=getWidth(); width>=0;width = width-wplus )
        {
        g.drawLine(getWidth(),0,width,height);
        height=height-hminus;
        }
   for(height=getHeight(); height>=0; height=height-hminus)
        {
        g.drawLine(getWidth(),getHeight(),width,height);
        width = width+ wplus;
        } 
   /* for(height=getHeight(); height>=0; height=height-hminus)
        {
        g.drawLine(0,0,getWidth(),0);
        width = width-wplus;
       //height = height-hminus;
        }
    for(width=getWidth();width<=getWidth(); width = width-wplus )
       {
        g.drawLine(0,getHeight(),width,height);
        height=height-hminus;*/
        //}
    }
    
}    

