/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.ControlSupplies;
import java.util.Scanner;

/**
 *
 * @author Coleen
 */
public class SupplyShipView {
    private final String MENU = "This is where we fill the ship with supplies. You will"
            + " be prompted for the number of crates for food, ammo, and rum. Then you"
            + "will be prompted for the size of the crate to put the items in.";
      private int getInput() {
        boolean valid = false;
        int input = 0;
        Scanner keyboard = new Scanner(System.in);
    
        while(!valid){
            input = keyboard.nextInt();
           
            if (input < 1){
            System.out.println("Invalid name: must not be empty");
            continue;
            }
            //break;
            valid = true;
        }
      
        return input;
    }
    public boolean doNumCrate(int selection){
        if (selection < 1 || selection > 16){
            return false;
        }
        return true;
    }
    public boolean doCrateSize(int selection){
        if (selection < 1 || selection > 3){
            return false;
        }
        return true; 
    }
    public void supplyShip(){
      int ship;
      //System.out.println(MENU);  
      do{
        System.out.println(MENU);  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of food crates: ");
        int numFoodCrate = getInput();
        while (!doNumCrate(numFoodCrate)){
            System.out.println("Enter number of food crates: ");
            numFoodCrate =  getInput();   

        }
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateFoodSize = getInput();
       while (!doCrateSize(crateFoodSize)){
          System.out.println("Enter size of food crate between 1 and 3");
          crateFoodSize = getInput(); 
       }
       System.out.println("Enter number of ammo crates: ");
       int numAmmoCrate = getInput();
       while (!doNumCrate(numAmmoCrate)){
            System.out.println("Enter number of ammo crates: ");
            numAmmoCrate = getInput();
        }
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateAmmoSize = getInput();
       while (!doCrateSize(crateAmmoSize)){
          System.out.println("Enter size of ammo crate between 1 and 3");
          crateAmmoSize = getInput(); 
       }
        System.out.println("Enter number of rum crates: ");
        int numRumCrate = getInput();
        while (!doNumCrate(numRumCrate)){
            System.out.println("Enter number of rum crates: ");
            numRumCrate = getInput();
        }
 
       System.out.println("Enter size of rum crate between 1 and 3");
       int crateRumSize = getInput();
       while (!doCrateSize(crateRumSize)){
          System.out.println("Enter size of rum crate between 1 and 3");
          crateRumSize = getInput(); 
       }
     
    
    
        ControlSupplies supplies = new ControlSupplies();
        ship = supplies.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRumCrate, crateRumSize);
      }while (ship < 1);
    } 

   
    
}


