
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count=0;
        while(true){
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input <0){
                count+=1;
                continue;
            }else if(input==0){
                break;
            }                     
        }System.out.println("Number of negative numbers: " + count);
    }
}
