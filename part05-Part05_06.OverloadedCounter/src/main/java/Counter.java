/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Counter {
    private int startValue;
    private int value;
    //private int counter;
    /**
     *  sets the start value of the counter to startValue.
     * @param startValue 
     */
    public Counter(int startValue){
       this.value = startValue;
        
    }
    /**
     *  sets the start value of the counter to 0.
     */
    public Counter(){
        this.value=0;
    }
    
    /**
     *  returns the current value of the counter
     * @return 
     */
    public int value(){
       return this.value;
    }
    
    /**
     *  increases the value by 1
     */
    public void increase(){
       this.value+=1;
    }
    
    /**
     * decreases the value by 1
     */
    
    public void decrease(){
        this.value-=1;
    }
    /**
     * increases the value of the counter by the value of increaseBy. 
     * If the value of increaseBy is negative, the value of the counter 
     * does not change.
     * @param increaseBy 
     */
    public void increase(int increaseBy){
        if (increaseBy<0){
            increaseBy=0;
        }
        this.value += increaseBy;
        
    }
    
    /**
     * decreases the value of the counter by the value of decreaseBy. 
     * If the value of decreaseBy is negative, the value of the counter 
     * does not change
     * @param decreaseBy 
     */
    public void decrease(int decreaseBy){
        if (decreaseBy<0){
            decreaseBy=0;
        }
        this.value -= decreaseBy;
    }
}
