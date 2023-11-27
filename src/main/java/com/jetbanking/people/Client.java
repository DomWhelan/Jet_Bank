package com.jetbanking.people;

import java.util.ArrayList;
import java.util.Date;

public class Client extends Person {

    private int client_id;
    private String first_name;
    private String last_name;
    private Character gender;
    private Date birth_date;
    private String sin;
    private String phone_number;
    private String address_1;
    private String address_2;
    private String email;
    // private int creditRating;
    // limit allowable entries - 300min to 850max
    // 300-579 Poor, 580-669 Fair, 670-739 Good, 740-799 Very Good, 800up Excellent
    public Client(){};
    public Client(String firstName, String lastName, String emailAddress, String sinNumber){
        this.setFirst_name(firstName);
        this.setLast_name(lastName);
        this.setEmail(emailAddress);
        this.setSin(sinNumber);
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getSin() {
        return sin;
    }

    public void setSin(String sin) {
        this.sin = sin;
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
}
