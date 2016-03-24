/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import java.util.Scanner;
//import byui.cit260.pirates.model.Point;

import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class MapView {
   
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
        
        
        Scanner keyboard = new Scanner(System.in);
        //try {
        int row = -1;
        while(row < 0 || row > 4)
        {
        System.out.println("enter row");
        
        row = keyboard.nextInt();
        }
        
        int col = -1; 
        while(col < 0 || col > 4)
        {
            System.out.println("enter col");
            col = keyboard.nextInt();
            /*String value =keyboard.nextLine(); 
            
            value = value.trim().toUpperCase();
            try {
                col = Integer.parseInt(value);
            } 
            catch (NumberFormatException nf){
                System.out.println(nf.getMessage() + " Invalid entry: Try again.");
                col = -1;
            }*/
            
            
        
        }
       // }catch(Exception e){
        ////    System.out.println("\nError reading input: " + e.getMessage());
        //}
        map.setCurrentLocation(locations[row][col]);
        locations[row][col].setVisited(true);
         
    }
    
}