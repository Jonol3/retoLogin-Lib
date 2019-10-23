/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin.exceptions;

/**
 * Throws when the username does not exist during the login process.
 * @author Jon
 */
public class BadLoginException extends Exception {
    public BadLoginException (String message) {
        super(message);
    }
}
