
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        int orwell = 1984;
        System.out.println("Give a number:");
        int input = Integer.valueOf(scan.nextLine());
        if (input == orwell){
            System.out.println("Orwell");
        }else {
            System.out.println("");
        }
    }
}
