/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.control.GameControl;
import byui.cit260.pirates.exception.ReportViewException;
import byui.cit260.pirates.model.Supply;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import pirates.Pirates;

/**
 *
 * @author Coleen
 */
public class ReportView {
    protected final BufferedReader keyboard = Pirates.getInFile();
    protected final PrintWriter console = Pirates.getOutFile();
    public void reportDisplay() {
       String fileName = null;
       this.console.println("Enter the file name: ");
        try {
            fileName = this.keyboard.readLine();
            throw new ReportViewException("File not found");
        } catch (Exception ex) {
            ErrorView.display("ReportView", ex.getMessage());
        }
       try(FileWriter writer = new FileWriter(fileName)){
           writer.write("\tSupply List\n");
           writer.write("SupplyType\t Supply Amount");
           
             Supply supply[] = GameControl.sortSupplies();
        // displays the type and amount of the supplies
        // here is the for each loop
        for (Supply supply1 : supply) {
            writer.write(supply1.getSupplyType());
            writer.write("\t\t\t");
            writer.write(supply1.getNumInStock());
            writer.write("\n");
        }
       
        writer.close();
        
        this.console.println("Report sucessfully entered into the file");
        throw new ReportViewException("Problem writing to file");
       }catch(Exception ex){
    ErrorView.display("ReportView", ex.getMessage());
}
}
 
    
    
    
    /*    public void display(){
          
          this.console.println("\tSupply List\n");
          this.console.println("SupplyType\t Supply Amount");
          
        // calls sort supply list
        Supply supply[] = GameControl.sortSupplies();
        // displays the type and amount of the supplies
        // here is the for each loop
        for (Supply supply1 : supply) {
            this.console.print(supply1.getSupplyType());
            this.console.print("\t\t\t");
            this.console.print(supply1.getNumInStock());
            this.console.println("");
        }
        
    
} */

}

