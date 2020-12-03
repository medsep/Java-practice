
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int in1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int in2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int in3 = Integer.valueOf(scanner.nextLine());
        double sum = (in1+in2+in3);
        double average = (sum/3);
        System.out.println("The average is " +average);

    }
}
