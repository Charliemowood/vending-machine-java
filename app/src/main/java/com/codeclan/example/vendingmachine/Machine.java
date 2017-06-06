package com.codeclan.example.vendingmachine;

/**
 * Created by home on 6/6/17.
 */

public class Machine {

    private int balance;
    private Item item;

    public Machine() {
        this.balance = balance;
    }


    public int getBalance() {
        return this.balance;
    }

    public int addCoins(int coins) {
        balance +=coins;
        return getBalance();
    }

}
