package com.jetbanking.banking;
import com.jetbanking.date.MyDate;
import com.jetbanking.exceptions.InvalidAccountTypeException;
import com.jetbanking.people.Customer;

import java.util.ArrayList;
import java.util.Arrays;

public class Account {

    private int id;
    private String type;
    private final ArrayList<String> validTypes = new ArrayList<>(Arrays.asList("SAVINGS","CHECKING","MMA","CD","IRA","BROKERAGE"));
    //  MMA - Money Market Account, CD - Certificate of Deposit, IRA - Individual Retirement Arrangement
    private double balance = 0;
    private Customer owner;
    private final String creationDate = new MyDate().getDateNow();

    private String status;

    public Account(){}

    public Account(int id, String type, Customer owner) throws InvalidAccountTypeException {
        this.setId(id);
        this.setType(type);
        this.setOwner(owner);
    }

    public Account(int id, String type, double balance, Customer owner) throws InvalidAccountTypeException {
        this.setId(id);
        this.setType(type);
        this.setBalance(balance);
        this.setOwner(owner);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {

        return type;
    }

    public void setType(String type) throws InvalidAccountTypeException {
        if(validTypes.contains(type.toUpperCase())){
            this.type = type.toUpperCase();}
        else {
            throw new InvalidAccountTypeException();
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public String getCreationDate() {
        return creationDate;
    }
//
//    public void setCreationDate(String creationDate) {
//        this.creationDate = creationDate;
//    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
