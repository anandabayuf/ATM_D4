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

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public boolean authenticatePin(int inputPin){
        return (this.pin==inputPin);
    }
}