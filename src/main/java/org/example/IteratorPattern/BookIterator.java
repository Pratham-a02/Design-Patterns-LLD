package org.example.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class BookIterator implements Iterator {

    List<Book> bookList;
    int idx = 0;

    public BookIterator(List<Book> bookList){
        this.bookList = bookList;
    }
    @Override
    public boolean hasNext() {
        return idx < bookList.size();
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return bookList.get(idx++);
        }
        return null;
    }
}
