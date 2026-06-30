/*

A) Child
B) Parent
C) Parent Child
D) Compilation Error
*/

class Parent {
    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child");
    }
}

public class Q4 {
    public static void main(String[] args) {
        new Child();
    }
}
