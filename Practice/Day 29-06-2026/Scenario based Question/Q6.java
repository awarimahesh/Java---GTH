/*Q16. Create a class that has a method named add() which can:
Add two integers
Add two double values
*/
public class Q7 {

    public static void main(String args[]) {

        int result1 = calAdd(100, 200);
        double result2 = calAdd(10.2, 10.2);

        System.out.println("Integer Sum = " + result1);
        System.out.println("Double Sum = " + result2);
    }

    public static int calAdd(int x, int y) {
        return x + y;
    }

    public static double calAdd(double x, double y) {
        return x + y;
    }
}
