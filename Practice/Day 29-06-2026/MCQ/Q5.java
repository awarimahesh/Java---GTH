/*

A) 5
B) 10
C) 0
D) Compilation Error


The output is 10 because this(10) calls the parameterized constructor, 
which assigns 10 to the instance variable x. After returning to the default 
constructor, System.out.println(x) prints the updated value 10.
*/

class Q5{
    int x = 5;

    Q5() {
        this(10);
        System.out.println(x);
    }

    Q5(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        new Q5();
    }
}
