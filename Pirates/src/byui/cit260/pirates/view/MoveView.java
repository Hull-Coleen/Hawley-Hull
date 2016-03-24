/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.view;


import byui.cit260.pirates.model.Location;
import byui.cit260.pirates.model.Map;
import java.io.Serializable;
import java.util.Scanner;


public class MoveView implements Serializable{
    
    
    public MoveView() {
        //super();
    }
    
    public boolean doAction(Map map){
        
        Scanner keyboard = new Scanner(System.in);
        //Location location = map.setCurrentLocation(locations[0][0]);
        System.out.println("Where do you want to go, enter row and col, between 0 - 4");
        MapView mapview = new MapView();
        mapview.display(map);
        //Game game = Pirates.getCurrentgame();
        int row = -1;
        while(row < 0 || row > 4)
        {
        System.out.println("enter row");
        //row = this.getInt(value);
        row = keyboard.nextInt();
        }
        
        int col = -1; 
        while(col < 0 || col > 4)
        {
        System.out.println("enter col");
        col = keyboard.nextInt();
        }
        Location[][] location = null;
        
        map.setCurrentLocation(location[row][col]);
        //game.getMap().setCurrentLocation(location[row][col]);
    return true;
    }
 
}
    
 
