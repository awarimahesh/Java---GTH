/*
A) Output A
B) Output B
C) Compilation Error
D) Runtime Error


Compilation Error occurs because the show() method in class A is declared final. 
A final method cannot be overridden in a subclass, but class B attempts to override it.
*/
class Q6{
    final void show() {
        System.out.println("A");
    }
}

class B extends Q6 {
    void show() {
        System.out.println("B");
    }
}
