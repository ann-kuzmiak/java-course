package com.course.OOP;

import com.course.OOP.exceptions.InvalidCardTypeException;

public class Card {
    private int id;
    private static int counter = 0;
    private String number;
    private String expireDate;
    private String cvv;
    private CardType cardType;

    public Card(String number, String expireDate, String cvv, String cardType) throws InvalidCardTypeException {
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        setCardType(cardType);
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
        return cardType.getCardType();
    }

    public void setCardType(String cardType) throws InvalidCardTypeException {
        this.cardType = switch (cardType) {
            case ("Visa") -> CardType.VISA;
            case ("MasterCard") -> CardType.MASTERCARD;
            default -> throw new InvalidCardTypeException();
        };
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", cardType='" + cardType.getCardType() + '\'' +
                '}';
    }
}
