/*

A) 0
B) 1
C) 2
D) Compilation Error


The output is 2 because count is a static variable shared by all objects.
 Each time a Test object is created, the constructor increments count, 
so after creating two objects, count becomes 2.
*/
class Q7 {
    static int count = 0;

    Test() {
        count++;
    }

    public static void main(String[] args) {
        new Test();
        new Test();
        System.out.println(count);
    }
}
