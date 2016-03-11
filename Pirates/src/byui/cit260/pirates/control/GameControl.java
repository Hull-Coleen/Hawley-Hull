/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Scene;
import byui.cit260.pirates.model.SceneType;
import byui.cit260.pirates.model.Ship;
import byui.cit260.pirates.model.Supplies;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class GameControl {
    public static void createNewGame(Player player){
        Game game = new Game();
        Pirates.setCurrentGame(game);
        game.setPlayer(player);
        Supplies[] supplyList = GameControl.createSuppliesList();
        Ship ship = new Ship();
        game.setShip(ship);
        Scene[] scenes = Scene.createScenes();
        game.setScenes(scenes);
        Map map = MapControl.createMap();
        game.setMap(map);
        MapControl.moveAvatarsToStartingLocation(map);
    }


    public static Player createPlayer(String value) {
       
        if (value == null){
            return null;
        }
        Player player = new Player();
        player.setName(value);
        Pirates.setPlayer(player);
       return player;  
    }

    public static void assignScenesToLoactions(Map map, Scene[] scenes) {
      Location [][] locations = map.getLocations();
        
        locations[1][1].setScene(scenes[SceneType.start_point.ordinal()]);
        locations[1][1].setVisited(false);
        locations[1][2].setScene(scenes[SceneType.island.ordinal()]);
        locations[1][2].setVisited(false);
        locations[1][3].setScene(scenes[SceneType.sea.ordinal()]);
        locations[1][3].setVisited(false);
        locations[2][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[2][1].setVisited(false);
        locations[2][2].setScene(scenes[SceneType.port.ordinal()]);
        locations[2][2].setVisited(false);
        locations[2][3].setScene(scenes[SceneType.island.ordinal()]);
        locations[2][3].setVisited(false);
        locations[3][1].setScene(scenes[SceneType.sea.ordinal()]);
        locations[3][1].setVisited(false);
        locations[3][2].setScene(scenes[SceneType.sea.ordinal()]);
        locations[3][2].setVisited(false);
        locations[3][3].setScene(scenes[SceneType.end_point.ordinal()]);
        locations[3][3].setVisited(false);
    } 


    private static Supplies[] createSuppliesList() {
 
      Supplies[] supply = new Supplies[3];
      Supplies food = new Supplies();
      food.setSupplyType("Food");
      food.setNumInStock(0);
      food.setNumRequired(0);
      supply[0] = food;
      Supplies rum = new Supplies();
      rum.setSupplyType("Rum");
      rum.setNumInStock(0);
      rum.setNumRequired(0);
      supply[1] = rum;
      Supplies ammo = new Supplies();
      ammo.setSupplyType("Ammo");
      ammo.setNumInStock(0);
      ammo.setNumRequired(0);
      supply[2] = ammo;
 
      return supply; 
    }
 
}
