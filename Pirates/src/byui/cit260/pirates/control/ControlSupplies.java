
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlSupplies implements Serializable{
    public double getFood(int food){
        double storageSize = 30;
        double storageUsed = 0;
        if (food < 0 || food > 30) {
            System.out.println("Invalid entry: try again"); 
            return -1;
        }
        else
           storageUsed = food / storageSize;
      return storageUsed;  
    }
    public double getRum(int rum){
       double storageSize = 30;
        if (rum < 0 || rum > 30){
           System.out.println("Invalid entry: try again"); 
           return -1;
        }
        double storageUsed = rum / storageSize;
      return storageUsed;   
    }
    public double getAmmo(int ammo){
        double storageSize = 30;
        if (ammo < 0 || ammo > 30){
           System.out.println("Invalid entry: try again"); 
           return -1;
        }
       double storageUsed = ammo / storageSize;
      return storageUsed;
        
    }

    public ControlSupplies() {
    }
}