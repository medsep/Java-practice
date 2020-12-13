
public class HealthStation {

   private int count;
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        int weigh = person.getWeight(); 
        this.count++;
        return weigh;   
    }
    
    /**
     * increase the weight of the parameter person by one.
     * @param person 
     */
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);        
    }
    
    /**
     * It should tell how many weighings the health station has performed. 
     * @return 
     */
    public int weighings(){
        return count;
    }
}
