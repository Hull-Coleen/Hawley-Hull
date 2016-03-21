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
               int currentNumInStock = game.getSupplies()[Supply.rum.ordinal()].getNumInStock();
               // setting the supplies amount and adding the current num in stock
               game.getSupplies()[Supply.rum.ordinal()].setNumInStock(rum + 
                    currentNumInStock);
               double rumAmount = 0;
            try {
                rumAmount = supply.getRum(rum);
            } catch (ControlSuppliesException cse) {
                System.out.println(cse.getMessage());
            }
             
                  System.out.println("Your rum is " + rumAmount + " percent full." );
               return false;
            }
            if (selection == 'F'){
                int food = getInt("How many crates of food do you want?");
                   // get the current number of stock
               int currentNumInStock = game.getSupplies()[Supply.food.ordinal()].getNumInStock();
               // setting the supplies amount and adding the current num in stock
               game.getSupplies()[Supply.food.ordinal()].setNumInStock(food + 
                    currentNumInStock);
               
               double foodAmount = 0;
            try {
                foodAmount = supply.getFood(food);
            } catch (ControlSuppliesException cse) {
                System.out.println(cse.getMessage());
            }
               ship.setNumFoodCrate(food);
               if (foodAmount > 0)
                  System.out.println("Your food is " + foodAmount + " percent full." );
              return false;
            }
            if (selection == 'A'){
             // TODO: fix like rum
               int ammo = getInt("How many crates of ammo do you want?");
                   // get the current number of stock
               int currentNumInStock = game.getSupplies()[Supply.ammo.ordinal()].getNumInStock();
               // setting the supplies amount and adding the current num in stock
               game.getSupplies()[Supply.ammo.ordinal()].setNumInStock(ammo + 
                    currentNumInStock);
               double ammoAmount = 0;
            try {
                ammoAmount = supply.getAmmo(ammo);
            } catch (ControlSuppliesException cse) {
                System.out.println(cse.getMessage());
            }
               if (ammoAmount > 0)
                 System.out.println("Your ammo is " + ammoAmount + " percent full." );
               return false;
            }
            if (selection == 'E') 
                return true;
            else
            {
                System.out.println("Invalid entry: try again");
                return false;
            }
    }
    // TODO: move to view class
  /*  public int getInt(String prompt){
        int number = 0;
        
         Scanner keyboard = new Scanner(System.in);
     
        
        while (number == 0 ){
            System.out.println(prompt + " Enter C to cancel");
            String value =keyboard.nextLine(); 
            
            value = value.trim().toUpperCase();
            if (value == "C")
                return 0;
            try {
            number = Integer.parseInt(value);
            } catch (NumberFormatException nf){
                System.out.println(nf.getMessage() + " Invalid entry: Try again.");
                number = 0;
            }
            
        }
        return number;
    }
    */

}
