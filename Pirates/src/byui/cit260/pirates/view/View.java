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
              System.out.println("\n" + this.displayMessage);
              input = this.keyboard.readLine();
              input = input.trim();
              if (input.length() < 1){
                 System.out.println("*** You must enter a value ***");
                 continue;
               }
            break;
        }
        }catch(Exception e){
            System.out.println("\nError reading input: " + e.getMessage());
        }
       
        return input;
     }
     
        public int getInt(String prompt){
        int number = 0;
     
        try {
        while (number == 0 ){
            System.out.println(prompt + " Enter C to cancel");
            String value = this.keyboard.readLine(); 
            
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
        }catch(Exception e){
            System.out.println("\nError reading input: " + e.getMessage());
        }
        return number;
    }
     
       
                
}
