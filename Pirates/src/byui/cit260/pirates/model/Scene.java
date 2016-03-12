/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;


/**
 *
 * @author Coleen
 */
public class Scene implements Serializable {
    private int travelTime;
    private boolean visited;
    private String description;
    public String mapSymbol;
    private final Point coordinates;
    
     public Scene(){
        this.description = description;
        coordinates = new Point(1,1); 
    } 
    
    public Scene(int travelTime, boolean visited, String description, String mapSymbol, Point coordinates) {
        this.travelTime = travelTime;
        this.visited = visited;
        this.description = description;
        this.mapSymbol = mapSymbol;
        this.coordinates = coordinates;
    } 
       
    public String getMapSymbol() {
        return mapSymbol;
    }
  
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMapSymbol(String mapSymbol) {
       this.mapSymbol = mapSymbol;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }
    public boolean getVisited(){
        return this.visited;
    }
    

    public static Scene[] createScenes() {
        //Game game = Pirates.getCurrentGame();  // Not necessary here.
        Scene[] scenes = new Scene[SceneType.values().length];
                
        Scene startingScene = new Scene();
        startingScene.setDescription(
                    "\n*** this is where we start ");
      
        startingScene.setMapSymbol("ST");
        startingScene.setVisited(true);
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
}

