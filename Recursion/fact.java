
//java program to find factorial of a number using recursion
import java.util.*;
// public class fact {
//     public static int fact(int n) {

//         if(n==0){
//         return 1;
//     }
//         int smallAns = fact(n-1);
//         return n*smallAns;
//     }

//     public static void main(String[] args) {
//         int n=3;
//         int ans=fact(n);
//         System.out.println(ans);
//     }

// }

public class fact {

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int smallAns = factorial(n - 1);
        return n * smallAns;
    }

    static public void main(String[] args) {
        System.out.println("Enter the number to find its factorial: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }
}