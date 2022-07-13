package arrays;

import java.util.Scanner;

public class ArrayEquilibrium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in the array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(arrayEquilibrium(arr));
    }

    static int arrayEquilibrium(int[] arr){
        int rightSum = 0, leftSum = 0;

        for (int j : arr) {
            rightSum += j;
        }

        for (int i = 0; i < arr.length; i++){
            rightSum -= arr[i];

            if (leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
