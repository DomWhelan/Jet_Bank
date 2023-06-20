package com.jetbanking.banking;
import com.jetbanking.date.MyDate;
import com.jetbanking.exceptions.InvalidAccountTypeException;
import com.jetbanking.exceptions.OverdrawnException;
import com.jetbanking.people.Client;

import java.util.ArrayList;
import java.util.Arrays;

public class Account {

    private int id;
    private String type;
    private final ArrayList<String> validTypes = new ArrayList<>(Arrays.asList("SAVINGS","CHECKING","MMA","CD","IRA","BROKERAGE"));
    //  MMA - Money Market Account, CD - Certificate of Deposit, IRA - Individual Retirement Arrangement
    private double balance = 0;
    private Client owner;
    private final String creationDate = new MyDate().getDateNow();

    private String status;

    public Account(){}

    public Account(int id, String type, Client owner) throws InvalidAccountTypeException {
        this.setId(id);
        this.setType(type);
        this.setOwner(owner);
    }

    public Account(int id, String type, double balance, Client owner) throws InvalidAccountTypeException {
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

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double withdraw(double amount) throws OverdrawnException {
        balance = this.getBalance();
        if(amount <= balance){
            balance -= amount;
            this.setBalance(balance);
        } else {
            throw new OverdrawnException();
        }
        return this.balance;
    }
}
