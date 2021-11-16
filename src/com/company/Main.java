package com.company;

public class Main {

    public static void main(String[] args) {

        /*
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        */
        DynamicArray<String> array = new DynamicArray<>();
        array.add("Андрей");
        array.add("OLEG");
        array.add("MISHA");
        array.add("ARTEM");
        array.add("OLGA");
        array.add("ARINA");
        array.add("NICK");
        array.add("TOMAS");
        array.remove(2);// миша
    }
}
