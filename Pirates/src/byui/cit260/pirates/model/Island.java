/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

/**
 *
 * @author Thomas
 */
public class Island {
    boolean reef;
    boolean natives;
    boolean friendlyNatives;
    int numFood;

    public Island(boolean reef, boolean natives, boolean friendlyNatives, int numFood) {
        this.reef = reef;
        this.natives = natives;
        this.friendlyNatives = friendlyNatives;
        this.numFood = numFood;
    }

    public Island() {
        
    }
   

     public boolean isReef() {
        return reef;
    }

    public void setReef(boolean reef) {
        this.reef = reef;
    }

    public boolean isNatives() {
        return natives;
    }

    public void setNatives(boolean natives) {
        this.natives = natives;
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
        hash = 29 * hash + (this.reef ? 1 : 0);
        hash = 29 * hash + (this.natives ? 1 : 0);
        hash = 29 * hash + (this.friendlyNatives ? 1 : 0);
        hash = 29 * hash + this.numFood;
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
        final Island other = (Island) obj;
        if (this.reef != other.reef) {
            return false;
        }
        if (this.natives != other.natives) {
            return false;
        }
        if (this.friendlyNatives != other.friendlyNatives) {
            return false;
        }
        if (this.numFood != other.numFood) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Island{" + "reef=" + reef + ", natives=" + natives + ", friendlyNatives=" + friendlyNatives + ", numFood=" + numFood + '}';
    }
    
    
}
