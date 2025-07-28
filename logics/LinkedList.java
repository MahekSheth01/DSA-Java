package logics;
import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Access elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        // Remove element
        list.remove("Banana");

        // Iterate
        System.out.println("Updated List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
