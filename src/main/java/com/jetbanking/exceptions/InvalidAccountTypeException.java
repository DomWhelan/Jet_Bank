package com.jetbanking.exceptions;

public class InvalidAccountTypeException extends Throwable {
    public InvalidAccountTypeException(){
        super("Invalid Account Type - ");
    }
}
