package ru.otus.homework5.lesson15;

import java.util.ArrayList;
import java.util.Map;

/**
 * @author Sergei on 22.10.2024 23:04.
 * @project homework5Lesson15
 */
public class Box {
    private Map<String, ArrayList<String>> box;


    public Box(Map<String, ArrayList<String>> box) {
        this.box = box;
    }

    public Map<String, ArrayList<String>> getBox() {
        return box;
    }

}
