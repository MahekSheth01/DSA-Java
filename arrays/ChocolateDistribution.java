// Java program to solve chocolate distribution


import java.util.Arrays;

class ChocolateDistribution {

    static int findMinDiff(int[] arr, int m) {
        int n = arr.length;

        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {

            int diff = arr[i + m - 1] - arr[i];

            if (diff < minDiff)
                minDiff = diff;
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int m = 3;

        System.out.println(findMinDiff(arr, m));
    }
}