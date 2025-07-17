public class P2 {
    public static void main(String[] args) {
        int n = 3;

        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("*");
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++)
                System.out.print(" ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
