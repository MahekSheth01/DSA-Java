package logics;

public class SubstringCounter {
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move index forward to avoid overlapping
        }

        return count;
    }

    public static void main(String[] args) {
        String mainStr = "ababab";
        String subStr = "ab";

        int result = countOccurrences(mainStr, subStr);
        System.out.println("Occurrences of \"" + subStr + "\": " + result);
    }
}

