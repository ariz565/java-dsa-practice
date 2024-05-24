// Write a function to find out duplicate words in a given string

public class duplicateWords {
    public static void main(String[] args) {
        String str = "Hello, what's up, hello hello";
        int count = 0;

        str = str.toLowerCase();
       
        String words[] = str.split(" ");
        System.out.println("Duplicate words in a given string : ");

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i+1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j]="0";
                }
            }
            if (count > 1 && words[i] != "0")
            System.out.println(words[i]);
        }
    }
}
