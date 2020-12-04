
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = -1;
        String oldestname = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
    
        String[] parts = input.split(",");
        
        if (oldest < Integer.parseInt(parts[1])) {
			oldestname = parts[0];
			oldest = Integer.parseInt(parts[1]);
    }
            //System.out.println("Age of the oldest: " + oldest);

    }
      System.out.println("Age of the oldest: " + oldestname);
    }
}
