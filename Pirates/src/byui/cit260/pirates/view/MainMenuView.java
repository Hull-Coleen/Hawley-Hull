/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import java.io.Serializable;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class MainMenuView extends View implements Serializable{


   public MainMenuView() {
        super( "\n-------------------------------"
            + "\n          Main Menu            "
            + "\n-------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n--------------------------------"); 
    }
    @Override
    public boolean doAction(String value) {
    value = value.toUpperCase();
    char selection;
     selection = value.charAt(0);
       switch(selection){
           case 'N': 
               this.startNewGame();
               break;
           case 'G':
              this.startExistingGame();
               break;
           case 'H':
              this.displayHelpMenu();
              break;
           case 'S':
             this.saveGame();
             break;
           case 'E': 
               return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }

    private void startNewGame() {
        GameControl.createNewGame(Pirates.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
       
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("saveGame called");
    }   
}
