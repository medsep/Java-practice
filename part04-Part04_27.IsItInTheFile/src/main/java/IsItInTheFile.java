
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> lines = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        //rrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        try (Scanner scanner1 = new Scanner(Paths.get(file))) {
            
            while (scanner1.hasNextLine()) {
            lines.add(scanner1.nextLine());
            }
              
            if (lines.contains(searchedFor)) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        }catch (Exception e) {
        System.out.println("Reading the file nonexistent.txt failed.");
    
        }
    }   
    }
