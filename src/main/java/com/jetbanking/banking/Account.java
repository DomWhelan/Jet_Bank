package com.jetbanking.banking;
import com.jetbanking.date.Date;
import com.jetbanking.people.Customer;
import java.time.LocalDate;

public class Account {

    private int id;
    private String type;
    private double balance;
    private Customer owner;
    private String creationDate;

    private String status;

    public Account(int id, String type, Customer owner) {
        this.id = id;
        this.type = type;
        this.balance = 0;
        this.owner = owner;
//        creationDate = new Date().getDateNow();
    }

    public Account(int id, String type, double balance, Customer owner) {
        this.id = id;
        this.type = type;
        this.balance = balance;
        this.owner = owner;
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

    public void setType(String type) {
        this.type = type;
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

//    public String getCreationDate() {
//        return creationDate;
//    }
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
