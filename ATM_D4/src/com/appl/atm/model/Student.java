/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appl.atm.model;

/**
 *
 * @author ACER
 */
public class Student extends Costumer{
    private final static int MAX_TRF = 100;
    private final static int MAX_WITHDRAWAL = 50;
    private static int Current_Trf = 0;
    private static int Current_Withdrawal = 0;
   
    // Constructor
    public Student(int accountNumber, int pin, double availableBalance, double totalBalance){        
        super(accountNumber, pin, availableBalance, totalBalance);
    }
    
    public int getMAX_TRF(){
        return MAX_TRF;
    }
    
    public int getMAX_WITHDRAWAL(){
        return MAX_WITHDRAWAL;
    }
    
    public int getCurrent_Trf(){
        return Current_Trf;
    }
    
    public int getCurrent_Withdrawal(){
        return Current_Withdrawal;
    }
    
    public void setCurrent_TRF(int newCurrent){
       Current_Withdrawal = newCurrent;
    }

    public void setCurrent_Withdrawal(int newCurrent){
       Current_Withdrawal = newCurrent;
    }
}
