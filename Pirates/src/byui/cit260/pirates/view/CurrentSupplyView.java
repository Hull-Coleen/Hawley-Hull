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
               this.console.println("Invalid Entry");
               break;
       }
       return false;
    }
  
    public void showFood() {
        ControlShip ship = new ControlShip();
        Game game = Pirates.getCurrentgame();
        //ship.setNumFoodCrate(30);
        //ship.setNumCrew(6);
        int currentNumInStock = game.getSupplies()[Supply.food.ordinal()].getNumInStock();
        //try
        //{
        //  this.console.println( ship.daysOfFood(currentNumInStock, ship.getNumCrew()));
        //}
        //catch(ControlShipException cs)
        //{
         //   this.console.println(cs.getMessage());
        //}
        this.console.println(currentNumInStock);
  
    }
    
    public void showAmmo() {
        Game game = Pirates.getCurrentgame();
        ControlShip ship = new ControlShip();
        int currentNumInStock = game.getSupplies()[Supply.ammo.ordinal()].getNumInStock();
        /*try
        {
             ship.checkAmmo(currentNumInStock, ship.getNumCannon());
        }
        catch(ControlShipException cs)
        {
            this.console.println(cs.getMessage());
        } */
        this.console.println(currentNumInStock);
        
        
    }

    public void showRum() {
         Game game = Pirates.getCurrentgame();
        ControlShip ship = new ControlShip();
        int currentNumInStock = game.getSupplies()[Supply.rum.ordinal()].getNumInStock();
        /*try
        {
             ship.checkRum(currentNumInStock);
        }
        catch(ControlShipException cs)
        {
            this.console.println(cs.getMessage());
        } */
        
      this.console.println(currentNumInStock);
    }
    
}
