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
      int ship;
        
      do{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of food crates: ");
        int numFoodCrate = keyboard.nextInt();
        while (numFoodCrate < 1 || numFoodCrate > 16){
            System.out.println("Enter number of food crates: ");
            numFoodCrate = keyboard.nextInt();
        }
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateFoodSize = keyboard.nextInt();
       while (crateFoodSize < 1 || crateFoodSize > 3){
          System.out.println("Enter size of food crate between 1 and 3");
          crateFoodSize = keyboard.nextInt(); 
       }
       System.out.println("Enter number of ammo crates: ");
       int numAmmoCrate = keyboard.nextInt();
       while (numAmmoCrate < 1 || numAmmoCrate > 16){
            System.out.println("Enter number of ammo crates: ");
            numAmmoCrate = keyboard.nextInt();
        }
 
       System.out.println("Enter size of food crate between 1 and 3");
       int crateAmmoSize = keyboard.nextInt();
       while (crateAmmoSize < 1 || crateAmmoSize > 3){
          System.out.println("Enter size of ammo crate between 1 and 3");
          crateAmmoSize = keyboard.nextInt(); 
       }
        System.out.println("Enter number of rum crates: ");
        int numRumCrate = keyboard.nextInt();
        while (numRumCrate < 1 || numRumCrate > 16){
            System.out.println("Enter number of rum crates: ");
            numRumCrate = keyboard.nextInt();
        }
 
       System.out.println("Enter size of rum crate between 1 and 3");
       int crateRumSize = keyboard.nextInt();
       while (crateRumSize < 1 || crateRumSize > 3){
          System.out.println("Enter size of rum crate between 1 and 3");
          crateRumSize = keyboard.nextInt(); 
       }
     
    
    
        ControlSupplies supplies = new ControlSupplies();
        ship = supplies.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRumCrate, crateRumSize);
      }while (ship < 1);
    } 
    
}


