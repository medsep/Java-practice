
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics(){
        this.sum = 0;
        this.count = 0;
      }
    
    public void addNumber(int number) {
        // write code here
        count+=1;
        sum+=number;
    }
       
    public int getCount(){
       return count;
   } 
    
    public double average() {
        // write code here
        if (count!=0){
            double average =1.0 * sum()/count;
        return average;
        }
        return 0;    
    }
    
    public int sum() {
        // write code here
        //sum += number;
        return (sum);
    }
}
