//OOP Coding MCQs (Without Answers)
//1. What will be the output of the following Java program?
class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class Q1{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
//b