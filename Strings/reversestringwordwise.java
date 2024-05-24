//reverse string word wise
// public class reversestringwordwise {
//     public static void main(String[] args) {
//         String str = "Welcome to Coding Ninjas";
//         String ans = "";
//         int i = str.length() - 1;
//         while (i >= 0) {
//             while (i >= 0 && str.charAt(i) == ' ')
//                 i--;
//             int j = i;
//             if (i < 0)
//                 break;
//             while (i >= 0 && str.charAt(i) != ' ')
//                 i--;
//             if (ans.isEmpty())
//                 ans = ans.concat(str.substring(i + 1, j + 1));
//             else
//                 ans = ans.concat(" " + str.substring(i + 1, j + 1));
//         }
//         System.out.println(ans);
//     }  
// }

//

import java.util.ArrayList;
import java.util.List;

public class reversestringwordwise{
     public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");

        // Reverse the order of the words
        List<String> reversedWords = new ArrayList<>();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.add(words[i]);
        }

        // Join the reversed words into a string
        return String.join(" ", reversedWords);
    }

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(reverseWords(str)); // world hello
    }

}

