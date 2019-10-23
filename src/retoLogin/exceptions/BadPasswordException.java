/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retoLogin.exceptions;

/**
 * Throws when the password is wrong during the login process.
 * @author Jon
 */
public class BadPasswordException extends Exception {
    public BadPasswordException (String message) {
        super(message);
    }
}
