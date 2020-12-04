
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("");
        String input = scanner.nextLine();
        
        String[] pieces = input.split(" ");
        
        for (int i=0; i<pieces.length; i++){
            System.out.println(pieces[i]);
        }
        
    }
}
