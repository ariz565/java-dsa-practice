// class Animal {
//     public int show(int xyz) {
//         System.out.println("Base Class");
//         return xyz;
//     }
// }

// class horse extends Animal {
//     @Override
//     public int show(int n) {
//         System.out.println("Derived class");
//         return n;
//     }
// }


// public class temp {
//     public static void main(String[] args) {
//         Animal obj1 = new Animal();
//         horse obj2 = new horse();
//         Animal obj = new horse();
//         obj.show(10.00);
//         obj1.show(20);
//         obj2.show(30);
//     }
// }

//write a java program to reverse the vowels in a string
public class temp {
    public static void main(String[] args) {
        String str = "hello world";
        int i = 0;
        int j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            if (isVowel(arr[i]) && isVowel(arr[j])) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (isVowel(arr[i])) {
                j--;
            } else if (isVowel(arr[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        System.out.println(arr);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}