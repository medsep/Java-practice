
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        int limit = 2015;
        System.out.println("Give a year:");
        int input = Integer.valueOf(scan.nextLine());
        
        if (limit>input){
            System.out.println("Ancient history!");                   
        }
    }
}
