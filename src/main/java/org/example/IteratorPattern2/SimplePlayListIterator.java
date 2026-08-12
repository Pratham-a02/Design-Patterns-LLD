package org.example.IteratorPattern2;

import java.util.List;

public class SimplePlayListIterator implements PlayListIterator{

    private PlayList playList;
    private int idx;

    SimplePlayListIterator(PlayList playList){
        this.playList = playList;
        this.idx = 0;
    }

    @Override
    public boolean hasNext() {
        return idx<playList.songs.size();
    }

    @Override
    public String next() {
        if(this.hasNext()){
            return playList.songs.get(idx++);
        }
        return null;
    }
}
