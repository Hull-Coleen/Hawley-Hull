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
public class SupplyShipView extends View {

   
    public SupplyShipView() {
        super("This is where we fill the ship with supplies. You will"
            + " be prompted for the number of crates for food, ammo, and rum. Then you"
            + "will be prompted for the size of the crate to put the items in.");
    }
    @Override
    public boolean doAction(String value){
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0);
       switch(selection){
           case 'R':
               break;
           case 'A':
               break;
           case 'F':
               break;
           case 'E':
               return true;
               default:
                   System.out.println("Invalid entry: Try again");
       }
        
        return false;
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
    //public void display(){
   // System.out.println("working on this");
  //}
 
    /*   System.out.println("Enter size of food crate between 1 and 3");
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
    } */

   
    
}


