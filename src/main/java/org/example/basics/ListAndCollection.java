package org.example.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListAndCollection {

    public static void main(String[] args) {
//        indexAndObject();
        testUnmodifiableLists();
    }

    public static void indexAndObject() {
        List<Integer> numbers = new ArrayList<>(List.of(0,1,2,4,3));
        numbers.remove(3);
        System.out.println(numbers);


        Collection<Integer> numberCollection = new ArrayList<>(List.of(0,1,2,4,3));
        numberCollection.remove(3);
        System.out.println(numberCollection);
    }


    public static void testUnmodifiableLists() {
        List<Integer> integerList = Arrays.asList(0, 1, 2, 4, 3);
//        List<Integer> integerList = List.of(0, 1, 2, 4, 3);
        try {
            System.out.println(integerList.getClass());
            integerList.remove(3);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot remove from fixed-size list: " + e.getMessage());
        }

        try {
            integerList.set(3, 99);
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot remove from fixed-size list: " + e.getMessage());
        }

        System.out.println(integerList);
    }

}
