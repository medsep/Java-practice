
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int in1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int in2 = Integer.valueOf(scanner.nextLine());
        int sum = in1+in2;
        int minus = in1-in2;
        int multiply = in1*in2;
        double div = (double)in1/in2;     
       System.out.println(in1 +  " + " + in2 + " = " + sum);
       System.out.println(in1 +  " - " + in2 + " = " + minus);
       System.out.println(in1 +  " * " + in2 + " = " + multiply);
       System.out.println(in1 +  " / " + in2 + " = " + div);




    }
}
