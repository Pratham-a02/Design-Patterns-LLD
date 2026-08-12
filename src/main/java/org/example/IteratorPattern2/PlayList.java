package org.example.IteratorPattern2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

    List<String> songs;

    public PlayList(List<String> songs){
        this.songs = songs;
    }



    public PlayListIterator iterator(String type){
        switch (type){
            case "simple":
                return new SimplePlayListIterator(this);
            case "shuffled":
                return new ShuffledPlayListIterator(this);
            default:
                return null;
        }
    }
}
