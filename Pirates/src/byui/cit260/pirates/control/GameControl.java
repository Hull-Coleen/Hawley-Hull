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
        Game game = new Game();
        Pirates.setCurrentGame(game);
        game.setPlayer(player);
        Supplies[] supplyList = GameControl.createSuppliesList();
        Ship ship = new Ship();
        game.setShip(ship);
        Map map = MapControl.createMap();
        game.setMap(map);
        MapControl.moveAvatarsToStartingLocation(map);
    }

   /* private static SuppliesItem[] createSuppliesList() {
      
      SuppliesItem[] supply = new SuppliesItem[3];
      SuppliesItem food = new SuppliesItem();
      food.setDescription("Food");
      food.setAmountInStock(0);
      food.setRequiredAmount(0);
      supply[SuppliesItem.food.ordinal()] = food;
      SuppliesItem rum = new SuppliesItem();
      rum.setDescription("Rum");
      rum.setAmountInStock(0);
      rum.setRequiredAmount(0);
      supply[SuppliesItem.rum.ordinal()] = rum;
      SuppliesItem ammo = new SuppliesItem();
      ammo.setDescription("Ammo");
      ammo.setAmountInStock(0);
      ammo.setRequiredAmount(0);
      supply[SuppliesItem.ammo.ordinal()] = ammo;
 
      return supply;
    } */

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
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 

  /*  private static SuppliesItem[] createSuppliesList() {
      SuppliesItem[] supply = new SuppliesItem[3];
      SuppliesItem food = new SuppliesItem();
      food.setDescription("Food");
      food.setAmountInStock(0);
      food.setRequiredAmount(0);
      supply[SuppliesItem.food.ordinal()] = food;
      SuppliesItem rum = new SuppliesItem();
      rum.setDescription("Rum");
      rum.setAmountInStock(0);
      rum.setRequiredAmount(0);
      supply[SuppliesItem.rum.ordinal()] = rum;
      SuppliesItem ammo = new SuppliesItem();
      ammo.setDescription("Ammo");
      ammo.setAmountInStock(0);
      ammo.setRequiredAmount(0);
      supply[SuppliesItem.ammo.ordinal()] = ammo;
 
      return supply;
        
    } */


    private static Supplies[] createSuppliesList() {
 
      Supplies[] supply = new Supplies[3];
      Supplies food = new Supplies();
      food.setDescription("Food");
      food.setAmountInStock(0);
      food.setRequiredAmount(0);
      supply[0] = food;
      Supplies rum = new Supplies();
      rum.setDescription("Rum");
      rum.setAmountInStock(0);
      rum.setRequiredAmount(0);
      supply[1] = rum;
      Supplies ammo = new Supplies();
      ammo.setDescription("Ammo");
      ammo.setAmountInStock(0);
      ammo.setRequiredAmount(0);
      supply[2] = ammo;
 
      return supply; 
    }
 
}
