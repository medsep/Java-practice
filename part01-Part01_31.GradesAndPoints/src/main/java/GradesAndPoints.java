
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        
        if (grade<0){
            System.out.println("Grade: impossible!");
        }else if (0<=grade && grade<50){
            System.out.println("Grade: failed");
        }else if(50<=grade && grade<60){
            System.out.println("Grade: 1");
        }else if (60<=grade && grade<70){
            System.out.println("Grade: 2");
        }else if(70<=grade && grade<80){
            System.out.println("Grade: 3");
        }else if (80<=grade && grade<90){
            System.out.println("Grade: 4");
        }else if(90<=grade && grade<101){
            System.out.println("Grade: 5");
        }else{
            System.out.println("Grade: incredible!");
        }

    }
}
