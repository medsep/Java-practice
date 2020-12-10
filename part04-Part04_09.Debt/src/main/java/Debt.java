/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Debt {
    
    private double interestRate, balance;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.interestRate = initialInterestRate;
        this.balance = initialBalance;
    }
    
     public void printBalance(){
         System.out.println(balance);
         
     }
     
     public void waitOneYear(){
         balance =    interestRate*balance;      
     }
}
