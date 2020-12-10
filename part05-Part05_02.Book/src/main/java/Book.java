/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meh
 */
public class Book {
    
    private int pages;
    private String name;
    private String author;
    
     public Book(String author, String name, int pages){
         this.author = author;
         this.pages = pages;
         this.name = name;
     }
     
     public String getAuthor(){
         return this.author;
     }
     
     public String getName(){
         return this.name;
     }
     
     public int getPages(){
        return this.pages;
     }   
     
     public String toString(){
         //J. K. Rowling, Harry Potter and the Sorcerer's Stone, 223 pages
         return (this.author +", "+ this.name + ", "+ this.pages  + " pages");
     }
}
