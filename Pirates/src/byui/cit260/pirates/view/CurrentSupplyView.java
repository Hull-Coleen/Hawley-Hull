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
public class CurrentSupplyView extends View implements Serializable{

    public CurrentSupplyView() {
        super("\n-------------------------------"
            + "\n       Supply  Menu            "
            + "\n-------------------------------"
            + "\nF - Show Days of Food"
            + "\nA - Show Ammo"
            + "\nE - Exit"
            + "\n--------------------------------");
    }
  
    @Override
    public boolean doAction(String value) {
    value = value.toUpperCase();
    char selection;
     selection = value.charAt(0); 
       switch(selection){
           case 'F': 
               this.showFood();
               break;
           case 'A':
              this.showAmmo();
               break;
           case 'E': 
                return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
  
    private void showFood() {
        System.out.println("days of food");
  
    }
    
    private void showAmmo() {
        System.out.println("Ammo Left");
        
    }
    
}
