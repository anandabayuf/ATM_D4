/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author ASUS X505Z
 */
public abstract class Costumer implements AccountInterface{

    private int accountNumber;
    private int pin; 
    private double availableBalance; 
    private double totalBalance; 
    
    public Costumer(int accountNumber, int pin,double availableBalance, double totalBalance){
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
    }
    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public int getPin() {
        return pin;
    }

    @Override
    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }


    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }


    public double getTotalBalance() {
        return totalBalance;
    }


    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
    
}
