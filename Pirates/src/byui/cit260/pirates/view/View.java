/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import java.util.Scanner;



public abstract class View implements ViewInterface {

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
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String input = null;
        while(!valid){
            System.out.println("\n" + this.displayMessage);
            input = keyboard.nextLine();
            input = input.trim();
            if (input.length() < 1){
            System.out.println("*** You must enter a value ***");
            continue;
            }
            break;
        } 
        return input;
     }
     
       
                
}
