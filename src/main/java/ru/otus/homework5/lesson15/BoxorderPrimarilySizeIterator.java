package ru.otus.homework5.lesson15;

import java.util.*;

/**
 * @author Sergei on 27.10.2024 20:46.
 * @project homework5Lesson15
 */

public class BoxorderPrimarilySizeIterator implements Iterator<String> {

    Box box;
    private Map<String, ArrayList<String>> boxBuff;
    private int position;
    private List<String> bufList = new ArrayList<>();

    public BoxorderPrimarilySizeIterator(Box box) {
        this.box = box;
        this.position = 0;
        this.bufList = bufBuilder();
    }

    public List<String> bufBuilder() {
        Set<String> setKeys = box.getBox().keySet();
        for (String k : setKeys) {
            ArrayList<String> list = box.getBox().get(k);
            for (String doll : list) {
                bufList.add(doll);
            }
        }
        return bufList;
    }

    @Override
    public boolean hasNext() {
        return position < bufList.size();
    }

    @Override
    public String next() {
        position++;
        return bufList.get(position - 1);

    }

}