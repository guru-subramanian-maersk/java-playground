package org.example.records;

public class RecordTest {

    public static void main(String[] args) {
        Record1 record1 = method1();
        String name = record1.name();
        System.out.println("name = " + name);
        name = "test";
        System.out.println("name = " + name);

        TestObject newTestObj = record1.testObject();
        System.out.println("newTestObj = " + newTestObj.pincode);

        newTestObj = new TestObject(2);
        System.out.println("newTestObj new = " + newTestObj.pincode);
    }

    static Record1  method1 () {
        return new Record1("guru", 1, new TestObject(1));
    }
    record Record1 (String name, Integer age, TestObject testObject) {}
}

class TestObject {
    Integer pincode;

    public TestObject(Integer pincode) {
        this.pincode = pincode;
    }
}



