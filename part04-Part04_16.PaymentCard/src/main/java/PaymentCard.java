/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard(double openingBalance) {
        // write code here
       this.balance = openingBalance;
      }

    public String toString() {
        // write code here
        return  ("The card has a balance of "+ this.balance +" euros");      
    } 
    
    public void eatAffordably() {
    // write code here
    if (balance>=2.6){
       this.balance = balance -  2.60; 
    }
}

    public void eatHeartily() {
    // write code here
    if (balance>=4.6){
        this.balance = balance -  4.60;
    }
    }
    
    public void addMoney(double amount) {
    // write code here
    if(amount < 0){
       amount =0;
       balance = balance+amount;
    }else if (balance+amount<=150){
        balance = balance+amount;
    }else if (balance+amount>150){
        balance = 150;
    }
    
    
}
   }
