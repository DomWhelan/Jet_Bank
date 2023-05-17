package com.jetbanking.exceptions;

public class InvalidAccountTypeException extends Throwable {
    public InvalidAccountTypeException(){
        super("INVALID ACCOUNT TYPE, PLEASE RE-ENTER");
    }
}
