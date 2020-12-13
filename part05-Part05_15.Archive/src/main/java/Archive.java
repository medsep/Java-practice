/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Archive {
    
    private String name;
    private String identifier;
    
public Archive(){
    
}
    
    public Archive(String name, String identifier){
        this.name=name;
        this.identifier=identifier;
    }
    
    public String getName(){
        return this.name;
    }   
    
    public String getIdentifer(){
        return this.identifier;
    }
    
    //@Override
    public boolean equals(Archive compared){
        Archive archive = (Archive) compared;
        return this.identifier.equals(compared.identifier);
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setIdentifier(String identifier){
        this.identifier =identifier;
    }
}
