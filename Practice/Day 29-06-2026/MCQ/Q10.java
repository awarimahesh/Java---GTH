/*
A) 0
B) 100
C) null
D) Compilation Error


The output is 100 because when a Test object is created, 
the constructor is called automatically and initializes the instance variable x to 100.
 Therefore, System.out.println(t.x) prints 100.
*/

class Q10 {
    int x;

    Q10() {
        x = 100;
    }

    public static void main(String[] args) {
        Q10 t = new Q10();
        System.out.println(t.x);
    }
}
