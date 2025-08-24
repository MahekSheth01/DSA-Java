package logics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum1 = 0;

        while (num > 0) {
            int digit = num % 10;
            sum1 += digit * digit * digit;
            num = num / 10;
        }

        if (sum1 == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
