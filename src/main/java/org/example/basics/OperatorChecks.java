package org.example.basics;

public class OperatorChecks {
    public static void main(String[] args) {
        boolean compare = false && false;
        System.out.println(compare);

//        boolean a = false; // change to true to see different behavior
//        String test = "test";
//        System.out.println(a && testAnd(test));
    }

    public static boolean testAnd(String test) {
        test = "hello";
        System.out.println(test);
        return true;
    }
}
