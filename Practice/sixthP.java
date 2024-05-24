// Given a no. 123456789 prints the sum of each digit in no. using recursion with time complexity explanation.

// import java.util.Scanner;
// public class sixthP {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a no. : ");
//         int n = sc.nextInt();
//         System.out.println("Sum of digits of " + n + " is " + sum(n));
//         sc.close();
//     }

//     public static int sum(int n) {
//         if (n == 0)
//             return 0;
//         return n % 10 + sum(n / 10);
//     }
// }

// write a java program to find six digit largest prime number

// This is a single-line comment
/* This is a multi-line comment
   that can span multiple lines */

// This is a public class named sixthP
public class sixthP {
    // This is the main method that runs when the program is executed
    public static void main(String[] args) {
        // This is a variable that stores the initial value of n
        int n = 999999;
        // This is a while loop that runs until n becomes zero or less
        while (n > 0) {
            // This is an if statement that checks if n is a prime number by calling the isPrime method
            if (isPrime(n)) {
                // This is a print statement that prints the value of n to the standard output
                System.out.println(n);
                // This is a break statement that exits the loop
                break;
            }
            // This is a decrement operator that reduces the value of n by one
            n--;
        }
    }
    // This is a public static method that returns a boolean value indicating if a given number is prime or not
    public static boolean isPrime(int n) {
        // This is a for loop that iterates from 2 to n - 1
        for (int i = 2; i < n; i++) {
            // This is an if statement that checks if n is divisible by i
            if (n % i == 0)
                // This is a return statement that returns false if n is not prime
                return false;
        }
        // This is a return statement that returns true if n is prime
        return true;
    }
}


// public class sixthP {
//     public static void main(String[] args) {
//         int largestnumber = 999983; // the largest 6-digit prime number
//         int largestprime = 0; // to store the 6th largest prime number
//         int count = 0; // to count how many prime numbers we have found
//         for (int i = largestnumber; i > 0; i--) {
//             boolean isPrime = true; // to check if i is prime or not
//             for (int j = 2; j <= Math.sqrt(i); j += 2) { // loop up to the square root of i, skip even numbers
//                 if (i % j == 0) { // if i is divisible by j, it is not prime
//                     isPrime = false;
//                     break;
//                 }
//                 if (j == 2) { // special case for j = 2, increment by 1 instead of 2
//                     j++;
//                 }
//             }
//             if (isPrime) { // if i is prime, increment the counter and check if we have reached the 6th one
//                 count++;
//                 if (count == 6) {
//                     largestprime = i; // assign i to largestprime and break the loop
//                     break;
//                 }
//             }
//         }
//         System.out.println(largestprime); // print the result
//     }
// }
