/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

/**
 *
 * @author Coleen
 */
public class Port {
    int numFood;
    int numAmmo;
    boolean friendlyNatives;

    public Port(int numFood, int numAmmo, boolean friendlyNatives) {
        this.numFood = numFood;
        this.numAmmo = numAmmo;
        this.friendlyNatives = friendlyNatives;
    }

    public Port() {
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

    public boolean isFriendlyNatives() {
        return friendlyNatives;
    }

    public void setFriendlyNatives(boolean friendlyNatives) {
        this.friendlyNatives = friendlyNatives;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + this.numFood;
        hash = 17 * hash + this.numAmmo;
        hash = 17 * hash + (this.friendlyNatives ? 1 : 0);
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
        final Port other = (Port) obj;
        if (this.numFood != other.numFood) {
            return false;
        }
        if (this.numAmmo != other.numAmmo) {
            return false;
        }
        if (this.friendlyNatives != other.friendlyNatives) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Port{" + "numFood=" + numFood + ", numAmmo=" + numAmmo + ", friendlyNatives=" + friendlyNatives + '}';
    }
    
    
}
