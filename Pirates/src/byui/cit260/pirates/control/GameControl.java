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
import byui.cit260.pirates.model.Supply;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class GameControl {
    Supplies[] supplyList;
    public static void createNewGame(Player player){
        // create new game
        Game game = new Game();
        Pirates.setCurrentgame(game);
        // get the player info
        game.setPlayer(player);
        // setup supplies
        Supplies[] supplyList = createSuppliesList();
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

    public static Supplies[] createSuppliesList(){
        Supplies[] supply = new Supplies[3];
        Supplies food = new Supplies();
        food.setSupplyType("Food");
        food.setNumInStock(1);
        food.setNumRequired(0);
        supply[Supply.food.ordinal()] = food;
        Supplies rum = new Supplies();
        rum.setSupplyType("Rum");
        rum.setNumInStock(2);
        rum.setNumRequired(0);
        supply[Supply.rum.ordinal()] = rum;
        Supplies ammo = new Supplies();
        ammo.setSupplyType("Ammo");
        ammo.setNumInStock(3);
        ammo.setNumRequired(0);
        supply[Supply.ammo.ordinal()] = ammo;
    
        return supply;
    }
   /* public void viewSupplyAmount(){
        // calls sort supply list
        Supplies supply[] = sortSupplies();
        // displays the type and amount of the supplies
        // here is the for each loop
        for (Supplies supply1 : supply) {
            System.out.print(supply1.getSupplyType());
            System.out.print("  ");
            System.out.print(supply1.getNumInStock());
            System.out.println("");
        }
        
    } */
    public static Supplies[] sortSupplies(){
        // create a new array of supplies
        Supplies[] sortedSupply = createSuppliesList();
        // Interate throught the array
        for (int i = 0; i < sortedSupply.length - 1; i++) {
           // interates through the array again checking to see which is bigger i or j 
           for (int j = 0; j < sortedSupply.length - 1 - i; j++){
               // If j is bigger than j plus 1 store j in a temp variable and move j plus 1 to the j spot
               if (sortedSupply[j].getSupplyType().compareToIgnoreCase(sortedSupply[j + 1].getSupplyType()) > 0 ) {
                    Supplies tempSortedSupply = sortedSupply[j];
                    sortedSupply[j] = sortedSupply[j + 1];
                    sortedSupply[j + 1] = tempSortedSupply;
                }
            }
        }
        return sortedSupply;
        
    }
        
 
}
