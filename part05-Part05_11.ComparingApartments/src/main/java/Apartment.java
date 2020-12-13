
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    /**
     * returns true if the apartment object whose method is called has a larger 
     * total area than the apartment object that is being compared.
     * @param compared
     * @return 
     */
    public boolean largerThan(Apartment compared){
        if (this.squares>compared.squares){
            return true;
        }
        return false;
    }
    /**
     *  returns the price difference of the apartment object whose method was
     * called and the apartment object received as the parameter. The price 
     * difference is the absolute value of the difference of the prices 
     * (price can be calculated by multiplying the price per square by the 
     * number of squares).
     * @param compared
     * @return 
     */
    public int priceDifference(Apartment compared){
        int priceDifference = Math.abs((this.princePerSquare*this.squares)- 
                (compared.princePerSquare*compared.squares));
        return priceDifference;        
    }
    
    /**
     * returns true if the apartment object whose method is called is more 
     * expensive than the apartment object being compared.
     * @param compared
     * @return 
     */
     public boolean moreExpensiveThan(Apartment compared){
         if ((this.princePerSquare*this.squares)> ((compared.princePerSquare*compared.squares))){
             return true;
         }
         return false;
     }
}
