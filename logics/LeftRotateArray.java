package logics;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of steps to rotate

        int n = arr.length;

        // Adjust k if greater than n
        k = k % n;

        // Temporary array to store rotated version
        int[] rotated = new int[n];

        // Move elements from index k to end to the front
        int index = 0;
        for (int i = k; i < n; i++) {
            rotated[index++] = arr[i];
        }

        // Move first k elements to the end
        for (int i = 0; i < k; i++) {
            rotated[index++] = arr[i];
        }

        // Print rotated array
        System.out.print("Array after " + k + " left rotations: ");
        for (int i = 0; i < n; i++) {
            System.out.print(rotated[i] + " ");
        }
    }
}

