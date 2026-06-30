/*
A) 10
B) 20 ans  The static block runs immediately after the static variable initialization.
C) 0
D) Compilation Error

*/

class Q3 {
    static int x = 10;

    static {
        x = 20;
    }

    public static void main(String[] args) {
        System.out.println(x);
    }
}
