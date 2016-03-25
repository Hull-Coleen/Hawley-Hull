/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
//import byui.cit260.pirates.model.Point;

import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class MapView {
    protected final BufferedReader keyboard = Pirates.getInFile();
    protected final PrintWriter console = Pirates.getOutFile();
   
    public void display(Map map){
        // getting location for the map
        Location[][] locations = map.getLocations();
        // header
        String menu = ""
            + "\n*******************************************"
            + "\n                GAME MAP"
            + "\n*******************************************"
            + "\n      0       1       2       3       4";
            
            System.out.println(menu);
        
         // display map with numbers on the side
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row  + "  ");
            // TODO: when go to location set to true
            for (int col = 0; col < locations[row].length; col++){
                 if (locations[row][col] == map.getCurrentLocation())
                   System.out.print("|$" + locations[row][col].getScene().getMapSymbol() + "$|");
                 else if (locations[row][col].isVisited())
                     System.out.print("|*" + locations[row][col].getScene().getMapSymbol() + "*|");
                 else
                    System.out.print("| " + locations[row][col].getScene().getMapSymbol() + " |");
               
            }
            System.out.println("");
            
        }
        System.out.println("*******************************************");
        
    }

    public void move(Map map){
        
        Location[][] locations = map.getLocations();
        
        String rowValue = null;
        String colValue = null;
        try {
        int row = -1;
        while(row < 0 || row > 4)
        {
        System.out.println("enter row");
        rowValue = this.keyboard.readLine();
        rowValue = rowValue.trim().toUpperCase();
        row = Integer.parseInt(rowValue);
        }
        
        int col = -1; 
        while(col < 0 || col > 4)
        {
            System.out.println("enter col");
            colValue = this.keyboard.readLine();
            colValue = colValue.trim().toUpperCase();
            col = Integer.parseInt(colValue);
            
            
            map.setCurrentLocation(locations[row][col]);
            locations[row][col].setVisited(true);
        
        }
        }catch(Exception e){
            System.out.println("\nError reading input: " + e.getMessage());
        }
        
         
    }
    
}