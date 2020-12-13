
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Stack {
    private ArrayList<String> meals;
    
    /**
     * Constructor
     */
    public Stack(){
    this.meals= new ArrayList<>();
}
    
    public boolean isEmpty(){
        if (meals.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        this.meals.add(value);
    }
    
    /**
     * returns the values ​​contained in the stack as a list.
     * @return 
     */
    public ArrayList<String> values() {
        return meals;
    }
    
    public String take(){
      //return meals.get(meals.size()-1);
      return meals.remove(meals.size()-1);
    }
}
