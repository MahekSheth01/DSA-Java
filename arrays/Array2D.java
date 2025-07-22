import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of rows and columns:");
        int row = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] num = new int[row][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int x = 2;
        boolean found = false;

        System.out.println("Searching for number " + x + "...");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (num[i][j] == x) {
                    System.out.print("Number " + x + " found at position: [" + i + "][" + j + "]");
                    found = true;
                }

            }
            System.out.println();
        }

        if (!found) {
            System.out.println("Number " + x + " not found in the array.");
        }

        sc.close();
    }
}
