/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirates;

import byui.cit260.pirates.model.Player;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.view.StartProgramView;
import java.io.Serializable;
/**
 *
 * @author Coleen & Thomas
 */
public class Pirates implements Serializable {
     private static Game currentgame = null;
     private static Player player = null;

    public static Game getCurrentgame() {
        return currentgame;
    }

    public static void setCurrentgame(Game currentgame) {
        Pirates.currentgame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Pirates.player = player;
    }
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
   
    }

  
}
