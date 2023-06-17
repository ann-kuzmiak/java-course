package com.course.OOP;

public enum CardType {
    VISA("Visa"), MASTERCARD("MasterCard");
    private String cardType;

    CardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }
}
