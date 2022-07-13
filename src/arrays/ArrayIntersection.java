package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntersection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows in first array: ");
        int len1 = scanner.nextInt();
        int[] arr1 = new int[len1];

        System.out.print("Enter the number of rows in second array: ");
        int len2 = scanner.nextInt();
        int[] arr2 = new int[len2];

        for (int i = 0; i < len1; i++){
            arr1[i] = scanner.nextInt();
        }

        for (int j = 0; j < len2; j++){
            arr2[j] = scanner.nextInt();
        }

        intersection(arr1, arr2);
    }

    static void intersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }
}
