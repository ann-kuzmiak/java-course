package com.course.OOP;

public class Card {
    private int id;
    private static int counter = 0;
    private String number;
    private String expireDate;
    private String cvv;
    private String cardType;

    public Card(String number, String expireDate, String cvv, String cardType) {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        if (cardType == "Visa" || cardType == "MasterCard") {
            this.cardType = cardType;
        }
        this.counter++;
        this.id = counter;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Card.counter = counter;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
}
