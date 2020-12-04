
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i=1; i<=number;i++){
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int j=2*(number-i); j>=0; j--) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
       int i, j; 
  
        // outer loop to handle number of rows 
        //  n in this case 
        for(i=0; i<size; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            
                // printing spaces 
                printSpaces(size); 
            
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(j=0; j<=i; j++) 
            { 
                // printing stars 
                printStars(j); 
            } 
              
            // ending line after each row 
            System.out.println(); 
        } 
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
