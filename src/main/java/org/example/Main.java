package org.example;

import java.util.*;

class Pair {
    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    private Integer count;
    private String word;

}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi! Here are the frequencies of each character in the sentence:");

        Map<String, Integer> frequencies = new HashMap<>();

        for (String word : args) {
            frequencies.putIfAbsent(word, 0);
            frequencies.put(word, frequencies.get(word) + 1);

        }

        List<Pair> counts = new ArrayList<Pair>();

        for (String w: frequencies.keySet()) {
            Pair p = new Pair();
            p.setWord(w);
            p.setCount(frequencies.get(w));
            counts.add(p);
        }

        counts.sort(Comparator.comparing(p -> -p.getCount()));;

        for (Pair p: counts) {
            System.out.println(p.getCount() + " " + p.getWord());
        }

    }
}