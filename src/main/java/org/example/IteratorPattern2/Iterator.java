package org.example.IteratorPattern2;

import java.util.Arrays;
import java.util.List;

public class Iterator {

    public static void main(String[] args) {
        List<String> songs = Arrays.asList("s1","s2","s3","s4");

        PlayList playList = new PlayList(songs);
        PlayListIterator iterator = playList.iterator("shuffled");

        while(iterator.hasNext()){
            String song = iterator.next();
            System.out.println(song);
        }
    }
}
