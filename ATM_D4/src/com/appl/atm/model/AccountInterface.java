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
    public abstract void getAccountNumber();
    public abstract void setAccountNumber(int accountNumber);
    public abstract void getPin();
    public abstract void setPin(int pin);
    
}
