package ru.otus.homework5.lesson15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Sergei on 23.10.2024 20:34.
 * @project homework5Lesson15
 */
public class BoxorderPrimarilyDollsIterator implements Iterator<String> {

    Box box;
    private Map<String, ArrayList<String>> boxBuff;
    private int position;
    String[] bufArr = new String[40];

    public BoxorderPrimarilyDollsIterator(Box box) {
        this.box = box;
        this.position = 0;
        this.bufArr = bufBuilder();
    }

    public String[] bufBuilder() {
        Iterator<Map.Entry<String, ArrayList<String>>> iterator = box.getBox().entrySet().iterator();
        int index = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<String>> item = iterator.next();
            for (int i = 0; i < 10; i++) {
                bufArr[i * 4 + index] = item.getValue().get(i);
            }
            index++;
        }
        return bufArr;
    }

    @Override
    public boolean hasNext() {
        return position < bufArr.length;
    }

    @Override
    public String next() {
        position++;
        return bufArr[position - 1];

    }
}