import java.util.Scanner;
import java.util.HashMap;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // eggu
        String t = sc.next();// add
        System.out.println(checkiso(s, t));
    }

    static boolean checkiso(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        int[] arr = new int[128];
        int[] arr2 = new int[128]; // foo bar
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            if (map.containsKey(c)) {
                if (map.get(c) != d) {
                    return false;
                } else {
                    if (map.containsValue(d)) {
                        return false;
                    }
                    map.put(c, d);
                }
            }

        }
        return true;
    }
}
            // swapping
//             if (arr[c] == 0 && arr2[d] == 0) {
//                 arr[c] = d;
//                 arr2[d] = c;
//             } else if (arr[c] != d || arr2[d] != c) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }