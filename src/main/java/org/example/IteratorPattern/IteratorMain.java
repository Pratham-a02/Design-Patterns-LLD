package org.example.IteratorPattern;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book(101L,"Maths"),
                new Book(102L,"Science"),
                new Book(103L,"English"),
                new Book(104L,"Hindi")
        );

        Library library = new Library(books);
        Iterator iterator = library.createIterator();

        while(iterator.hasNext()){
            Book book = (Book)(iterator.next());
            System.out.println(book.getName());
        }
    }
}
