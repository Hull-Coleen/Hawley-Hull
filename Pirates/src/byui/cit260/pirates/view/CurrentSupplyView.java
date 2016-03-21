/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.ControlShip;
import byui.cit260.pirates.exception.ControlShipException;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Supply;
import java.io.Serializable;
import pirates.Pirates;


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
            + "\nR - Show Rum"
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
           case 'R':
               this.showRum();
               break;
           case 'E': 
                return true;
           default:
               System.out.println("Invalid Entry");
               break;
       }
       return false;
    }
  
    public void showFood() {
        ControlShip ship = new ControlShip();
        ship.setNumFoodCrate(30);
        //ship.setNumCrew(6);
        try
        {
          System.out.println( ship.daysOfFood(ship.getNumFoodCrate(), ship.getNumCrew()));
        }
        catch(ControlShipException cs)
        {
            System.out.println(cs.getMessage());
        }
  
    }
    
    public void showAmmo() {
        Game game = Pirates.getCurrentgame();
        ControlShip ship = new ControlShip();
        try
        {
             ship.checkAmmo(game.getSupplies()[Supply.ammo.ordinal()].getNumInStock(), 6);
        }
        catch(ControlShipException cs)
        {
            System.out.println(cs.getMessage());
        }
        
    }

    public void showRum() {
      
    }
    
}
