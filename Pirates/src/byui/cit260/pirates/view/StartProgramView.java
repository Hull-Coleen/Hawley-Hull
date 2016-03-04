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
    //private String promptMessage;

    

    public StartProgramView() {
           // this.displayBanner();
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
            //this.displayBanner();
    }
    
    
        
      
   // Player player = GameControl.createPlayer(playerName);
   /* @Override
    public boolean doAction(String value){
        Player player = GameControl.createPlayer(value);
        this.displayBanner();
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
        return false;
    }  */
     /*  private void displayBanner(){
        System.out.println("********************************************************************");
        System.out.println("*  It is the Golden age of sailing in the open seas searching for  *");
        System.out.println("*   adventure and stories to claim your own! Legends are told of   *");
        System.out.println("* buried treasure just waiting to be found by the most courageous  *");
        System.out.println("*  of sailors.  It is the 1700's the time of the Pirates! It is    *");
        System.out.println("*  here that you must decide whether you are with the strong and   *");
        System.out.println("*   noble navy trying to defend the colonies or with the thrill    *");
        System.out.println("*   seeking, blood thirsty pirates looking to carve out a bit of   *");
        System.out.println("* history for themselves.  Our story begins with a map to the lost *");
        System.out.println("*    treasure of Black Beard! The Navy calls forth its bravest     *");
        System.out.println("* captain to lead an expedition to recover the gold before anyone  *");
        System.out.println("*  finds out about its existence. The Pirates find out about it    *");
        System.out.println("*  through a loose tongue and are now putting together a crew of   *");
        System.out.println("*       their navy would not expect interference from them.        *");
        System.out.println("********************************************************************");
    } */
       @Override
        public boolean doAction(String value) {
            
       
        if (value.length() < 2){
            System.out.println("Invalid player name");
            return false;
        }
        Player player = GameControl.createPlayer(value);
        if (player == null){
            System.out.println("Error");
            return false;
        }
       
        this.displayNextView(player);   
        return true;
    }

    private void displayNextView(Player player) {
       
        System.out.println("\n========================================================="
                        +  "\nWelcome to Pirates on the Open  Seas " + player.getName()
                        +  "\nWe hope you enjoy the game."
                      +    "\n=========================================================\n");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }   
  /*  public StartProgramView() {
       this.promptMessage = "\nPlease enter your name: ";
       this.displayBanner();
    }  

    public StartProgramView() {
        super();
    }
    
 

    private void displayBanner(){
        System.out.println("********************************************************************");
        System.out.println("*  It is the Golden age of sailing in the open seas searching for  *");
        System.out.println("*   adventure and stories to claim your own! Legends are told of   *");
        System.out.println("* buried treasure just waiting to be found by the most courageous  *");
        System.out.println("*  of sailors.  It is the 1700's the time of the Pirates! It is    *");
        System.out.println("*  here that you must decide whether you are with the strong and   *");
        System.out.println("*   noble navy trying to defend the colonies or with the thrill    *");
        System.out.println("*   seeking, blood thirsty pirates looking to carve out a bit of   *");
        System.out.println("* history for themselves.  Our story begins with a map to the lost *");
        System.out.println("*    treasure of Black Beard! The Navy calls forth its bravest     *");
        System.out.println("* captain to lead an expedition to recover the gold before anyone  *");
        System.out.println("*  finds out about its existence. The Pirates find out about it    *");
        System.out.println("*  through a loose tongue and are now putting together a crew of   *");
        System.out.println("*       their navy would not expect interference from them.        *");
        System.out.println("********************************************************************");
    }


    public void displayStartProgramView() {
       
        boolean done = false;
        do {
           String playerName = this.getPlayerName();
           if (playerName.toUpperCase().equals("Q"))
               return;
           done = this.doAction(playerName);
        }while(!done);
        
    }

    private String getPlayerName() {
         boolean valid = false;
        String value = "";
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid){
            System.out.println("\n" + this.promptMessage);
            value = keyboard.nextLine();
            value = value.trim();
            if (value.length() < 1){
            System.out.println("Invalid name: must not be empty");
            continue;
            }
            break;
        }
        return value;
       
        
    }

    private boolean doAction(String playerName) {
       
        if (playerName.length() < 2){
            System.out.println("Invalid player name");
            return false;
        }
        Player player = GameControl.createPlayer(playerName);
        if (player == null){
            System.out.println("Error");
            return false;
        }
         this.displayNextView(player);   
        return true;
    }

    private void displayNextView(Player player) {
       
        System.out.println("\n========================================================="
                        +  "\nWelcome to Pirates on the Open  Seas " + player.getName()
                        +  "\nWe hope you enjoy the game."
                      +    "\n=========================================================\n");
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    } */

    
}