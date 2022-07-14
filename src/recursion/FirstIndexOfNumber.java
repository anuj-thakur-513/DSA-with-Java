package recursion;

import java.util.Scanner;

public class FirstIndexOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of the array: ");
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to check: ");
        int num = scanner.nextInt();
        System.out.print(checkFirstIndex(arr,num));
    }

    static int checkFirstIndex(int[] arr,int element, int start){
        if (start == arr.length){
            return -1;
        }
        if(arr[start] == element){
            return start;
        }
        return checkFirstIndex(arr, element, start + 1);
    }
    static int checkFirstIndex(int[] arr, int element){
        return checkFirstIndex(arr, element, 0);
    }
}
