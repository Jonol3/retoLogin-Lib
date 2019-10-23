/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin.exceptions;

/**
 * Throws when there is a error connecting the socket to a full server.
 * @author Jon
 */
public class NoThreadAvailableException extends Exception {
    public NoThreadAvailableException (String message) {
        super(message);
    }
}
