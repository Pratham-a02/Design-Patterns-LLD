package org.example.IteratorPattern2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffledPlayListIterator implements PlayListIterator{

    private PlayList playList;
    List<String> shuffledSongs;
    private int idx;

    public ShuffledPlayListIterator(PlayList playList){
        this.playList = playList;
        this.shuffledSongs = new ArrayList<>(playList.songs);
        Collections.shuffle(shuffledSongs);
        idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx<shuffledSongs.size();
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return shuffledSongs.get(idx++);
        }
        return null;
    }
}
