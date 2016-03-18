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
public enum Supply implements Serializable {
    food,
    rum,
    ammo;
    
    private String supplyType;
    private int numRequired;
    private int numInStock;

    private Supply() {
    }

    private Supply(String supplyType, int numRequired, int numInStock) {
        this.supplyType = supplyType;
        this.numRequired = numRequired;
        this.numInStock = numInStock;
    }
    
    

    public String getSupplyType() {
        return supplyType;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }
  

    public int getNumRequired() {
        return numRequired;
    }

    public void setNumRequired(int numRequired) {
        this.numRequired = numRequired;
    }

    public int getNumInStock() {
        return numInStock;
    }

    public void setNumInStock(int numInStock) {
        this.numInStock = numInStock;
    }

    @Override
    public String toString() {
        return "Supply{" + "supplyType=" + supplyType + ", numRequired=" + numRequired + ", numInStock=" + numInStock + '}';
    }
    
    
  
}
