
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int in1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int in2 = Integer.valueOf(scanner.nextLine());
        System.out.println(in1+ " * "+in2+" = "+(in1*in2));

    }
}
