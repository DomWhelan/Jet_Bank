package com.jetbanking.exceptions;

public class OverdrawnException extends Throwable {
    public OverdrawnException(){
        super("INSUFFICIENT FUNDS, ACCOUNT OVERDRAWN");
    }
}
