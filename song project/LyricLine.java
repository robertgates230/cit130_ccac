/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130songproject;

/**
 * Models a single line of a lyric in a song
 * and contains timing data
 * @author bobby 
 */
 
public class LyricLine {

    // Declare member variables
    public String lineText;
    public long timeToDisplayMilli;

    // Default, no argument constructor
    // Constructor names are ALWAYS identical to the class names
    // with optional input arguments
    
    
    public LyricLine() {
        // System.out.println("Inside no-arg constructor");
        
        //Initializing member variables to sensible defaults
        lineText = "[no lyric]";
        timeToDisplayMilli = 1000;
        
        

    } //close no-arg constructor
    /**
     * Create an instance of LyricLine
     * @param lt actual line text
     * @param ms time to display in milliseconds
     */
    public LyricLine(String lt, long ms){
       // System.out.println("In two-arg constructor");
        // System.out.println("received lt " + lt);
        // System.out.println("received ms " + ms);
        // transfer the input paramaters to our member
        // variables
        lineText = lt;
        timeToDisplayMilli = ms;
        
        
    }//close two-arg constructor

}
