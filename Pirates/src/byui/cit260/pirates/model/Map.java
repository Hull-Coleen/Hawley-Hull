/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.model;

import byui.cit260.pirates.control.GameControl;
import java.io.Serializable;

/**
 *
 * @author Thomas
 */
public class Map implements Serializable{

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    private int col;
    private int row;
    private Location[][] locations;
    public Map(int row, int col) {
        if ( row < 1 || col < 1){
            System.out.println("The number of rows and columns must be more the les than one, ");
            return;
        }
        
        this.col = col;
        this.row = row;
        this.locations = new Location[row][col];
        for (int iRow = 0; iRow < row; iRow++){
            for (int iCol = 0; iCol < col; iCol++){
                Location location = new Location();
                location.setCol(iCol);
                location.setRow(iRow);
                location.setVisited(false);
                locations[iRow][iCol] = location;
                
            }
        }
    }

    public Map() {
    }
    
    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
    private static Map createMap() {
        Map map = new Map(20, 20);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLoactions(map, scenes);
        return map;
    }
   /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.col;
        hash = 53 * hash + this.row;
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
        final Map other = (Map) obj;
        if (this.col != other.col) {
            return false;
        }
        if (this.row != other.row) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "col=" + col + ", row=" + row + '}';
    } */
    
}
