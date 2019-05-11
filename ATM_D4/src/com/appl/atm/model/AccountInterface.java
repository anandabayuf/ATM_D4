/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author Ananda Bayu
 */
public interface AccountInterface {
    public abstract int getAccountNumber();
    public abstract void setAccountNumber(int accountNumber);
    public abstract int getPin();
    public abstract void setPin(int pin);
    
}
