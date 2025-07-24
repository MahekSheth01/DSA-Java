package logics;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int n = arr.length;
        int index = 0; // Position to place non-zero element

        // Step 1: Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        // Print result
        System.out.print("Array after moving zeros: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
