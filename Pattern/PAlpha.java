import java.util.*;
class PAlpha {
    public static void main(String args[]) {
        int i, j;
        
        for (i = 1; i <= 5; i++) {
            int count = 0; 
            
            for (j = 1; j <= 9; j++) {
                
                if (j <= 6 - i || j >= 4 + i) {
                    
                    
                    
                    if (j <= 6 - i) {
                        count++;
                    } else if (j == 4 + i) {
                        count = 6 - i;
                    } else {
                        count--;
                    }
                    
                    char ch = (char)('A' + count - 1);
                    System.out.print(ch);
                    
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
