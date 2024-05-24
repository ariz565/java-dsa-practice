//print the following pattern N=4
//     1
//   2 3
//  3 4 5
//  4 5 6 7

// import java.util.*;

// public class NumberPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int x = 1;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 System.out.println("");
//             }
//             for (int k = x; k < x + i + 1; k++) {
//                 System.out.print(k);
//             }
//             x++;
//             System.out.println();

//         }
//     }
// }

import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int spaces = 1;
            while (spaces <= n - i) {
                System.out.print(" ");
                spaces = spaces + 1;
            }

            int col = 1;
            int value = i;
            while (col <= i) {
                System.out.print(value);
                value = value + 1;
                col = col + 1;
            }
            System.out.println();
            i = i + 1;
        }
    }
}