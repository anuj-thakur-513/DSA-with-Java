package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of the array: ");
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(duplicateElement(arr));
        System.out.println(duplicateOptimised(arr));
    }

    // time complexity -> O(n*log(n))
    static int duplicateElement(int[] arr){
        Arrays.sort(arr);
        int i = 0, j = 1;

        while (j < arr.length){
            if (arr[i] != arr[j]){
                i++;
                j++;
            } else {
                break;
            }
        }
        return arr[j];
    }

    // time complexity -> O(n)
    static int duplicateOptimised(int[] arr){
        int n = arr.length;
        int sum = ((n-2) * (n-1))/2;
        int arrSum = 0;
        for (int j : arr) {
            arrSum += j;
        }
        return arrSum - sum;
    }
}
