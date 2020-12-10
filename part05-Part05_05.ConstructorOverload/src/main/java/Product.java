
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }
    
    /**
     * creates a product with the given name. Its location is 
     * set to "shelf" and its weight is set to 1.
     * @param name 
     */
    public Product(String name){
        this.name = name;
        this.weight = 1;
        this.location = "shelf";
    }
    
    /**
     * Creates a product with the given name and the given location. 
     * Its weight is set to 1.
     * @param name
     * @param location 
     */
    public Product(String name, String location) {
        this.name = name;
        this.location = location;
        this.weight=1;
        
    }
    /**
     * creates a product with the given name and the given weight. 
     * Its location is set to "shelf".
     * @param name
     * @param weight 
     */
    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
        this.location = "shelf";
    }
    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
