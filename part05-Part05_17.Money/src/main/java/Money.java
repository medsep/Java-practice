
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition){
        //Money newMoney = new Money(int newEuros,int newCents); 
        int newEuros = this.euros +addition.euros();
        int newCents = this.cents +addition.cents();
        return new Money(newEuros,newCents);        
    }
    
    public Money minus(Money decreaser){
        int newEuros= this.euros - decreaser.euros();
        int newCents = this.cents - decreaser.cents();
        double total = newEuros+ newCents/100;
        
        if (newCents<0){
            newCents +=100;
            newEuros -=1;
        }
        
         if (total<0){
             return new Money(0,0);
         }
         return new Money(newEuros,newCents); 
    }
    
    public boolean lessThan(Money compared){
        
       double thisTotal = this.euros + this.cents / 100.0;
       double compareTotal = compared.euros() + compared.cents() / 100.0;
       return thisTotal < compareTotal;
        
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
