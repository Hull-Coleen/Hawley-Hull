
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import byui.cit260.pirates.exception.ControlSuppliesException;
import byui.cit260.pirates.model.Supply;
import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlSupplies implements Serializable{
    public double getFood(int food) throws ControlSuppliesException{
        double storageSize = 20;
        double storageUsed = 0;
        if (food < 0 || food > 20) {
            throw new ControlSuppliesException("Invalid entry try again");
        }
        else
           storageUsed = food / storageSize;
      return storageUsed;  
    }
    public double getRum(int rum) throws ControlSuppliesException{
       double storageSize = 15;
        if (rum < 0 || rum > 15){
           throw new ControlSuppliesException("Invalid entry try again");
        }
        double storageUsed = rum / storageSize;
      return storageUsed;   
    }
    public double getAmmo(int ammo) throws ControlSuppliesException{
        double storageSize = 12;
        if (ammo < 0 || ammo > 12){
            throw new ControlSuppliesException("Invalid entry try again");
        }
       double storageUsed = ammo / storageSize;
      return storageUsed;
        
    }

    public ControlSupplies() {
    }
    public Supply getSupply(String supplyName, Supply[] supplies){
         for (Supply supply1 : supplies) {
            if(supply1.getSupplyType().equals(supplyName))
                return supply1;
         }
         return null;
    }
}
        
    
