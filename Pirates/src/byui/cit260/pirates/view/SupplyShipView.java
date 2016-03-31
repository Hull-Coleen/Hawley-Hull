/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.ControlShip;
import byui.cit260.pirates.control.ControlSupplies;
import byui.cit260.pirates.exception.ControlSuppliesException;
import byui.cit260.pirates.model.Game;
import byui.cit260.pirates.model.Supply;
import pirates.Pirates;


/**
 *
 * @author Coleen
 */
public class SupplyShipView extends View {
    
   
    public SupplyShipView() {
        super("This is where we fill the ship with supplies. You will"
            + "\nbe prompted for the number of crates for food, ammo, and rum."
            + "\nEnter F for food, R for rum, A for ammo, and E to exit ");
    
    }
    @Override
    public boolean doAction(String value){
        Game game = Pirates.getCurrentgame();
        value = value.toUpperCase();
        char selection;
        selection = value.charAt(0);
    

        ControlSupplies supply = new ControlSupplies();
        ControlShip ship = new ControlShip();
        
            if (selection == 'R'){
               
               int rum = getInt("How many crates of rum do you want?");
               // get the current number of stock
               
               double rumAmount = 0;
            try {
                rumAmount = supply.getRum(rum);
            } catch (ControlSuppliesException cse) {
                this.console.println(cse.getMessage());
                rum = 0;
            }
            int currentNumInStock = game.getSupplies()[Supply.rum.ordinal()].getNumInStock();
            if ((currentNumInStock + rum) >= 15)
                game.getSupplies()[Supply.rum.ordinal()].setNumInStock(15);
               // setting the supplies amount and adding the current num in stock
            else
                game.getSupplies()[Supply.rum.ordinal()].setNumInStock(rum + 
                  currentNumInStock);
            if (rumAmount > 0)
               this.console.println("Your rum is " + rumAmount + " percent full." );
            return false;
            }
            if (selection == 'F'){
                int food = getInt("How many crates of food do you want?");
                   // get the current number of stock
              
               
               double foodAmount = 0;
            try {
                foodAmount = supply.getFood(food);
            } catch (ControlSuppliesException cse) {
                this.console.println(cse.getMessage());
                food = 0;
            }
              int currentNumInStock = game.getSupplies()[Supply.food.ordinal()].getNumInStock();
               // setting the supplies amount and adding the current num in stock
              if ((currentNumInStock + food) >= 20)
                  game.getSupplies()[Supply.food.ordinal()].setNumInStock(20);
                  
              else
                 game.getSupplies()[Supply.food.ordinal()].setNumInStock(food + 
                  currentNumInStock);  
              //ship.setNumFoodCrate(food);
               if (foodAmount > 0)
                  this.console.println("Your food is " + foodAmount + " percent full." );
              return false;
            }
            if (selection == 'A'){
             //  fix like rum
               int ammo = getInt("How many crates of ammo do you want?");
                   // get the current number of stock
              
               double ammoAmount = 0;
            try {
                ammoAmount = supply.getAmmo(ammo);
            } catch (ControlSuppliesException cse) {
                this.console.println(cse.getMessage());
                ammo = 0;
            }
               int currentNumInStock = game.getSupplies()[Supply.ammo.ordinal()].getNumInStock();
               if ((currentNumInStock + ammo) >= 12)
                   game.getSupplies()[Supply.ammo.ordinal()].setNumInStock(12);
               // setting the supplies amount and adding the current num in stock
               else 
                   game.getSupplies()[Supply.ammo.ordinal()].setNumInStock(ammo + 
                    currentNumInStock);
               if (ammoAmount > 0)
                 this.console.println("Your ammo is " + ammoAmount + " percent full." );
               return false;
            }
            if (selection == 'E') 
                return true;
            else
            {
                this.console.println("Invalid entry: try again");
                return false;
            }
    }
 

}
