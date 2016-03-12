/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;

/**
 *
 * @author Coleen
 */
public class MapView {
    public void display(Map map){
       
        Location[][] locations = map.getLocations();
         String menu = ""
            + "\n***********************************************************************"
            + "\n                            MAP"
            + "\n***********************************************************************";
            
            System.out.println(menu);
        
         
        for (int row = 0; row < locations.length; row++) {
            
            for (int col = 0; col < locations.length; col++){
                if (locations[row][col].getScene().getVisited())
                    System.out.print("|*" + locations[row][col].getScene().getMapSymbol() + "*|");
                else
                   System.out.print("| " + locations[row][col].getScene().getMapSymbol() + " |");
               
            }
            System.out.println("");
            
        }
        System.out.println("***************************************");
        
    }
}
