/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;

import byui.cit260.pirates.model.Avatar;

/**
 *
 * @author Coleen
 */
public class AvatarView extends View {

    public AvatarView() {
        super("Navy or Pirate type N for Navy or P for Pirate: ");
    }
    
    public boolean doAction(String value){
       Avatar avatar = new Avatar();
       value = value.toUpperCase();
       char selection;
       selection = value.charAt(0); 
      switch(selection){    
          case 'N':
             avatar.setPirate(false);
             System.out.println("Navy");
              return true;
              
          case 'P':
             avatar.setPirate(true);
             System.out.println("Pirate");
              return true;
         
          default:
              System.out.println("invalid entry");
      }
        return false;
    }
  /*  public void display(){
        
        boolean choice = this.doAction(value);
        if (choice){
            System.out.println("You chose to be a pirate");
        }
        else
            System.out.println("You chose to be in the Navy");
        
    } */
  
    
}
