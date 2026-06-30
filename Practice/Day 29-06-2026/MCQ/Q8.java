/*
A) Shape
B) Compilation Error
C) Runtime Error
D) No Output
Compilation Error occurs because Shape is an abstract class. 
Java does not allow creating objects of an abstract class using new.
 Abstract classes must be extended,
 and objects should be created from their concrete subclasses.
*/


abstract class Shape {
    Shape() {
        System.out.println("Shape");
    }
}

public class Q8 {
    public static void main(String[] args) {
        Shape s = new Shape();
    }
}
