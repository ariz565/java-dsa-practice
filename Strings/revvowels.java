//write a java program to reverse vowels from a string

public class revvowels {
    // Java program to reverse order of vowels

    // utility function to check for vowel
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

    // Function to reverse order of vowels
    static String reverseVowel(String str1) {
        int j = 0;
        // Storing the vowels separately
        char[] str = str1.toCharArray();
        String vowel = "";
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                j++;
                vowel += str[i];
            }
        }

        // Placing the vowels in the reverse
        // order in the string
        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                str[i] = vowel.charAt(--j);
            }
        }

        return String.valueOf(str);
    }

    // Driver function
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseVowel(str));
    }
}

// This code is contributed by princiRaj1992

// public class revvowels {
// public static void main(String[] args) {
// String s = "hello world";
// String vowels = "aeiou";
// for (int i = 0; i < s.length(); i++) {
// char ch = s.charAt(i);
// if (vowels.contains(ch + "")) {
// System.out.print(ch);
// }
// }
// }
// }

// if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||
// s.charAt(i) == 'o'
// || s.charAt(i) == 'u') {
// System.out.print(s.charAt(i));
// }