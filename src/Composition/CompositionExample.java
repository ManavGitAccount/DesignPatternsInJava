package Composition;

import java.util.ArrayList;
import java.util.List;

public class CompositionExample {

    public static void main(String[] args) {

        //Creating the object of Book Class
        Book b1 = new Book("A merry go around", "Steven Steils");
        Book b2 = new Book("Best of Beast", "James Macovoy");
        Book b3 = new Book("Java : The Complete Reference", "Herbert Schildt" );
        Book b4 = new Book("C++ Primer", "Faisal Method");
        Book b5 = new Book("JavaScript", "Sherwood");

        List<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        Library library = new Library(books);

        List<Book> bks = library.getTotalBooksInLibrary();

        for(Book bk : bks){
            System.out.println("Title : " + bk.title + " , " + " Author : " + bk.author);
        }
    }
}
