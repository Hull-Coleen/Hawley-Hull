/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;


import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.model.Player;
import java.io.Serializable;


/**
 *
 * @author Coleen
 */
public class StartProgramView extends View implements Serializable{
  
    public StartProgramView() {
           
            super("\n ********************************************************************" 
                + "\n *  It is the Golden age of sailing in the open seas searching for  *"
                + "\n *  adventure and stories to claim your own! Legends are told of    *"
                + "\n * buried treasure just waiting to be found by the most courageous  *"
                + "\n * of sailors. It is the 1700's the time of the Pirates! It is      *"
                + "\n * here that you must decide whether you are with the strong and    *"
                + "\n *   noble navy trying to defend the colonies or with the thrill    *"
                + "\n *   seeking, blood thirsty pirates looking to carve out a bit of   *"
                + "\n * history for themselves.  Our story begins with a map to the lost *"
                + "\n *    treasure of Black Beard! The Navy calls forth its bravest     *"
                + "\n * captain to lead an expedition to recover the gold before anyone  *" 
                + "\n *  finds out about its existence. The Pirates find out about it    *" 
                + "\n *  through a loose tongue and are now putting together a crew of   *"
                + "\n *       their navy would not expect interference from them.        *"
                + "\n ********************************************************************"
                + "\n\nPlease enter your name: ");
            
    }

       @Override
        public boolean doAction(String value) {
            
       
        if (value.length() < 2){
            this.console.println("Invalid player name");
            return false;
        }
        Player player = GameControl.createPlayer(value);
        if (player == null){
            this.console.println("Error");
            return false;
        }
       
        this.displayNextView(player);   
        return true;
    }

    private void displayNextView(Player player) {
       
        this.console.println("\n========================================================="
                        +  "\nWelcome to Pirates on the Open  Seas " + player.getName()
                        +  "\nWe hope you enjoy the game."
                      +    "\n=========================================================\n");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }   
 
    
}