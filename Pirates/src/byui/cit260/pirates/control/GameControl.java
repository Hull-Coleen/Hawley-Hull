/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Scene;
import byui.cit260.pirates.model.Ship;
import byui.cit260.pirates.model.Supplies;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class GameControl {
    public static void createNewGame(Player player){
        // create new game
        Game game = new Game();
        Pirates.setCurrentgame(game);
        // get the player info
        game.setPlayer(player);
        // setup supplies
        Supplies[] supplyList = GameControl.createSuppliesList();
        // get ship
        Ship ship = new Ship();
        game.setShip(ship);
        // create scenes
        Scene[] scenes = Scene.createScenes();
        game.setScenes(scenes);
        // create map
        Map map = MapControl.createMap();
        game.setMap(map);
        // don't know yet
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
