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
    // trying to figure out how to get the avatars current location
   // private final Location[][] currentLocation = Pirates.getCurrentgame().getAvatar().getLocation();
   // private final Location[][] currentLocation = new Location[1][1];
    public void display(Map map){
       // System.out.println(currentLocation);
        //Location[][] currentLocation = Pirates.getCurrentgame().getLocation();
        Location[][] locations = map.getLocations();
        
        String menu = ""
            + "\n*******************************"
            + "\n          GAME MAP"
            + "\n*******************************"
            + "\n      1     2     3     4     5";
            
            System.out.println(menu);
        
         
        for (int row = 0; row < locations.length; row++) {
            System.out.print(row + 1 + "  ");
            
            for (int col = 0; col < locations[row].length; col++){
                if (locations[row][col].getScene().getVisited())
                   System.out.print("|*" + locations[row][col].getScene().getMapSymbol() + "*|");
                //  if (locations[row][col] == currentLocation[row][col])
                 //  System.out.print("|$" + locations[row][col].getScene().getMapSymbol() + "$|");
                else
                    System.out.print("| " + locations[row][col].getScene().getMapSymbol() + " |");
               
            }
            System.out.println("");
            
        }
        System.out.println("*********************");
        
    }
}