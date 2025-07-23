package logics;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,5,6,2,1}; // Missing number is 3
        int n = 6; // Total numbers from 1 to N

        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }

        int missing = totalSum - arraySum;

        System.out.println("Missing number is: " + missing);
    }
}

