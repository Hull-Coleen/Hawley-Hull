/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Avatar;
import java.util.Scanner;

/**
 *
 * @author Coleen
 */
public class AvatarView {
    public String getInput(){
        Scanner keyboard = new Scanner(System.in);
        boolean valid = false;
        String selection = null;
        while (!valid){
            selection = keyboard.nextLine();
            selection = selection.trim();
            if (selection.length() < 1){
                System.out.println("Invalid entry: try again");
                continue;
            }
            valid = true;
                
        }
        return selection;
    }
    public void doAction(char selection){
        Avatar avatar = new Avatar();
       
      switch(selection){    
          case 'N':
              avatar.setPirate(false);
              System.out.println("Navy");
              break;
          case 'P':
              avatar.setPirate(true);
              System.out.println("Pirate");
              break;
          case 'E':
              return;
          default:
              System.out.println("invalid entry");
      }
        
    }
    public void pickAvatar(){
        System.out.println("Navy or Pirate type N for Navy or P for Pirate: ");
        char selection = ' ' ;
        do {
           String input = getInput();
           selection = input.charAt(0);
           this.doAction(selection);
        }while (selection != 'E');
       
    }
    
}
