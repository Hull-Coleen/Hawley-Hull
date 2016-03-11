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

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private int row;
    private Location[][] locations;
    private String name;
    private String description;
    public Map() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
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
        Map map = new Map(3, 3);
        Scene[] scenes = Scene.createScenes();
        GameControl.assignScenesToLoactions(map, scenes);
        return map;
    }

  /*  public void display(Location[][] locations) {
        
        
        String menu = ""
            + "\n***********************************************************************"
            + "\n" 
            + "\n***********************************************************************";
            
            System.out.println(menu);
        
        for (int row =0; row < locations.length; row ++) {
            System.out.print( locations + " | ");
            // Add header
            /*for (Map location : getLocations()[row]  ) {
                System.out.print("|```````````````|");
            }
            System.out.println("");  // go to next line of row
            /** Put row,col information in the map
            for(int col = 0; col < map.getLocations()[row].length; col++) {
            System.out.print("|===== " + row + "," + col + " =====|");
            }
            System.out.println(""); // Go to next liine
             **/
           /* for (Location location : locations) {
                // We have 16 spaces to work with
                int nameLength = locations.length;
                int spaces = 15 - nameLength;
                
                System.out.print("|");
                
                // Left Pad the name
                if(spaces > 0) {
                    for(int i = 0;i < spaces/2; i++) {
                        System.out.print(" ");
                    }
                }
                
                // Display location name
                System.out.print(location.getName());
                
                // Right Pad
                if(spaces > 0) {
                    for(int i = 0;i < spaces/2; i++) {
                        System.out.print(" ");
                    }
                }
                System.out.print("|");
            }
            System.out.println("");
            for (int col = 0; col < location1.length; col++) {
                System.out.print("|***************|");
            }
            /**
            System.out.println("");
            for (Location location : map.getLocations()[row]) {
            if(location == this.mapcontroller.getGameController().getGameModel().getCurrentLocationModel()) {
            System.out.print("|__You're Here__|");
            } else if (location.getVisited() == true) {
            System.out.print("|____Visited____|");
            } else {
            System.out.print("|__Not Visited__|");
            }
            }**/
            /*System.out.println("");
            for (int col = 0; col < location1.length; col++) {
                System.out.print("|***************|");
            }
            System.out.println("");
        }*/

    public String getName() {
       return name;
    }

    public String getDescription() {
        return description;
    }
       

}
 

