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
 * @version v2.8/4/2021
 */
public class FLAAAAGS {
    /**
     * Constructer for FLAAAAGS!
     */
    public FLAAAAGS() {
        UI.initialise();
        UI.addButton("Quit", UI::quit);
    }
    
    /**
     * draw flag (left, top, height, width, isHorizontal, 
     * red1, green1, blue1, red2, green2, blue2, red3, green3, blue3)
     * red#, green#, and blue# are the rgb values 
     * for each colour of flag section
     */
    private void drawThreeStripeFlag(double left, double top, double height, 
    double width, boolean isHorizontal, int red1, int green1, int blue1, 
    int red2, int green2, int blue2, int red3, int green3, int blue3) {
        // sets color according to red, green and blue value
        Color col1 = new Color(red1, green1, blue1);
        Color col2 = new Color(red2, green2, blue2);
        Color col3 = new Color(red3, green3, blue3);
        // checks to see if flag sections are vertical or horizontal
        if (isHorizontal) { 
            UI.setLineWidth(1);
            // sets colour of first section to col1 value
            UI.setColor(col1);  
            // makes the first section at accordance to parameters
            UI.fillRect(left, top, width, height / 3);
            // sets colour of 2nd section to col2 value
            UI.setColor(col2);  
            // makes the 2nd section at accordance to parameters
            UI.fillRect(left, top + height / 3, width, height / 3);   
            // sets colour of 3rd section to col3 value
            UI.setColor(col3);  
            // makes the 3rd section at accordance to parameters
            UI.fillRect(left, top + height * 2 / 3, width, height / 3); 
        } 
        else {
            UI.setLineWidth(1);
            // sets colour of first section to col1 value
            UI.setColor(col1);  
            // makes the first section at accordance to parameters
            UI.fillRect(left, top, width / 3, height);    
            // sets colour of 2nd section to col2 value
            UI.setColor(col2);  
            // makes the 2nd section at accordance to parameters
            UI.fillRect(left + width / 3, top, width / 3, height);   
            // sets colour of 3rd section to col3 value
            UI.setColor(col3);  
            // makes the 3rd section at accordance to parameters
            UI.fillRect(left + width * 2 / 3, top, width / 3, height);  
        }
    }
    
    /**
     * draws the Swiss flag
     */
    public void drawSwissFlag() {
        // variables for the swiss flag
        double left = 170;
        double top = 300;
        double size = 80;
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
     * draws the Thai flag
     */
    public void drawThaiFlag() {
        // sets section colours
        Color col1 = new Color(165, 25, 49);
        Color col2 = new Color(244, 245, 248);
        Color col3 = new Color(45, 42, 74);
        // sets location and size
        double left = 260;
        double top = 300;
        double height = 60;
        double width = 100;
        // sets line width to 1
        UI.setLineWidth(1);
        // sets colour to col1
        UI.setColor(col1);
        // creates 1st section
        UI.fillRect(left, top, width, height);
        // sets colour to col2
        UI.setColor(col2);
        // creates 2nd section
        UI.fillRect(left, top+height*1/6, width, height*2/3);
        //sets colour to col3
        UI.setColor(col3);
        // creates 3rd section
        UI.fillRect(left, top+height*1/3, width, height*1/3);
        
    }
    
    /**
     * draws the japanese flag
     */
    public void drawJapaneseFlag() {
        // sets colours of sections
        Color col1 = new Color(244, 245, 240);
        Color col2 = new Color(190, 0, 41);
        // sets location and size
        double left  = 370;
        double top = 300;
        double height = 60;
        double width = 90;
        // sets line width to 1
        UI.setLineWidth(1);
        // sets colour for 1st section
        UI.setColor(col1);
        // creates 1st section
        UI.fillRect(left, top, width, height);
        // sets colour for 2nd section
        UI.setColor(col2);
        // creates 2nd section
        UI.fillOval(left+width*27/90, top+height*1/5, 36, 36);
    }
    
    /**
     * draws belgiu flag
     */
    public void drawBelgiumFlag() {
        Color col1 = new Color(0, 0, 0);
        Color col2 = new Color(253, 218, 36);
        Color col3 = new Color(239, 51, 64);
        double left = 280;
        double top = 370;
        double height = 65;
        double width = 75;
        
        // sets line width to 1
        UI.setLineWidth(1);
        // sets colour of first section to col1 value
        UI.setColor(col1);  
        // makes the first section at accordance to parameters
        UI.fillRect(left, top, width / 3, height);    
        // sets colour of 2nd section to col2 value
        UI.setColor(col2);  
        // makes the 2nd section at accordance to parameters
        UI.fillRect(left + width / 3, top, width / 3, height);   
        // sets colour of 3rd section to col3 value
        UI.setColor(col3);  
        // makes the 3rd section at accordance to parameters
        UI.fillRect(left + width * 2 / 3, top, width / 3, height); 
        
    }
    
    
    /**
     * draws the flag with set parameters
     */
    public void doDrawFlag() {
        // makes flag according to parameters
        this.drawThreeStripeFlag(100, 100, 60, 90, true, 
            255, 0, 0, 255, 255, 255, 0, 0, 255);
        this.drawThreeStripeFlag(100, 170, 50, 75, false, 
            0, 0, 255, 255, 255, 255, 255, 0, 0);
        this.drawThreeStripeFlag(210, 100, 60, 100, true, 
            0, 0, 0, 255, 0, 0, 255, 204, 0);
        this.drawThreeStripeFlag(210, 170, 50, 100, false, 
            22, 155, 98, 255, 255, 255, 255, 136, 62);
        this.drawThreeStripeFlag(320, 100, 60, 100, false, 
            0, 0, 0, 253, 218, 36, 239, 51, 64);
        this.drawThreeStripeFlag(430, 100, 60, 100, false, 
            0, 140, 69, 244, 245, 240, 205, 33, 42);
        this.drawThreeStripeFlag(430, 170, 60, 100, true, 
            255, 255, 255, 0, 57, 166, 213, 43, 30);
        this.drawThreeStripeFlag(320, 170, 60, 100, true, 
            255, 0, 0, 255, 255, 255, 255, 0, 0);
        this.drawThaiFlag();
        this.drawSwissFlag();
        this.drawJapaneseFlag();
        this.drawBelgiumFlag();
        final int RGB = 255;
        double left = UI.askDouble("X coord: ");
        double top = UI.askDouble("Y coord: ");
        double height = UI.askDouble("Height: ");
        double width = UI.askDouble("Width: ");
        boolean isHorizontal = true;
        int horizontal = 0;
        int answer = 0;
        while (answer == 0) {
            horizontal = UI.askInt("Is horizontal? (yes(1)/no(2)): ");
            
            if (horizontal == 1) {
                answer++;
            } else if (horizontal == 2) {
                answer++;
                answer++;
            }
        }
        
        if (horizontal == 1) {
            isHorizontal = true;
        } else if (horizontal == 2) {
            isHorizontal = false;
        }
        
        int[] rgb = {256, 256, 256, 256, 256, 256, 256, 256, 256};
        for (int i = 0; i < rgb.length; i++) {
            while (rgb[i] > RGB || rgb[i] < 0) {
                rgb[i] = UI.askInt("Enter in rgb value " + (i+1) + ": ");
            }
        }
        this.drawThreeStripeFlag(left, top, height, width, isHorizontal, rgb[0],
            rgb[1], rgb[2], rgb[3], rgb[4], rgb[5], rgb[6], rgb[7], rgb[8]);
    }
    
    /**
     * 
     * @param args s
     */
    public static void main(String[] args){
        FLAAAAGS obj = new FLAAAAGS(); // creates new flag object
        obj.doDrawFlag();
    }
}
