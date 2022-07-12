package multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CreationOf2dArrays {
    public static void main(String[] args) {
        int[][] arr2d = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[0].length; j++){
                arr2d[i][j] = scanner.nextInt();
            }
        }

        for (int[] ints : arr2d) {
            for (int j = 0; j < arr2d[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
