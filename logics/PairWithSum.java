package logics;

import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        findPairs(arr, target);
    }

    static void findPairs(int[] arr, int sum) {
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + sum + ":");
        for (int num : arr) {
            int complement = sum - num;
            if (set.contains(complement)) {
                System.out.println("(" + num + ", " + complement + ")");
            }
            set.add(num);
        }
    }
}

