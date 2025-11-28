package com.amalitech.bankaccount.enums;

public enum CustomerType {
    REGULAR("Regular"),
    PREMIUM("Premium"),
    SAVINGS("Savings"),
    CHECKING("Checking");

    private final String description;

    private CustomerType(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

}
