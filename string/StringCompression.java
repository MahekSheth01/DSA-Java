package string;

public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i - 1)).append(count);
                count = 1; 
            }
        }

        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String input1 = "aaabbc";
        String input2 = "abcd";

        System.out.println("Compressed: " + compress(input1));
        System.out.println("Compressed: " + compress(input2)); 
    }
}
