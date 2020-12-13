
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }
    
    public SimpleDate getBirthday(){
        return this.birthday;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    public int getWeight(){
        return this.weight;
    }

    // implement an equals method here for checking the equality of objects
    public boolean equals (Object compared){
        if (this==compared){
            return true;
        } if(!(compared instanceof Person)){
        return false;
    }
        Person comparedPerson = (Person) compared;
        
        if (this.birthday.equals(comparedPerson.getBirthday())
                && (this.name.equals(comparedPerson.getName()))
                && (this.height== comparedPerson.getHeight())
                && (this.weight == comparedPerson.getWeight())){
            return true;
        }
        return false;
    }
}
