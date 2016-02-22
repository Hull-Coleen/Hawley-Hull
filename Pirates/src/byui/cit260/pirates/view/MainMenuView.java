/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import java.io.Serializable;
import java.util.Scanner;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class MainMenuView implements Serializable{

    public MainMenuView() {
    }
    private final String MENU = "\n"
            + "\n-------------------------------"
            + "\n          Main Menu            "
            + "\n-------------------------------"
            + "\nN - Start new game"
            + "\nG - Get and start a saved game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save Game"
            + "\nE - Exit"
            + "\n--------------------------------";
    
 
     private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid){
            input = keyboard.nextLine();
           
            if (input.length() < 1){
            System.out.println("Invalid name: must not be empty");
            continue;
            }
            break;
        }
      
        return input;
    }

    private void doAction(char selection) {
       switch(selection){
           case 'N': case 'n':
               this.startNewGame();
               break;
           case 'G':
           case 'g':
               this.startExistingGame();
               break;
           case 'H':
           case 'h':
               this.displayHelpMenu();
              break;
           case 'S':
           case 's':
               this.saveGame();
             break;
           case 'E': case 'e':
               return;
           default:
               System.out.println("Invalid Entry");
               break;
       }
    }

    private void startNewGame() {
        GameControl.createNewGame(Pirates.getPlayer());
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("startExistingGame called");
    }

    private void displayHelpMenu() {
        System.out.println("displayHelpMenu called");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("saveGame called");
    }

    void displayMainMenuView() {
        
         char selection = ' ' ;
       do {
           System.out.println(MENU);
           String input = this.getInput();
           selection = input.charAt(0);
           this.doAction(selection);        
       }while(selection != 'E');
    }
    
    
}
