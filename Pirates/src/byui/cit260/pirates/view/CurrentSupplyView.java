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
public class CurrentSupplyView implements Serializable{
    private final String SUPPLYMENU = "\n"          
            + "\n-------------------------------"
            + "\n       Game Start Menu         "
            + "\n-------------------------------"
            + "\nF - Show Days of Food"
            + "\nA - Show Ammo"
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
            valid = true;
        }
      
        return input;
    }
    
    private void doAction(char selection) {
       switch(selection){
           case 'F': 
               this.showFood();
               break;
           case 'A':
              this.showAmmo();
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
           System.out.println(SUPPLYMENU);
           String input = this.getInput().toUpperCase();
           selection = input.charAt(0);
           this.doAction(selection);        
       }while(selection != 'E');
    }
    private void showFood() {
        System.out.println("days of food");
        //byui.cit260.pirates.control.ControlShip food = new byui.cit260.pirates.control.ControlShip();
        //food.daysOfFood();
        
    }
    
    private void showAmmo() {
        System.out.println("Ammo Left");
        
    }
    
}
