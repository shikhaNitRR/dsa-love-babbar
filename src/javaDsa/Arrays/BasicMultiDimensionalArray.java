package javaDsa.Arrays;
import java.util.Scanner;

public class BasicMultiDimensionalArray {
    public static void main(String[] args) {

        System.out.println("Jagged Array: Allows each row to contain a different number of elements ");
        int rows = 2;

        int[][] arr = new int[rows][];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter column size for row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
            System.out.println("Enter value : ");
            for (int j = 0; j < arr[i].length; j++) {
                int p = sc.nextInt();
                arr[i][j] = p;
            }
        }
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        int mul = 1;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                mul *= arr[i][j];

            }
            // System.out.println(sum);
        }
        System.out.println("Total Sum = " + sum);
        System.out.println("Total Mul = " + mul);

        int max =arr[0][0];
        int min=arr[0][0];
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j]) {
                    max=arr[i][j];
                }
                if(min>arr[i][j]) {
                    min=arr[i][j];
                }

            }
        }
        System.out.println("min : "+min);
        System.out.println("max : "+max);

    }
}
