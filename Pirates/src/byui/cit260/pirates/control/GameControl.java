/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.model.Player;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("createNewGame stub function");
        
    }

    public static Player createPlayer(String name) {
       //System.out.println("create Player called");
        if (name == null){
            return null;
        }
        Player player = new Player();
        player.setName(name);
        Pirates.setPlayer(player);
       return player;
    }
    
}
