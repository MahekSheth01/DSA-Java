package logics;

public class LongestWordFinder {
    public static void main(String[] args) {
        String sentence = "Java is powerful and elegant";
        String[] words = sentence.split(" ");
        
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
