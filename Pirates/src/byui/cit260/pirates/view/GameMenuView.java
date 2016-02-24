
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;


import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author Coleen
 */
public class GameMenuView implements Serializable{
     private final String MENU = "\n"          
            + "\n-------------------------------"
            + "\n       Game Start Menu         "
            + "\n-------------------------------"
            + "\nP - Pirate or Navy"
            + "\nS - Pick Ship Size"
            + "\nG - Get supplies for ship"
            + "\nE - Exit"
            + "\n--------------------------------";
    
 
     private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid){
            input = keyboard.nextLine().toUpperCase();
           
            if (input.length() < 1){
            System.out.println("Invalid name: must not be empty");
            continue;
            }
            //break;
            valid = true;
        }
      
        return input;
    }

    private void doAction(char selection) {
       switch(selection){
           case 'P': 
               this.chooseAvatar();
               break;
           case 'S':
              this.getShipSize();
               break;
           case 'G':
              this.supplyShip();
              break;
           case 'E': 
               return;
           default:
               System.out.println("Invalid Entry");
               break;
       }
    }
    void displayMenu() {
        
         char selection = ' ' ;
       do {
           System.out.println(MENU);
           String input = this.getInput();
           selection = input.charAt(0);
           this.doAction(selection);        
       }while(selection != 'E');
    }
    private void chooseAvatar() {
        System.out.println("chooseAvatar stubbed");
    }

    private void getShipSize() {
       System.out.println("getShipSize stubbed");
    }

    private void supplyShip() {
        System.out.println("supplyShip stubbed");
    }
    
    
}
