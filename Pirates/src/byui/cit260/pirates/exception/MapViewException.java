/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.exception;

/**
 *
 * @author hawle_000
 */
public class MapViewException extends Exception{

    public MapViewException() {
    }

    public MapViewException(String string) {
        super(string);
    }

    public MapViewException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public MapViewException(Throwable thrwbl) {
        super(thrwbl);
    }

    public MapViewException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
