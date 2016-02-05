/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Coleen
 */
public class Supplies implements Serializable{
    private int numFood;
    private int numAmmo;
    private int numRum;
    private String suppleType;

    public Supplies() {
    }

    public Supplies(int numFood, int numAmmo, int numRum, String suppleType) {
        this.numFood = numFood;
        this.numAmmo = numAmmo;
        this.numRum = numRum;
        this.suppleType = suppleType;
    }

    public int getNumFood() {
        return numFood;
    }

    public void setNumFood(int numFood) {
        this.numFood = numFood;
    }

    public int getNumAmmo() {
        return numAmmo;
    }

    public void setNumAmmo(int numAmmo) {
        this.numAmmo = numAmmo;
    }

    public int getNumRum() {
        return numRum;
    }

    public void setNumRum(int numRum) {
        this.numRum = numRum;
    }

    public String getSuppleType() {
        return suppleType;
    }

    public void setSuppleType(String suppleType) {
        this.suppleType = suppleType;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.numFood;
        hash = 61 * hash + this.numAmmo;
        hash = 61 * hash + this.numRum;
        hash = 61 * hash + Objects.hashCode(this.suppleType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Supplies other = (Supplies) obj;
        if (this.numFood != other.numFood) {
            return false;
        }
        if (this.numAmmo != other.numAmmo) {
            return false;
        }
        if (this.numRum != other.numRum) {
            return false;
        }
        if (!Objects.equals(this.suppleType, other.suppleType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Supplies{" + "numFood=" + numFood + ", numAmmo=" + numAmmo + ", numRum=" + numRum + ", suppleType=" + suppleType + '}';
    }
    
    
}
