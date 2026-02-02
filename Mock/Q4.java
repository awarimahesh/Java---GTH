class Q4 {
    public static void main(String[] args) {

        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {

                if (i == 5 || j == 5 || j==4+i||j == 6 - i||j==i-4||j==14-i){
                    System.out.print("*");
				}
                else{
                    System.out.print(" ");
				}
            }
            System.out.println();
        }
    }
}
