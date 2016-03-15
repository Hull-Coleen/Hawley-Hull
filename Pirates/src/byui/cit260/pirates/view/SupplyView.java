/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.model.Supplies;

/**
 *
 * @author Coleen
 */
public class SupplyView {
      public static void display(){
        // calls sort supply list
        Supplies supply[] = GameControl.sortSupplies();
        // displays the type and amount of the supplies
        // here is the for each loop
        for (Supplies supply1 : supply) {
            System.out.print(supply1.getSupplyType());
            System.out.print("  ");
            System.out.print(supply1.getNumInStock());
            System.out.println("");
        }
        
    }
    
}
