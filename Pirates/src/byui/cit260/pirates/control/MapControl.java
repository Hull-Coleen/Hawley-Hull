/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;


import byui.cit260.pirates.exception.MapControlException;
import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Point;
import byui.cit260.pirates.model.Scene;
import byui.cit260.pirates.model.SceneType;
//import java.awt.Point;
import java.io.Serializable;
//import byui.cit260.pirates.model.Point;
import pirates.Pirates;
/**
 *
 * @author Coleen
 */
public class MapControl implements Serializable{
    public static Map createMap(){
        // create the map
        Map map = new Map(5, 5);
        
        // create a list of the different scenes
        Scene[] scenes = Scene.createScenes();
        
        // assign the different scenes to locations
        assignScenesToLocations(map, scenes);
        //map.setName(scenes);
        return map;
    }

    static void moveAvatarsToStartingLocation(Map map) throws MapControlException {
        Avatar[] avatars = Avatar.values();
        for (Avatar avatar: avatars){
            Point coordinates = avatar.getCoordinates();
            MapControl.moveAvatarToLocation(avatar, coordinates);
            
        }
      
    }
    public static void moveAvatarToLocation(Avatar avatar, Point coordinates) throws MapControlException {
        Map map = Pirates.getCurrentgame().getMap();
        int newRow = coordinates.x - 1;
        int newCol = coordinates.y - 1;
        if (newRow < 0 || newRow >= map.getRow() || newCol < 0 || newCol >+ map.getCol()){
            throw new MapControlException("Cannot move avatar to location " + coordinates.x + ","
            + coordinates.y + " \nbecause locations is out of bounds on the map");
         
        }
        
    }
  
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
         Location [][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[SceneType.start_point.ordinal()]);
        locations[0][0].setVisited(true);
        map.setCurrentLocation(locations[0][0]);
        locations[0][1].setScene(scenes[SceneType.island.ordinal()]);
        locations[0][1].setVisited(true);
        locations[0][1].setFriendly(true);
        locations[0][1].setTreasure(false);
        locations[0][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[0][2].setVisited(false);
        locations[0][3].setScene(scenes[SceneType.sea.ordinal()]);
        locations[0][3].setVisited(false);
        locations[0][4].setScene(scenes[SceneType.port.ordinal()]);
        locations[0][4].setVisited(false);
        locations[0][4].setFriendly(false);
        locations[0][4].setTreasure(false);
        locations[1][0].setScene(scenes[SceneType.island.ordinal()]);
        locations[1][0].setVisited(false);
        locations[0][1].setFriendly(true);
        locations[0][1].setTreasure(false);
        locations[1][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][3].setScene(scenes[SceneType.island.ordinal()]);
        locations[1][3].setVisited(false);
        locations[1][3].setFriendly(false);
        locations[1][3].setTreasure(false);
        locations[1][4].setScene(scenes[SceneType.sea.ordinal()]);
        locations[1][4].setVisited(false);
        locations[2][0].setScene(scenes[SceneType.island.ordinal()]);
        locations[2][0].setVisited(false);
        locations[2][0].setFriendly(true);
        locations[2][0].setTreasure(false);
        locations[2][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][3].setScene(scenes[SceneType.port.ordinal()]);
        locations[2][3].setVisited(false);
        locations[2][3].setFriendly(true);
        locations[2][3].setTreasure(false);
        locations[2][4].setScene(scenes[SceneType.island.ordinal()]);
        locations[2][4].setVisited(false);
        locations[2][4].setFriendly(false);
        locations[2][4].setTreasure(false);
        locations[3][0].setScene(scenes[SceneType.sea.ordinal()]);
        locations[3][0].setVisited(false);
        locations[3][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][2].setScene(scenes[SceneType.port.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][1].setFriendly(false);
        locations[3][1].setTreasure(false);
        locations[3][3].setScene(scenes[SceneType.sea.ordinal()]);
        locations[3][3].setVisited(false);
        locations[3][4].setScene(scenes[SceneType.port.ordinal()]);
        locations[3][4].setVisited(false);
        locations[3][4].setFriendly(false);
        locations[3][4].setTreasure(false);
        locations[4][0].setScene(scenes[SceneType.island.ordinal()]);
        locations[4][0].setVisited(false);
        locations[0][1].setFriendly(true);
        locations[0][1].setTreasure(false);
        locations[4][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[4][1].setVisited(false);
        locations[4][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[4][2].setVisited(false);
        locations[4][3].setScene(scenes[SceneType.sea.ordinal()]);
        locations[4][3].setVisited(false);
        locations[4][4].setScene(scenes[SceneType.end_point.ordinal()]);
        locations[4][4].setVisited(false);
        locations[0][1].setFriendly(false);
        locations[0][1].setTreasure(true);
    }
   
}
