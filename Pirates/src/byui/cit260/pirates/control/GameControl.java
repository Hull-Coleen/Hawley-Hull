/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.exception.GameControlException;
import byui.cit260.pirates.exception.MapControlException;
import byui.cit260.pirates.model.Avatar;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Map;
import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Scene;
import byui.cit260.pirates.model.Ship;
import byui.cit260.pirates.model.Supply;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class GameControl implements Serializable{

    public static void saveGame(Game game, String filepath) throws GameControlException {
      try( FileOutputStream fops = new FileOutputStream(filepath)) {
          ObjectOutputStream output = new ObjectOutputStream(fops);
          
          output.writeObject(game); // write the game object out to file
      }
      catch(Exception e) {
          throw new GameControlException(e.getMessage());
      }
    }
    Supply[] supplyList;
    public static void createNewGame(Player player) throws MapControlException{
        // create new game
        Game game = new Game();
        Pirates.setCurrentgame(game);
        // get the player info
        game.setPlayer(player);
        // setup supplies
        Supply[] supplyList = createSuppliesList();
        game.setSupplies(supplyList);
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

    public static Supply[] createSuppliesList(){
        Supply[] supply = new Supply[Supply.values().length];
        Supply food = Supply.food;
        food.setSupplyType("Food");
        food.setNumInStock(0);
        food.setNumRequired(0);
        supply[Supply.food.ordinal()] = food;
        Supply rum = Supply.rum;
        rum.setSupplyType("Rum");
        rum.setNumInStock(0);
        rum.setNumRequired(0);
        supply[Supply.rum.ordinal()] = rum;
        Supply ammo = Supply.ammo;
        ammo.setSupplyType("Ammo");
        ammo.setNumInStock(0);
        ammo.setNumRequired(0);
        supply[Supply.ammo.ordinal()] = ammo;
    
        return supply;
    }

    public static Supply[] sortSupplies(){
        // create a new array of supplies
        Game game = Pirates.getCurrentgame();
        Supply[] sortedSupply = game.getSupplies(); //createSuppliesList(); 
        // Interate throught the array
        for (int i = 0; i < sortedSupply.length - 1; i++) {
           // interates through the array again checking to see which is bigger i or j 
           for (int j = 0; j < sortedSupply.length - 1 - i; j++){
               // If j is bigger than j plus 1 store j in a temp variable and move j plus 1 to the j spot
               if (sortedSupply[j].getSupplyType().compareToIgnoreCase(sortedSupply[j + 1].getSupplyType()) > 0 ) {
                    Supply tempSortedSupply = sortedSupply[j];
                    sortedSupply[j] = sortedSupply[j + 1];
                    sortedSupply[j + 1] = tempSortedSupply;
                }
            }
        }
        return sortedSupply;
        
    }
     public static void names(){
       Avatar[] names = Avatar.values();
        for (Avatar name : names){
           if (name.getDescription() == "Boy navy") 
            System.out.println(name + "  " + name.ordinal());
           if (name.getDescription() == "Girl navy") 
            System.out.println(name + "  " + name.ordinal());
           if (name.getDescription() == "Boy pirate") 
            System.out.println(name + "  " + name.ordinal());
           if (name.getDescription() == "Girl pirate") 
            System.out.println(name + "  " + name.ordinal());
        }
            
     }   
     
     public static void getSavedGame(String filepath)
                        throws GameControlException{
         Game game = null;
         
         try(FileInputStream fips = new FileInputStream(filepath)){
             ObjectInputStream input = new ObjectInputStream(fips);
             
             // read the game object from file
             game = (Game) input.readObject(); 
         }
         catch(Exception e){
             throw new GameControlException(e.getMessage());
         }
         
         //clost the output file
         Pirates.setCurrentgame(game);
     }
 
}
