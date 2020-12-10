import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
                
        while(true){
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()){
                break;
                }
            
            System.out.println("Pages: ");
            int pages=Integer.parseInt(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(title, pages, year));
    }
        System.out.println("What information will be printed? ");
        String reply = scanner.nextLine();
            
        for (Book book:books){
           if (reply.equals("everything")){
               System.out.println((book));
        }else if (reply.equals("name")){
              System.out.println(book.getName());
        }
          
        }            
        
}
}
