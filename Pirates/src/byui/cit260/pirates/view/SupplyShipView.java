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
            + "\nbe prompted for the number of crates for food, ammo, and rum."
            + "\nEnter F for food, R for rum, A for ammo, and E to exit ");
    }
    @Override
    public boolean doAction(String value){
        value = value.toUpperCase();
        char selection;
        selection = value.charAt(0);

        Scanner keyboard = new Scanner(System.in);
        String input = null;
        ControlSupplies supply = new ControlSupplies();
  
            if (selection == 'R'){
               System.out.println("how many crates of rum do you want");
               int rum = keyboard.nextInt();
               double rumAmount = supply.getFood(rum);
               if (rumAmount > 0)
                  System.out.println("Your rum is " + rumAmount + " percent full." );
               return false;
            }
            if (selection == 'F'){
               System.out.println("how many crates of food do you want");
               int food = keyboard.nextInt();
               double foodAmount = supply.getFood(food);
               if (foodAmount > 0)
                  System.out.println("Your food is " + foodAmount + " percent full." );
              return false;
            }
            if (selection == 'A'){
               System.out.println("how many crates of ammo do you want");
               int ammo = keyboard.nextInt();
               double ammoAmount = supply.getFood(ammo);
               if (ammoAmount > 0)
                 System.out.println("Your ammo is " + ammoAmount + " percent full." );
               return false;
            }
            else 
                return true;
    }

}
