package logics;

import java.util.*;

public class MinSwapsToSort {
    public static int minSwaps(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;       
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][1] == i) continue;

            int cycleSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][1]; 
                cycleSize++;
            }

            swaps += (cycleSize - 1);
        }

        return swaps;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        System.out.println("Minimum swaps required: " + minSwaps(arr)); 
    }
}
