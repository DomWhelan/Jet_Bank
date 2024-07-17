package com.jetbanking.people;

import com.jetbanking.exceptions.InvalidInput;

import java.util.Date;

public class Client extends Person {

    private int client_id;
    private String phone_number;
    private String address_1;
    private String address_2;
    private String email;
    // private int creditRating;
    // limit allowable entries - 300min to 850max
    // 300-579 Poor, 580-669 Fair, 670-739 Good, 740-799 Very Good, 800up Excellent
    public Client(){}
    public Client(String firstName, String lastName, String emailAddress, String sinNumber) throws InvalidInput {
        super.setFirstName(firstName);
        super.setLastName(lastName);
        this.setEmail(emailAddress);
        super.setSin(sinNumber);
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAddress_1() {
        return address_1;
    }

    public void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public String getAddress_2() {
        return address_2;
    }

    public void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){

        return  "\nClient ID:  " + this.getClient_id() +
                "\nsin:        " + this.getSin() +
                "\nFirst Name: " + super.getFirstName() +
                "\nLast Name:  " + super.getLastName() +
                "\nAddress:    " + this.getAddress_1() +
                "\n            " + this.getAddress_2() +
                "\nPhone:      " + this.getPhone_number() +
                "\nEmail:      " + this.getEmail() +
                "\nGender:     " + this.getGender() +
                "\nBirth Date: " + this.getBirthDate();
    }
}
