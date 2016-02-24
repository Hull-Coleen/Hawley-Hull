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
    public void supplyShip(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of food crates: ");
        int numFoodCrate = keyboard.nextInt();
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateFoodSize = keyboard.nextInt();
       System.out.println("Enter number of ammo crates: ");
       int numAmmoCrate = keyboard.nextInt();
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateAmmoSize = keyboard.nextInt();
       
        System.out.println("Enter number of rum crates: ");
        int numRumCrate = keyboard.nextInt();
 
       System.out.println("Enter size of rum crate between 1 and 3");
       int crateRumSize = keyboard.nextInt();
       ControlSupplies supplies = new ControlSupplies();
       supplies.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRumCrate, crateRumSize);
      // Now process the input information here...
       // int numFoodCrate, int crateFoodSize, int numAmmoCrate,
          //  int crateAmmoSize, int numRummCrate, int C
    }

    void displayMenu() {
        System.out.println("display supplyShip stubbed");
    }
    
}
