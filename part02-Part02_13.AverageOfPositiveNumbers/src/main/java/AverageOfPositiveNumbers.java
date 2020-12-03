
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        int count=0;
        int sum =0;
        while(true){
            System.out.println("");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input !=0 && input>0){
                count+=1;
                sum +=input;
                continue;
            }else if(input==0){
                break;
            }                     
        }
        double average = 1.0 * sum/count;
        if (count>0){
            System.out.println(average);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
