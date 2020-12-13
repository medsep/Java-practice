
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
public class Package {
        
    private ArrayList<Gift> gifts;
    //private ArrayList<Gift> gifts;

    public Package(){
        gifts = new ArrayList();
    }
    
    public void addGift(Gift gift){
        //ArrayList<Gift> gifts = new ArrayList<>();
        gifts.add(gift);
    }
    
  
     public int totalWeight(){
        int sumOfWeight=0;
        for (Gift gift: gifts) {
            sumOfWeight += gift.getWeight();
        }
        return sumOfWeight;
     }
}
