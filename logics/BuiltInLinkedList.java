package logics;
import java.util.LinkedList;

public class BuiltInLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());

        list.remove("Banana");

        System.out.println("Updated List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
