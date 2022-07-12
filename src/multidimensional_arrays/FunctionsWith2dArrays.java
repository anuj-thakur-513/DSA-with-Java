package multidimensional_arrays;

import java.util.Scanner;

public class FunctionsWith2dArrays {
    public static void main(String[] args) {
        int[][] input = takeInput();
        print2dArray(input);
    }

    static int[][] takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int cols = scanner.nextInt();

        int[][] arr2d = new int[rows][cols];

        for (int i = 0; i < arr2d.length; i++){
            for (int j = 0; j < arr2d[0].length; j++){
                arr2d[i][j] = scanner.nextInt();
            }
        }

        return arr2d;
    }

    static void print2dArray(int[][] arr2d){
        for (int[] ints : arr2d) {
            for (int j = 0; j < arr2d[0].length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}
