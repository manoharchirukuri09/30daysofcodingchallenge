1. Star Diamond
  code
  public class Solution {
    public static void nStarDiamond(int n) {
        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nStarDiamond(3);
    }
}

2.Rectangle Pattern
  code
  import java.util.*;
public class RectanglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int col = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }

    }
}
