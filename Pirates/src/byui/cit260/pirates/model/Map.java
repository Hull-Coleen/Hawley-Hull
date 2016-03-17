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

  
    private int col;
    private int row;
    private Location[][] locations;
    public String name;
    private String description;
    private Scene scene;
    
     public Map() {
  
    }
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
    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }
  
   
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }


    public int getCol() {
        return col;
    }

    public void setDescription(String description) {
        this.description = description;
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


    public String getName() {
        return name;
    }

    public void setName(String name) {    
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getNoRows() {
        return 0;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNoOfCol() {
        return 0;
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

}
 

