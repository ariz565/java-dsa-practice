import java.util.*;

public class PalindromStr {
    static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String s1 = "aziza";
        System.out.println(isPalindrome(s1));
    }
}
