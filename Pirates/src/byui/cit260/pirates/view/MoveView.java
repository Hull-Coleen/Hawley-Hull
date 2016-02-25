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
 * @author hawle_000
 */
class MoveView implements Serializable{
     private final String MENU = "\n"          
            + "\n-------------------------------"
            + "\n       Game Start Menu         "
            + "\n-------------------------------"
            + "\nW - Pirate or Navy"
            + "\nS - Pick Ship Size"
            + "\nA - Get supplies for ship"
            + "\nD - Move ship"
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
           case 'W': 
               this.moveShipUp();
               break;
           case 'S':
              this.moveShipDown();
               break;
           case 'A':
              this.moveShipLeft();
              break;
           case 'D':
               this.moveShipRight();
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
           String input = this.getInput().toUpperCase();
           selection = input.charAt(0);
           this.doAction(selection);        
       }while(selection != 'E');
    }

    private void moveShipUp() {
        System.out.println("Up");
    }

    private void moveShipDown() {
        System.out.println("Down");
    }

    private void moveShipLeft() {
        System.out.println("Left");
    }

    private void moveShipRight() {
        System.out.println("Right");
    }
}
