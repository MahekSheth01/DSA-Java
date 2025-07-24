package logics;

public class PerfectSquareCheck {
    public static void main(String[] args) {
        int num = 49;
        boolean isPerfectSquare = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square");
        } else {
            System.out.println(num + " is not a perfect square");
        }
    }
}
