
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int in1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int in2 = Integer.valueOf(scan.nextLine());
        
        if (in1>in2){
            System.out.println("Greater number is: " + in1);
        } else if(in1<in2){
            System.out.println("Greater number is: " + in2);
        }else{
            System.out.println("The numbers are equal!");
        }

    }
}
