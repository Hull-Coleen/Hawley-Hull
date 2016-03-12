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
        // String mapName = getMapSymbol();
       // map.setName(mapName);
       // Location[][] location = new Location();
       // map.setScene( );
        Location[][] locations = map.getLocations();
         String menu = ""
            + "\n***********************************************************************"
            + "\n                            MAP"
            + "\n***********************************************************************";
            
            System.out.println(menu);
        
         
        for (int row = 0; row < map.getLocations().length; row++) {
            if (row != 0 && row % 2 == 0)
                System.out.println("");
            for (int col = 0; col < map.getLocations().length; col++){
                System.out.print("| " + map.getScene() + " |");
               // System.out.print("| " + Scene.getMapSymbol() + " |");
              // System.out.print("| " +  map.getName() + " | ");
                if (col != 0 && col % 2 == 0)
                    System.out.println("");
            }
        }
        System.out.println("***************************************");
        
    }
}
