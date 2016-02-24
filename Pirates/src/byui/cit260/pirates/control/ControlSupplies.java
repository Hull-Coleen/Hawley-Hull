
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
    
    public int storage(int numFoodCrate, int crateFoodSize, int numAmmoCrate,
            int crateAmmoSize, int numRumCrate, int crateRumSize)
    {
        int totalStorage = 100;
        
        if (numFoodCrate < 1 || numAmmoCrate < 1 || numRumCrate < 1)
        {
            System.out.println("too small");
            return -1;
           
        }
        if (crateFoodSize < 1 || crateAmmoSize < 1 || crateRumSize < 1)
        {
            System.out.println("too small");
            return -1;
        }
            
        int storageSize = (numFoodCrate * crateFoodSize) + (numAmmoCrate * crateAmmoSize) + 
                (numRumCrate * crateRumSize);
        
        if (storageSize > totalStorage)
        {
        System.out.println("too big");
        return -1;
        }
        return storageSize;
    }

    public ControlSupplies() {
    }
}