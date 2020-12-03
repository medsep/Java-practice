
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int in1 = Integer.valueOf(scanner.nextLine());
        int in2 = Integer.valueOf(scanner.nextLine());
        
        double sum = in1+in2;
        double output = Math.sqrt(sum);

        System.out.println(output);
    }
}
