package logics;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 1, 5, 1};
        int[] freq = new int[arr.length];
        boolean visited;

        for (int i = 0; i < arr.length; i++) {
            visited = false;

            // Check if element already counted
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }

            if (!visited) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println("Element " + arr[i] + " occurs " + count + " times");
            }
        }
    }
}
