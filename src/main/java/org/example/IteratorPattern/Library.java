package org.example.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class Library {

    private List<Book> bookList;

    public Library(List<Book> bookList){
        this.bookList = bookList;
    }

    public Iterator createIterator(){
        return new BookIterator(bookList);
    }
}
