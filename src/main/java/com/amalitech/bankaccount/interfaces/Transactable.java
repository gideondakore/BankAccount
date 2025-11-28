package com.amalitech.bankaccount.interfaces;

public interface Transactable {

    public boolean processTransaction(double amount, String type);
}
