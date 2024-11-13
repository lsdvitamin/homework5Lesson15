package ru.otus.homework5.lesson15;

import java.util.*;

/**
 * @author Sergei on 22.10.2024 22:38.
 * @project Default (Template) Project
 */
public class Main {
    public static void main(String[] args) {
        Box box = initBox();

        Iterator<String> iterator = new BoxorderPrimarilySizeIterator(box);
        while (iterator.hasNext()){
            String doll = iterator.next().toString();
            System.out.print(doll + " ");
        }

        System.out.println("\n");

        Iterator<String> iterator1 = new BoxorderPrimarilyDollsIterator(box);
        while (iterator1.hasNext()){
            String doll = iterator1.next().toString();
            System.out.print(doll + " ");
        }
    }

    private static Box initBox() {
        Map<String, ArrayList<String>> dolls = new HashMap<>();
        dolls.put("Red", new ArrayList(Arrays.asList("r1", "r2", "r3", "r4", "r5", "r6", "r7", "r8", "r9", "r10")));
        dolls.put("Orange", new ArrayList(Arrays.asList("o1", "o2", "o3", "o4", "o5", "o6", "o7", "o8", "o9", "o10")));
        dolls.put("Yellow", new ArrayList(Arrays.asList("y1", "y2", "y3", "y4", "y5", "y6", "y7", "y8", "y9", "y10")));
        dolls.put("Green", new ArrayList(Arrays.asList("g1", "g2", "g3", "g4", "g5", "g6", "g7", "g8", "g9", "g10")));
        Box box = new Box(dolls);
        return box;
    }


}