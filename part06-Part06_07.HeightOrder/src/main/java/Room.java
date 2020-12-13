/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author meh
 */
public class Room {
    
    private ArrayList<Person> persons;
            
    public Room(){
        persons = new ArrayList();
    }
    
    /**
     *  - add the person passed as a parameter to the list.
     * @param person 
     */
    public void add(Person person){
        persons.add(person);
    }
    
    /**
     * returns a boolean-type value true or false, that tells whether the room is empty or not.
     * @return 
     */
    public boolean isEmpty(){
        if (persons.isEmpty()){
            return true;
        }
        return false;
    } 

    /**
     *  - returns a list of the persons in the room.
     * @return 
     */
    public ArrayList<Person> getPersons(){
           
        return persons;
    }
    
    public Person shortest() {
        if (persons.isEmpty()){
            return null;
        }
    
    Person shortestPerson = persons.get(0);
    
    for (Person per:persons){
        if (per.getHeight()>shortestPerson.getHeight()){
            per = shortestPerson;
        }
    }
    return shortestPerson;   
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
       Person shortestPerson = persons.get(0);
    
    for (Person per:persons){
        if (per.getHeight()>shortestPerson.getHeight()){
            per = shortestPerson;
        }
    }
    return persons.remove();
    }
    
}
