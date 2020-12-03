
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int one = 0;
        while (true) {
            
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input < 0) {
                System.out.println("Unsuitable number");
                one += 1;
                continue;
            }
            if (input > 0) {
                int res = input * input;
                System.out.println(res);
                one += 1;
                continue;
            }
            if (input == 0) {
                break;
            }
        }
        //System.out.println("Number of numbers: " + one);
    }
}
