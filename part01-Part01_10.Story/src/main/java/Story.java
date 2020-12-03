
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String in = scanner.nextLine();
        System.out.println("What is their job?");
        String in2 = scanner.nextLine();
        System.out.println("Here is the story:\n" +
"Once upon a time there was "+ in + ", who was "+ in2 +".\n" +
"On the way to work, "+ in +" reflected on life.\n" +
"Perhaps "+in +" will not be "+ in2 + " forever.");

    }
}
