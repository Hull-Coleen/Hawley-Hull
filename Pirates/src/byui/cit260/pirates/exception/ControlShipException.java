/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pirates.exception;

/**
 *
 * @author Coleen
 */
public class ControlShipException extends Exception {

    public ControlShipException() {
    }

    public ControlShipException(String message) {
        super(message);
    }

    public ControlShipException(String message, Throwable cause) {
        super(message, cause);
    }

    public ControlShipException(Throwable cause) {
        super(cause);
    }

    public ControlShipException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
