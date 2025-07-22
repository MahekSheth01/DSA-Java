import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements of the array (Size)");
        int size=sc.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered Elements are : -");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
