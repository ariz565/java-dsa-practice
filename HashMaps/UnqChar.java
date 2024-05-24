//given a string s, you need to remove all the duplicates. That means, the output string should contain each character only once. The respective order of characters should remain same, as in the input string.

// import java.util.Scanner;

// public class UnqChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the New String: ");
//         String str = sc.nextLine();
//         // for (int i = 0; i < str.length(); i++) {
//         //     char ch = str.charAt(i);  **For finding Unique Characters elimnating dublicate
//         //     if (str.indexOf(ch) == str.lastIndexOf(ch)) {
//         //         System.out.print(ch);
//         //     }

//         char[] ch = str.toCharArray();

//         for (int i = 0; i < str.length(); i++) {
//             boolean flag = false;
//             for (int j = 0; j < i; j++) {
//                 if (ch[i] == ch[j]) {
//                     flag = true;
//                     break;
//                 }
//             }
//             if (flag == false) {
//                 System.out.print(ch[i]);
            
//         }
            
//         }
//     }
// }

import java.util.HashMap;
import java.util.Scanner;

public class UnqChar {
//    public void uniqueChar(String str) {
//         HashMap<Character, Integer> map = new HashMap<>();
//         for (int i = 0; i < str.length(); i++) {
//              char ch = str.charAt(i);
//              if (map.containsKey(ch)) {
//                 int val = map.get(ch);
//                 map.put(ch, val + 1);
//              } else {
//                 map.put(ch, 1);
//              }
//         }
//         for (int i = 0; i < str.length(); i++) {
//              char ch = str.charAt(i);
//              if (map.get(ch) == 1) {
//                 System.out.print(ch);
//              }
//         }
//    }

// public void uniqueChar(String str) {
//     HashMap <Character, Integer> map = new HashMap<>();
//     for (int i=0; i < str.length(); i++) {
//         char ch = str.charAt(i);

//         if(map.containsKey(ch)) {
//             int val = map.get(ch);
//             map.put(ch, val+1);
//         }
//         else {
//             map.put(ch, 1);
//         }
//     }
//     for (int i = 0; i < str.length(); i++) {
//         char ch = str.charAt(i);
//         if(map.get(ch)==1) {
//             System.out.print(ch);
//         }
//     }
// }


//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//           System.out.println("Enter the New String: ");
//           String str = sc.nextLine();
//           UnqChar obj = new UnqChar();
//           obj.uniqueChar(str);
//     }
// }


//java program to print duplicate characters at least once

public static String uniqueCharacters(String str){
    if (str.length()==0){
        return "";
    }
    String ans="";
    HashMap <Character, Boolean> map = new HashMap<>();
    for(int i=0; i<str.length();i++){
        char ch=str.charAt(i);
        if(!map.containsKey(i)){
            map.put(ch,true);    //if the character is not present in the map then put it in the map
        ans+=ch;
        }
    }
    return ans;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String str = sc.nextLine(); 
    System.out.println(uniqueCharacters(str));
}
}