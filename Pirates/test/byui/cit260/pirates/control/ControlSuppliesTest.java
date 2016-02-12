/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Coleen
 */
public class ControlSuppliesTest {
    
    public ControlSuppliesTest() {
    }

    /**
     * Test  1 of storage method, of class ControlSupplies.
     */
    @Test
    public void testStorage() {
        System.out.println("storage test");
        System.out.println("Test case # 1");
        int numFoodCrate = 33;
        int crateFoodSize = 1;
        int numAmmoCrate = 33;
        int crateAmmoSize = 1;
        int numRummCrate = 33;
        int crateRummSize = 1;
        ControlSupplies instance = new ControlSupplies();
        int expResult = 99;
        int result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);
        /*******************************************
         *  test 2
         */
       // System.out.println("storage test");
        System.out.println("Test case # 2");
        numFoodCrate = 16;
        crateFoodSize = 2;
        numAmmoCrate = 16;
        crateAmmoSize = 2;
        numRummCrate = 16;
        crateRummSize = 2;
        expResult = 96;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);
         /*******************************************
         *  test 3
         */
       // System.out.println("storage test");
        System.out.println("Test case # 3");
        numFoodCrate = 11;
        crateFoodSize = 0;
        numAmmoCrate = 11;
        crateAmmoSize = 0;
        numRummCrate = 11;
        crateRummSize = 0;
        expResult = -1;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);
        /*******************************************
         *  test 4
         */
       // System.out.println("storage test");
        System.out.println("Test case # 4");
        numFoodCrate = 11;
        crateFoodSize = 4;
        numAmmoCrate = 11;
        crateAmmoSize = 4;
        numRummCrate = 11;
        crateRummSize = 4;
        expResult = -1;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);
        
        /*******************************************
         *  test 5
         */
       // System.out.println("storage test");
        System.out.println("Test case # 5");
        numFoodCrate = 34;
        crateFoodSize = 1;
        numAmmoCrate = 34;
        crateAmmoSize = 1;
        numRummCrate = 34;
        crateRummSize = 1;
        expResult = -1;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);
        
          /*******************************************
         *  test 6
         */
       // System.out.println("storage test");
        System.out.println("Test case # 6");
        numFoodCrate = 17;
        crateFoodSize = 2;
        numAmmoCrate = 17;
        crateAmmoSize = 2;
        numRummCrate = 17;
        crateRummSize = 2;
        expResult = -1;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);       
        
         /*******************************************
         *  test 7
         */
       // System.out.println("storage test");
        System.out.println("Test case # 7");
        numFoodCrate = 12;
        crateFoodSize = 3;
        numAmmoCrate = 12;
        crateAmmoSize = 3;
        numRummCrate = 12;
        crateRummSize = 3;
        expResult = -1;
        result = instance.storage(numFoodCrate, crateFoodSize, numAmmoCrate, crateAmmoSize, numRummCrate, crateRummSize);
        assertEquals(expResult, result);       
        
        
        
    
        
     
    }
   
}
  
  

