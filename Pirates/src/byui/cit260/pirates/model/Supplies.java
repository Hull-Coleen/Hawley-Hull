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
public class Supplies implements Serializable{
  
    private String supplyType;
    private int numInStock;
    private int numRequired;

    public Supplies() {
    }
    
    public Supplies(String supplyType, int numInStock, int numRequired)
    {
        this.supplyType = supplyType;
        this.numInStock = numInStock;
        this.numRequired = numRequired;
    }
    
    public void setSupplyType(String supplyType)
    {
        this.supplyType = supplyType;
    }
    
    public void setNumInStock(int numInStock)
    {
        this.numInStock = numInStock;
    }
    
    public void setNumRequired(int numRequired)
    {
        this.numRequired = numRequired;
    }

    public String getSupplyType()
    {
        return supplyType;
    }
    
    public int getNumInStock()
    {
        return numInStock;
    }
    
    public int getNumRequired()
    {
        return numRequired;
    }
 
}
