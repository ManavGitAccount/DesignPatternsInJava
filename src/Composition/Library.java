package Composition;

import java.util.List;

public class Library {

    //Reference to refer to list of books
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getTotalBooksInLibrary(){
        return books;
    }
}

