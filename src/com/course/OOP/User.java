package com.course.OOP;

import com.course.OOP.exceptions.InvalidPhoneNumberException;
import com.course.OOP.exceptions.InvalidRoleException;

import java.util.ArrayList;

public class User {
    protected int id;
    protected static int counter = 0;
    protected String firstName;
    protected String lastName;
    protected String fullName;
    protected String email;
    protected String phoneNumber;
    protected Address billingAddress;
    protected Address deliveryAddress;
    protected ArrayList<Card> cards = new ArrayList<>();
    protected Role role;
    private Manager manager;

    public void initUser(String email, String role) {
        this.email = email;
        this.role = new Role(role);
        this.counter++;
        this.id = counter;
    }

    public User(String fullName, String email, String role) throws InvalidRoleException {
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        if (names.length > 1) {
            this.lastName = names[1];
        }
        this.fullName = fullName;
        initUser(email, role);
    }

    public User(String firstName, String lastName, String email, String role) throws InvalidRoleException{
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        initUser(email, role);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (phoneNumber.startsWith("+")) {
            this.phoneNumber = phoneNumber;
        } else throw new InvalidPhoneNumberException();
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String country, String city, String street, String building, String zipCode) {
        this.billingAddress = new Address(country, city, street, building, zipCode);
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String country, String city, String street, String building, String zipCode) {
        this.deliveryAddress = new Address(country, city, street, building, zipCode);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCard(String cardNumber, String expireDate, String cvv, String cardType) {
        cards.add(new Card(cardNumber, expireDate, cvv, cardType));
    }

    public Role getRole() {
        return role;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                toStringLine("billingAddress", billingAddress) +
                toStringLine("deliveryAddress", deliveryAddress) +
                ", role='" + role.toString() + '\'' +
                '}';
    }

    public void printUserInfo() {
        System.out.println(this.toString());
    }

    public String toStringLine(String valueName, Object value) {
        return ", " + valueName + "='" + (value == null ? "null" : value.toString()) + '\'';
    }

}
