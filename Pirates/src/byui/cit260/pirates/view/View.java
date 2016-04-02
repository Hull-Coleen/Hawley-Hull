/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import pirates.Pirates;



public abstract class View implements ViewInterface {

    private String message;
    protected final BufferedReader keyboard = Pirates.getInFile();
    protected final PrintWriter console = Pirates.getOutFile();
    
    public View(){
    }
    
    protected String displayMessage;
 

        public View(String displayMessage) {
            this.displayMessage = displayMessage;
        }

    /**
     *
     */
    @Override
    public void display() {
        
       boolean done = false;
       do {
              String value = this.getInput();
              if (value.toUpperCase().equals("Q"))
                  return;
              done = this.doAction(value);
       }while(!done);
    }
 @Override
     public String getInput() {
       
        boolean valid = false;
        String input = null;
        try {
           while(!valid){
              this.console.println("\n" + this.displayMessage);
              input = this.keyboard.readLine();
              input = input.trim();
              if (input.length() < 1){
                  ErrorView.display(this.getClass().getName(),
                          "*** You must enter a value ***" );
                 continue;
               }
            break;
        }
        }catch(Exception e){
            ErrorView.display(this.getClass().getName(),
                    "\nError reading input: " + e.getMessage());
        }
       
        return input;
     }
     
        public int getInt(String prompt){
        int number = -1;
     
        try {
        while (number < 0 ){
            this.console.println(prompt + " Enter C to cancel");
            String value = this.keyboard.readLine(); 
            
            value = value.trim().toUpperCase();
            if (value == "C")
                return -1;
            try {
            number = Integer.parseInt(value);
            } catch (NumberFormatException nf){
                this.console.println(nf.getMessage() + " Invalid entry: Try again.");
                number = -1;
            }
            
        }
        }catch(Exception e){
            this.console.println("\nError reading input: " + e.getMessage());
        }
        return number;
    }
     
       
                
}
