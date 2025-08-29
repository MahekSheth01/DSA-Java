package logics;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int fact1=1;
        for(int i=1;i<=n;i++){
            fact1=fact1*i;
        }
        System.out.println(fact1);
    }
}
