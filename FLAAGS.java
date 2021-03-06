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
 * draws flags from different countries
 * 
 * @author dewitno
 * @version v1.5/4/2021
 */
public class FLAAGS{

    /**
     * Constructer for FLAAGS!
     */
    public FLAAGS(){
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    /**
     * draw flag (left, top, height, width, isHorizontal, red1, green1, blue1, red2, green2, blue2, red3, green3, blue3)
     * red#, green#, and blue# are the rgb values for each colour of flag section
     */
    private void drawFlag(double left, double top, double height, double width, boolean isHorizontal, int red1, int green1, int blue1, int red2, int green2, int blue2, int red3, int green3, int blue3) {
        // sets color according to red, green and blue value
        Color col1 = new Color(red1, green1, blue1);
        Color col2 = new Color(red2, green2, blue2);
        Color col3 = new Color(red3, green3, blue3);
        // checks to see if flag sections are vertical or horizontal
        if (isHorizontal) { 
            UI.setLineWidth(1);
            UI.setColor(col1);  // sets colour of first section to col1 value
            UI.fillRect(left, top, width, height/3);    // makes the first section at accordance to parameters
            UI.setColor(col2);  // sets colour of 2nd section to col2 value
            UI.fillRect(left, top+height/3, width, height/3);   // makes the 2nd section at accordance to parameters
            UI.setColor(col3);  // sets colour of 3rd section to col3 value
            UI.fillRect(left, top+height*2/3, width, height/3); // makes the 3rd section at accordance to parameters
        } else {
            UI.setLineWidth(1);
            UI.setColor(col1);  // sets colour of first section to col1 value
            UI.fillRect(left, top, width/3, height);    // makes the first section at accordance to parameters
            UI.setColor(col2);  // sets colour of 2nd section to col2 value
            UI.fillRect(left+width/3, top, width/3, height);    // makes the 2nd section at accordance to parameters
            UI.setColor(col3);  // sets colour of 3rd section to col3 value
            UI.fillRect(left+width*2/3, top, width/3, height);  // makes the 3rd section at accordance to parameters
        }
    }
    
    /**
     * draws the swiss flag
     */
    public void drawSwissFlag() {
        // variables for the swiss flag
        double left = 100;
        double top = 100;
        double size = 160;
        // sets line width to 1
        UI.setLineWidth(1);
        // sets background colour of flag to red
        UI.setColor(Color.red);
        // makes the flag background
        UI.fillRect(left, top, size, size);
        // sets colour to white
        UI.setColor(Color.white);
        // mkaes the cross of the flag
        UI.fillRect(left+size*6/32, top+size*13/32, size*20/32, size*6/32);
        UI.fillRect(left+size*13/32, top+size*6/32, size*6/32, size*20/32);
    }
    
    /**
     * draws the flag with set parameters
     */
    public void doDrawFlag() {
        // makes flag according to parameters
        this.drawFlag(300, 300, 60, 90, true, 255, 0, 0, 255, 255, 255, 0, 0, 255);
        this.drawFlag(300, 370, 50, 75, false, 0, 0, 255, 255, 255, 255, 255, 0, 0);
        this.drawFlag(400, 300, 60, 100, true, 0, 0, 0, 255, 0, 0, 255, 204, 0);
        this.drawFlag(400, 370, 50, 100, false, 22, 155, 98, 255, 255, 255, 255, 136, 62);
        this.drawFlag(300, 430, 60, 100, false, 0, 0, 0, 253, 218, 36, 239, 51, 64);
        this.drawFlag(400, 430, 60, 100, false, 0, 140, 69, 244, 245, 240, 205, 33, 42);
        this.drawSwissFlag();
    }
    
    /**
     * @param args
     */
    public static void main(String[] args){
        FLAAGS obj = new FLAAGS(); // creates new flag object
        obj.doDrawFlag();
    }

}

