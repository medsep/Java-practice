/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Film {
    private String name;
    private int getRating;
    
    public Film(String filmName, int filmAgeRating){
        this.getRating = filmAgeRating;
        this.name = filmName;
    }
    
    public String name(){
        return this.name;
    }
    
    public int ageRating(){
        return this.getRating;
    }
}
