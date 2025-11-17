package org.example.records;

public class RecordTest2 {

    // testing return with nulls


    public static void main(String[] args) {
        Record1 record1 = new Record1(null, null, null);
        try {
            record1 = method1();
            System.out.println(record1);
        }catch (Exception ex) {
            System.out.println(record1.age());
        }
    }

    static Record1 method1 () {
//        throw new RuntimeException("testing null exception");
        return new Record1("guru", 1, new TestObject(1));
    }

    record Record1 (String name, Integer age, TestObject testObject) {}
}
