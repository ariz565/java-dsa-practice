import java.util.*;

// class ariz {
//     static public void main(String[] args) {
//         System.out.println("100 rupyee bhejdio: ");
//     }
// }

// class ghazala {
//     public static void main(String[] args) {
//         System.out.println("100 rupyee nai dene k: ");
//     }
// }

// public class hello {
//     private Scanner sc;

//     public hello() {
//         sc = new Scanner(System.in);
//     }

//     public void readInput() {
//         String input = sc.nextLine();
//         System.out.println("you entered: " + input);
//     }

//     public static void main(String[] args) {
//         hello e = new hello();
//     }
// }

// import java.util.Scanner;

// public class hello {
//     private Scanner privateScanner;

//     public hello() {
//         privateScanner = new Scanner(System.in);
//     }

//     private void readInput() {
//         String input = privateScanner.nextLine();
//         System.out.println("You entered: " + input);
//     }

//     public static void main(String[] args) {
//         hello example = new hello();
//         example.readInput();
//     }
// }

// public class hello {
// public static void main(String[] args) {
// if(System.out.printf("Hello World") == null){

// }

// }
// }

// public class hello {
//     public static void main(String[] args) {
//         System.out.println("This is d standard main method:: ");
//     }
//     public static void main(int[] args) {
//         System.out.println("This is d overloaded main method:: ");
//     }
// }

// class hey {
//     static void makes() {
//         System.out.println("parent class");

//     }

//     public void cakes() {
//         System.out.println("lalal");
//     }
// }

// class bye extends hey {
//      static void makes() {
//         System.out.println("child class");
//     }
// }

// public class hello {
//     public static void main(String[] args) {

//         hey obj = new bye();
//         // bye obj1 = new bye();
//         obj.makes();

//         obj.cakes();

//     }
// }

//write a java program to find the sixth largest prime number
public class hello {
    public static void main(String[] args) {
        int n = 999999;
        for (int num = n; num > 1; num--) {
            if (isPrime(num)) {
                System.out.println(num);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
