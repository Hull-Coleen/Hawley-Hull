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
public class AvatarView extends View {
    Avatar[] names = Avatar.values();
    public AvatarView() {
        super("Navy or Pirate type N for Navy or P for Pirate: ");
      //  Avatar[] names = Avatar.values();
        for (Avatar name : names)
            System.out.println(name);
    }
    
    public boolean doAction(String value){
       //Avatar avatar = new Avatar();
        
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
       Scanner keyboard = new Scanner(System.in);
       String choice;
       char charChoice;
       //int avatar;
       switch(selection){    
          case 'N':
              System.out.println("Enter B for boy or G for Girl");
              choice = keyboard.nextLine();
              choice = choice.trim();
                      
              charChoice = choice.charAt(0);
              if (charChoice == 'B'){
                  //avatar = 3;
                  System.out.println("you chose " + names[3]);
              }
              else{
                  System.out.println("you chose " + names[2]);
              }
              return true;
              
          case 'P':
            System.out.println("Enter B for boy or G for Girl");
              choice = keyboard.nextLine();
              choice = choice.trim();
                      
              charChoice = choice.charAt(0);
              if (charChoice == 'B'){
                  //avatar = 3;
                  System.out.println("you chose " + names[1]);
              }
              else{
                  System.out.println("you chose " + names[0]);
              }
              return true;
         
          default:
              System.out.println("invalid entry");
      }
        return false;
    }

}
