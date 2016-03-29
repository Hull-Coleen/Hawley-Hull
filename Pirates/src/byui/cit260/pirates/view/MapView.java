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
            
            this.console.println(menu);
        
         // display map with numbers on the side
        for (int row = 0; row < locations.length; row++) {
            this.console.print(row  + "  ");
            // TODO: when go to location set to true
            for (int col = 0; col < locations[row].length; col++){
                 if (locations[row][col] == map.getCurrentLocation())
                   this.console.print("|$" + locations[row][col].getScene().getMapSymbol() + "$|");
                 else if (locations[row][col].isVisited())
                     this.console.print("|*" + locations[row][col].getScene().getMapSymbol() + "*|");
                 else
                    this.console.print("| " + locations[row][col].getScene().getMapSymbol() + " |");
               
            }
            this.console.println("");
            
        }
        this.console.println("*******************************************");
        
    }

    public void move(Map map){
        
        Location[][] locations = map.getLocations();
        
        String rowValue = null;
        String colValue = null;
        
        // TODO check food if out of food = gameover
        
        try {
        int row = -1;
        while(row < 0 || row > 4)
        {
        this.console.println("enter row");
        rowValue = this.keyboard.readLine();
        rowValue = rowValue.trim().toUpperCase();
        row = Integer.parseInt(rowValue);
        }
        
        int col = -1; 
        while(col < 0 || col > 4)
        {
            this.console.println("enter col");
            colValue = this.keyboard.readLine();
            colValue = colValue.trim().toUpperCase();
            col = Integer.parseInt(colValue);
            
            
            map.setCurrentLocation(locations[row][col]);
            locations[row][col].setVisited(true);
            
            // battle view 
            if(!locations[row][col].isFriendly())
            {
                //call battle view
                
                BattleView battle = new BattleView();
                battle.display();
                
                
            
            }
            else 
                this.console.println("You found a friendly location"
                                   + "And you continue on your way");
            if (locations[row][col].isTreasure())
            {
                this.console.println("YAY you found the treasure!!"
                                   + "YOU WIN!!!");
                System.exit(0);
                
            }
        }
        }catch(Exception e){
            this.console.println("\nError reading input: " + e.getMessage());
        }
        
        
         
    }
    
}