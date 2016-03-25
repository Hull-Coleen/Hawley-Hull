/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.exception.MapControlException;
import byui.cit260.pirates.model.Game;
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
              this.startSavedGame();
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
               this.console.println("Invalid Entry");
               break;
       }
       return false;
    }

    private void startNewGame() {
        try 
        {
        GameControl.createNewGame(Pirates.getPlayer());
        } 
        catch(MapControlException mce)
        {
            this.console.println(mce.getMessage());
            return;
        }
        catch(Throwable te)
        { 
           this.console.println(te.getMessage());
           te.printStackTrace();
           return;
        } 
     
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }


    private void startSavedGame() {
        
        this.console.println("\n\nEnter the file path for file where the game"
                            +" is to be saved.");
        String filePath = this.getInput();
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        }catch (Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
       
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
       
        this.console.println("\n\nEnter the file path for file where the game is to be saved. ");
        String filePath = this.getInput();
        try{
            GameControl.saveGame(Pirates.getCurrentgame(), filePath);
        }catch(Exception ex){
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }   

}
