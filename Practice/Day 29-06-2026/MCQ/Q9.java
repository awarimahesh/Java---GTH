/*
A) A
B) B
C) Compilation Error
D) Runtime Error

*/
class A {
    static void display() {
        System.out.println("A");
    }
}
class B extends A {
    static void display() {
        System.out.println("B");
    }
}
public class Q9 {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
