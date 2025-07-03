package de.schlaukopf.uebung.metropolis.exceptions;

/**
 * Eine Checked Exception, die geworfen wird, wenn Superman sein Cape vergisst.
 */
public class CapeVergessenException extends Exception { // extends Exception for checked
    public CapeVergessenException(String message) {
        super(message);
    }
}
