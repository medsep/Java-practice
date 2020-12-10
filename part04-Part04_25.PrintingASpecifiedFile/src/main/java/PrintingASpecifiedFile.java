
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

        public static void main(String[] args) {
            Scanner fileScanner = new Scanner(System.in);
    
            System.out.println("Which file should have its contents printed?");
    
            String fileName = fileScanner.nextLine();
    
          //try(Scanner scanner = new Scanner(Paths.get(fileName))) {
            try(Scanner scanner = new Scanner(Paths.get(fileName))){    // this part of the code is underlined red
        
                while (scanner.hasNextLine()){
                    String output = scanner.nextLine();
                    System.out.println(output);
                }
        
            } 
            catch (Exception e){
                  System.out.println("Error: " + e.getMessage());
            }

          }
       }