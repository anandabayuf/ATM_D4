package com.appl.atm.model;
/*
@author Evan Lokajaya
*/

public class Admin implements AccountInterface{
    int accountNumber;
    int pin;

    public Admin(){
        accountNumber=0000;
        pin=0000;
    }

    @Override
    public int getAccountNumber(){
        return this.accountNumber;
    }

    @Override
    public boolean authenticatePin(int inputPin){
        return (this.pin==inputPin);
    }
}