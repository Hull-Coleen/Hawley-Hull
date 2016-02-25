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
public class moveView implements Serializable{
     private final String MOVEMENU = "\n"          
            + "\n-------------------------------"
            + "\n       Game Start Menu         "
            + "\n-------------------------------"
            + "\nW - Move up"
            + "\nS - Move down"
            + "\nA - Move left"
            + "\nD - Move right"
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
           case 'G':
              this.moveShipLeft();
              break;
           case 'M':
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
           System.out.println(MOVEMENU);
           String input = this.getInput().toUpperCase();
           selection = input.charAt(0);
           this.doAction(selection);        
       }while(selection != 'E');
    }
    private void moveShipUp() {
        System.out.println("Move ship up stubbed");
        
    }

    private void moveShipDown() {
       System.out.println("Move ship down stubbed");
    }

    private void moveShipLeft() {
        System.out.println("Move ship left stubbed");
        
    }

    private void moveShipRight() {
    System.out.println("Move ship right stubbed");   
    }
}