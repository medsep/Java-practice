
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String in1 = scan.nextLine();
        System.out.println("Give an integer: ");
        int in2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double: ");
        double in3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean: ");
        boolean in4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + in1);
        System.out.println("You gave the integer " + in2);
        System.out.println("You gave the double " + in3);
        System.out.println("You gave the boolean " + in4);

        

    }
}
