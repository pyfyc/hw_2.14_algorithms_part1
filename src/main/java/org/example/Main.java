package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(10);
        StringListImpl stringArrayList = new StringListImpl(10);

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        stringArrayList.add("one");
        stringArrayList.add("two");
        stringArrayList.add("three");
        stringArrayList.add("four");
        stringArrayList.add("five");
        stringArrayList.add("six");
        stringArrayList.add("seven");
        stringArrayList.add("eight");
        stringArrayList.add("nine");
        stringArrayList.add("ten");
        stringArrayList.add(0, "zero");
        stringArrayList.add("eleven");
        stringArrayList.remove(5);
        stringArrayList.set(0, "0");
        stringArrayList.set(10, "10");

        System.out.println(arrayList);
        System.out.println(stringArrayList);

        System.out.println("arrayList Item #0: " + arrayList.get(0));
        System.out.println("stringArrayList Item #0: " + stringArrayList.get(0));

        arrayList.clear();
        stringArrayList.clear();

        System.out.println(arrayList);
        System.out.println(stringArrayList);

        System.out.println("Size: " + stringArrayList.size());
        System.out.println(stringArrayList.isEmpty());
    }
}