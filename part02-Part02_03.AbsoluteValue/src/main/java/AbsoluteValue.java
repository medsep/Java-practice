
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int value = Integer.valueOf(scanner.nextLine());
        int out = Math.abs(value);
        System.out.println(out);
    }
}
