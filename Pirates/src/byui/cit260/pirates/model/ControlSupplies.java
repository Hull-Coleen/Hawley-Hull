/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;

/**
 *
 * @author Coleen
 */
public class ControlSupplies implements Serializable{
    
    public int storage(int numFoodCrate, int crateFoodSize, int numAmmoCrate,
            int crateAmmoSize, int numRummCrate, int crateRummSize)
    {
        int totalStorage = 100;
        
        if (numFoodCrate < 1 || numAmmoCrate < 1 || numRummCrate < 1)
            System.out.println("too small");
        if (crateFoodSize < 1 || crateAmmoSize < 1 || crateRummSize < 1)
            System.out.println("too small");
            
        int storageSize = (numFoodCrate * crateFoodSize) + (numAmmoCrate * crateAmmoSize) + 
                (numRummCrate * crateRummSize);
        
        if (storageSize > totalStorage)
        System.out.println("too big");
        return storageSize;
    }

    public ControlSupplies() {
    }

    @Override
    public String toString() {
        return "ControlSupplies{" + '}';
    }
    
    
}
