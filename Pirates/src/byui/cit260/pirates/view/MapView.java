/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
//import byui.cit260.pirates.model.Point;

import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class MapView {
    private final Location[][] currentLocation = Pirates.getCurrentgame().getLocation();
    public void display(Map map){
        
       // Location[][] currentLocation = Pirates.getCurrentgame().getLocation();
        Location[][] locations = map.getLocations();
        String menu = ""
            + "\n*********************"
            + "\n      GAME MAP"
            + "\n*********************"
            + "\n      1     2     3";
            
            System.out.println(menu);
        
         
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + 1 + "  ");
            
            for (int col = 0; col < locations.length; col++){
                if (locations[row][col].getScene().getVisited())
                   System.out.print("|*" + locations[row][col].getScene().getMapSymbol() + "*|");
                else  if (locations == currentLocation)
                    System.out.print("|$" + locations[row][col].getScene().getMapSymbol() + "$|");
                else
                    System.out.print("| " + locations[row][col].getScene().getMapSymbol() + " |");
               
            }
            System.out.println("");
            
        }
        System.out.println("*********************");
        
    }
}
