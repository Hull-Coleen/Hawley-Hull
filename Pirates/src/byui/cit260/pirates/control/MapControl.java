/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;


import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Scene;
import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class MapControl implements Serializable{
    public static Map createMap(){
        // create the map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations
        assignScenesToLocations(map, scenes);
        return map;
    }

    static void moveAvatarsToStartingLocation(Map map) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static Scene[] createScenes() {
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
