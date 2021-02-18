/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit130songproject;

import java.util.Scanner;

/**
 * Object "blueprint" class for a tool storing and displaying lyrics
 * @author bobby
 */
public class LyricMachine {
    String [][] lyrics;
    String songTitle;
    String artist;
    int releaseYear;
    
    // method to create multi dimensional array
    // of a specific size
    /**
     * call this method first to create container that stores out song lyrics
     * @param maxLinesInVerse
     * @param numVerses 
     */
    public void initializeArray(int maxLinesInVerse, int numVerses){
        // Check input parameters to make sure values are above 0
        if(maxLinesInVerse > 0 && numVerses > 0){
        // initialize array of a given size
        
        lyrics = new String[maxLinesInVerse][numVerses];
        System.out.println("Created array wihh max line count: " + lyrics.length);
        System.out.println("Created array wihh verse count: " + lyrics[0].length);
    } else {
            System.out.println("Incorrect size input, must be above 0");
        } // Close if/else
    } // Close initializeArray
    // method to read in lyrics one line at a time
    public void readInLyricLine(){
        
        //Create Scanner
        Scanner inScan = new Scanner(System.in);
        
        //Read in first verse only
        // Loop that will ask user for line, then inject into current row 
        // of column 1
        for(int line = 0; line < lyrics.length; line++){
            // Read a single line from user, store temporarily in userLine
            String userLine = inScan.nextLine();
            // Inject userLine into array
            lyrics[line][0] = userLine;
        } // End for over first column
        
        
        
    } // Close readInLyricLine
    public void displayLyrics(){
        // Display values of the array
        // outer for loop iterates over the rows of our 6x3 array
        for(int row=0; row < lyrics.length; row++){
            // this inner for() loops over each column in our CURRENT row
            for(int col=0; col < lyrics[row].length; col++ ){
                // now, send to console the value of the current row and col
                System.out.println("Bin contents: " + lyrics[row][col]);
            } // close inner for over the columns
            // add a return character to start a new row on console
            System.out.println();
        } // close outer for over the rows
    }
    
} // Close class
