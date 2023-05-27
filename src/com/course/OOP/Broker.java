package com.course.OOP;

import com.course.OOP.interfaces.PrintInfo;

import java.util.ArrayList;

public class Broker implements PrintInfo {
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<User> clientsList;

    public Broker(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ArrayList<User> getClientsList() {
        return clientsList;
    }

    public void setClientsList(ArrayList<User> clientsList) {
        this.clientsList = clientsList;
    }

    public String toString() {
        return "Broker{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", clientsList=" + clientsList +
                '}';
    }

    public void printUserInfo() {
        System.out.println(this);
    }
}
