package cit130songproject;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bobby
 */
public class SongWorld {
    public static void main(String[] args){
    //Create instance for out method
    // testLyricMachine();
    // testLyricLine();
    buildLyricLineArray();
    
        
}
public static void testLyricMachine(){
LyricMachine lm = new LyricMachine();
lm.initializeArray(5, 4);
lm.readInLyricLine();
lm.displayLyrics();

}
public static void testLyricLine(){
    //Creating an instance of LyricLine
    
    LyricLine lineTest1 = new LyricLine();
    
    displayLyricLineInfo(lineTest1);
    
    System.out.println(lineTest1.lineText);
    System.out.println("Time to display: " + lineTest1.timeToDisplayMilli);
    LyricLine lineTest2 = new LyricLine("Found a message in my bottle your son is comin' up", 1000 );
    displayLyricLineInfo(lineTest2);
}
/**
     * Test code for arrays of custom types!
     */
    public static void buildLyricLineArray(){
        // Create an array size 3
        LyricLine[] superLyrics = new LyricLine[27];
        // CHAT TASK: assign new LyricLine("Been sittin' on my window-sill all day", 4480);
        // to shelf 0
        System.out.println("Press Enter.");
        superLyrics[0] =  new LyricLine("beginning in 3.", 1000);
        superLyrics[1] =  new LyricLine("2.", 1000);
        superLyrics[2] =  new LyricLine("1.", 1000);
        superLyrics[3] =  new LyricLine("If I can pay my bills, I'm good, I'm coming over", 3000);
        superLyrics[4] =  new LyricLine("Found a message in my bottle, your son is coming up", 4000);
        superLyrics[5] =  new LyricLine("\"By the beer, by ear, by boo\"—what Yari saying?", 4000);
        superLyrics[6] =  new LyricLine("You ain’t nothin' but a baby, your fear is growing up", 3000);
        superLyrics[7] =  new LyricLine("Listen here, I say, my dude, and what you call it", 3000);
        superLyrics[8] =  new LyricLine("It was Heaven at the bottom and peace from throwing up", 4000);
        superLyrics[9] =  new LyricLine("\"By the beer, by ear, by boo\"—what Yari saying?", 4000);
        superLyrics[10] =  new LyricLine("You ain’t nothin' but a baby, your fear is growing up", 3000);
        superLyrics[11] =  new LyricLine("I think I do this shit for real, dawg, hey", 3900);
        superLyrics[12] =  new LyricLine("I ain't no motherfucking maybe", 2300);
        superLyrics[13] =  new LyricLine("I'm for motherfucking real, dawg, hey", 3900);
        superLyrics[14] =  new LyricLine("Mama, mama", 1500);
        superLyrics[15] =  new LyricLine("I got some dollars for your bills, dawg, hey (Bills, dawg)", 5000);
        superLyrics[16] =  new LyricLine("Now I'm the heading, I'm the topic", 2000);
        superLyrics[17] =  new LyricLine("All that matters, I'm Jaleel, dog, hey", 6300);
        superLyrics[18] =  new LyricLine("Yeah, you know, I think the sunshine", 4000);
        superLyrics[19] =  new LyricLine("Should feel how I feel, how I feel, like, yeah", 4800);
        superLyrics[20] =  new LyricLine("I think at night time", 2700);
        superLyrics[21] =  new LyricLine("The moon should call my phone", 2350);
        superLyrics[22] =  new LyricLine("Hit my line, I'm here for you", 3000);
        superLyrics[23] =  new LyricLine("And Eastside, shame on us", 4000);
        superLyrics[24] =  new LyricLine("Rain, come on now", 3600);
        superLyrics[25] =  new LyricLine("I figured the mood", 2000 );
        superLyrics[26] =  new LyricLine("I figure, I figure", 3500);
        
        // pass our nice array of LyricLines to our Karaoke simulator
        karaokeSimulation(superLyrics);
        
    } // close test
    
    /**
     * Displays lines of lyrics with timings
     * @param kTape Array of instantiated LyricLine objects
     */
    public static void karaokeSimulation(LyricLine[] kTape){
        Scanner scan = new Scanner(System.in);
        // wait for an enter press
        String wait = scan.nextLine();
        
        // iterate over our incoming array of LyricLines, one at a time
        for(int line = 0; line < kTape.length; line++){
                // Extract the LyricLine object from our current row
                // and store temporarily
                LyricLine tempLine = kTape[line];
                // dump lyric to console
                System.out.println(tempLine.lineText);
                try {
                    Thread.sleep(tempLine.timeToDisplayMilli);
                }catch (InterruptedException ex) {
                    // do nothing
                }
            } // close for
            
    } // close Karaoko
    
    /**
     * Utility methods for displaying guts of a lyric line
     * @param line 
     */
    private static void displayLyricLineInfo(LyricLine line){
        System.out.println("Text: " + line.lineText);
        System.out.println("Time to display: " + line.timeToDisplayMilli);
    } // close utility methods
    
} // Close Class
    

