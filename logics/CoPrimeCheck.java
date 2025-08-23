package logics;
public class CoPrimeCheck {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static boolean isCoPrime1(int a, int b) {
        return gcd(a, b) == 1;
    }

    public static void main(String[] args) {
        System.out.println(isCoPrime1(14, 15)); 
        System.out.println(isCoPrime1(14, 21));
    }
}
