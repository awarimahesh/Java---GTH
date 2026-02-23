/*
Q5. Write a java program to print the given pattern
*/
class Q5 {
    public static void main(String[] args) {
        int n = 5;   // number of rows
        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
			
            // Single inner loop for full row
            for (int j = 1; j <= 2 * n; j++) {
                // Left side numbers
                if (j <= i) {
                    System.out.print(j + " ");
                }
				
                // Right side numbers
                else if (j > 2 * n - i) {
                    System.out.print((2 * n - j + 1) + " ");
                }
                // Middle spaces
                else {
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
    }
}