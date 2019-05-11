package com.appl.atm.model;

/**
 *
 * @author Fajrina
 */                    
public class Business extends Costumer{
    private final static int MAX_TRF = 500;
    private final static int MAX_WITHDRAWAL = 1000;
    private static int Current_Trf = 0;
    private static int Current_Withdrawal = 0;
   
    // Bisnis 
    public Business(int accountNumber, int pin, double availableBalance, double totalBalance){
        
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
