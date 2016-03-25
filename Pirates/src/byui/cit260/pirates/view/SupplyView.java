/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.model.Supply;
import java.io.BufferedReader;
import java.io.PrintWriter;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class SupplyView {
    protected final BufferedReader keyboard = Pirates.getInFile();
    protected final PrintWriter console = Pirates.getOutFile();
      public static void display(){
        // calls sort supply list
        Supply supply[] = GameControl.sortSupplies();
        // displays the type and amount of the supplies
        // here is the for each loop
        for (Supply supply1 : supply) {
            System.out.print(supply1.getSupplyType());
            System.out.print("  ");
            System.out.print(supply1.getNumInStock());
            System.out.println("");
        }
        
    }
    
}
