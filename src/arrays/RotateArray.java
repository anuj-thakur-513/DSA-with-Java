package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number of elements you want the array to rotate by: ");
        int d = scanner.nextInt();
        rotateArray(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start, int end){
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void rotateArray(int[] arr, int d){
        reverse(arr, 0,arr.length - 1);
        reverse(arr,0, arr.length - d - 1);
        reverse(arr, arr.length - d, arr.length - 1);
    }
}
