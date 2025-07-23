package logics;

public class AnagramString {
    public static void main(String[] args) {
        String str1 = "ssob";
        String str2 = "boss";

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagrams");
            return;
        }

        int[] count = new int[26]; // For lowercase letters a-z

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++; // Increment for str1
            count[str2.charAt(i) - 'a']--; // Decrement for str2
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("Strings are not anagrams");
                return;
            }
        }

        System.out.println("Strings are anagrams");
    }
}

