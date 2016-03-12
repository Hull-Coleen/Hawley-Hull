/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;


import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Scene;
import byui.cit260.pirates.model.SceneType;
import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class MapControl implements Serializable{
    public static Map createMap(){
        // create the map
        Map map = new Map(3, 3);
        
        // create a list of the different scenes
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations
        assignScenesToLocations(map, scenes);
        //map.setName(scenes);
        return map;
    }

    static void moveAvatarsToStartingLocation(Map map) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
                
        Scene startingScene = new Scene();
        startingScene.setDescription(
                    "\n*** this is where we start ");
      
        startingScene.setMapSymbol("ST");
        startingScene.setVisited(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start_point.ordinal()] = startingScene;
        
        Scene portScene = new Scene();
        portScene.setDescription(
                    "*\n***                                  *"
                    + "\n       Welcome to the Port."
                    + "\n Where would you like to go first? ***");
        portScene.setMapSymbol("PG");
        portScene.setVisited(false);
        portScene.setTravelTime(240);
        scenes[SceneType.port.ordinal()] = portScene;
        
        Scene islandScene = new Scene();
        portScene.setDescription(
                    "*\n***                                  *"
                    + "\n       Welcome to the Tropical Island."
                    + "\n Where would you like to go first? ***");
        islandScene.setMapSymbol("IG");
        islandScene.setVisited(false);
        islandScene.setTravelTime(240);
        scenes[SceneType.island.ordinal()] = islandScene;
        
         Scene openSeaScene = new Scene();
        openSeaScene.setDescription(
                    "*\n***                                  *"
                    + "\n       Out on the Open Sea."
                    + "\n Where would you like to go first? ***");
        openSeaScene.setMapSymbol("0G");
        openSeaScene.setVisited(false);
        openSeaScene.setTravelTime(240);
        scenes[SceneType.sea.ordinal()] = openSeaScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                    "\nTHis is the end");
        finishScene.setMapSymbol("FN");
        finishScene.setVisited(false);
        finishScene.setTravelTime(0);
        scenes[SceneType.end_point.ordinal()] = finishScene;
        
        return scenes; 
    
       
    } 
  
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
         Location [][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start_point.ordinal()]);
        locations[0][0].setVisited(false);
        locations[0][1].setScene(scenes[SceneType.island.ordinal()]);
        locations[0][1].setVisited(false);
        locations[0][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[0][2].setVisited(false);
        locations[1][0].setScene(scenes[SceneType.sea.ordinal()]);
        locations[1][0].setVisited(false);
        locations[1][1].setScene(scenes[SceneType.port.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][2].setScene(scenes[SceneType.island.ordinal()]);
        locations[1][2].setVisited(false);
        locations[2][0].setScene(scenes[SceneType.sea.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][2].setScene(scenes[SceneType.end_point.ordinal()]);
        locations[2][2].setVisited(false);
    }
   
}
