// import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        String s = "egg";
        String t = "add";
        System.out.println(checkiso(s, t));
    }

    static boolean checkiso(String s, String t) {
        int[] arr = new int[128];
        int[] arr2 = new int[128]; 
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = t.charAt(i);
            // swapping
            if (arr[c] == 0 && arr[d] == 0) {
                arr[c] = d;
                arr2[d] = c;
            } else if (arr[c] != d || arr[d] != c) {
                return false;
            }
        }
        return true;
    }
}