// //Arun and Binny play a game of 3 sets. The scores of each player in each set is recorded in two different arrays. A Java program to display the number of sets won by each player has been written. But, it has bugs. Kindly fix it.
// //Eg: if Arun scores [10,12,2] and Binny scores (8,10,5] then Arun has won 2 sets and Binny 1. 
// import java.util.Scanner;

// public class Source {
//     public static int[] score(int[] a, int[] b, int[] res) {
//         res[0] = ((a[0] > b[0]) ? 1 : 0) + ((a[1] > b[1]) ? 1 : 0) + ((a[2] > b[2]) ? 1 : 0);
//         res[1] = ((a[0] < b[0]) ? 1 : 0) + ((a[1] < b[1]) ? 1 : 0) + ((a[2] < b[2]) ? 1 : 0);
//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[3];
//         int[] b = new int[3];
//         int i;

//         int[] res = new int[2];

//         for (i = 0; i < 3; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (i = 0; i < 3; i++) {
//             b[i] = sc.nextInt();
//         }
//         res = score(a, b, res);

//         for (i = 0; i < 2; i++) {
//             System.out.println(res[i]);
//         }
//     }

// } 

// import java.util.Scanner;

// public class Source {
//     public static int[] score(int[] a, int[] b, int[] res) {
//         res[0] = ((a[0] > b[0]) ? 1 : 0) + ((a[1] > b[1]) ? 1 : 0) + ((a[2] > b[2]) ? 1 : 0);
//         res[1] = ((a[0] < b[0]) ? 1 : 0) + ((a[1] < b[1]) ? 1 : 0) + ((a[2] < b[2]) ? 1 : 0);
//         return res;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] a = new int[3];
//         int[] b = new int[3];
//         int[] res = new int[2];
//         int i;
//         for (i = 0; i < 3; i++) {
//             a[i] = sc.nextInt();
//         }
//         for (i = 0; i < 3; i++) {
//             b[i] = sc.nextInt();
//         }
//         res = score(a, b, res);

//         for (i = 0; i < 2; i++) {
//             System.out.println(res[i]);
//         }
//     }

// } // correct the java code

import java.util.Scanner;

public class Source {
    public static int[] score(int[] a, int[] b, int[] res) {
        res[0] = ((a[0] > b[0]) ? 1 : 0) + ((a[1] > b[1]) ? 1 : 0) + ((a[2] > b[2]) ? 1 : 0);
        res[1] = ((a[0] < b[0]) ? 1 : 0) + ((a[1] < b[1]) ? 1 : 0) + ((a[2] < b[2]) ? 1 : 0);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        int[] res = new int[2];
        int i;
        for (i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        res = score(a, b, res);

        for (i = 0; i < 2; i++) {
            System.out.println(res[i]);
        }
    }

}