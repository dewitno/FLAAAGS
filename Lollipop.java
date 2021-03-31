/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** 
 * class demonstration of creating a lollipop in my first GUI
 * 
 * @author dewitno
 * @version 1/04/2021 - APRIL FOOLS
 */
public class Lollipop{  
    
    /**
     * constructer for object of class Lollipop
     */
    public Lollipop(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); //comment out to checkstyle
    }
    
    /**
     * draw a lollipop and ask user for its size
     */
    public void doDrawLollipop() {
        double diam = UI.askDouble("Diameter: ");
        this.drawLollipop(300, 180, diam, 200);
        this.drawLollipop(50, 60, diam/2.0, 90);
        this.drawLollipop(400, 100, diam, 70);
    }
    
    /**
     * Draw a red lollipop on a stick
     */
    private void drawLollipop(double x, double y, double size, double stick) {
        double left = x-size/2.0;           // left of lollipop
        double top = y-size/2;              // top of lollipop
        double bottom = y+stick;            // bottom of stick
        
        /*drawing out stick*/
        UI.setLineWidth(size/8.0);          // set line width to 10
        UI.setColor(Color.black);
        UI.drawLine(x, y, x, bottom);       // draw line (300,200) to (300, 400)
        
        /*drawing our lolly */
        int rand  = (int)(Math.random()*2);
        if (rand == 0) {
            UI.setLineWidth(1);                 // set line width to 1
            UI.setColor(Color.red);             // set color to red
            UI.fillOval(left, top, size, size); // fill oval @ (260, 160), 80x80
        } else {
            UI.setLineWidth(1);                 // set line width to 1
            UI.setColor(Color.red);             // set color to red
            UI.fillRect(left, top, size, size); // fill oval @ (260, 160), 80x80
        }
        
    }

    /**
     * Main routine
     * 
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.doDrawLollipop();
    }

}
