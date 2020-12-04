
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1;
        int sum = 0;
        int count =0;
        String longestname = "";
        

       while (!(input1 = scanner.nextLine()).isEmpty())  {
            String[] parts = input1.split(",");
            
            sum += Integer.valueOf(parts[1]);
            count+= 1;
            
            int longest = parts[0].length();
            if (longest > longestname.length()) {
			longestname = parts[0];
			//oldest = Integer.parseInt(parts[1]);
    }
     } 
    double average = 1.0 * sum/count;
     System.out.println("Longest name: " + longestname);
     System.out.println("Average of the birth years: " + average);
    } 

}
