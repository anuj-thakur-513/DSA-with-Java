package recursion;

import java.util.Scanner;

public class LastIndexOfNumber {
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
        System.out.print(lastIndex(arr, num, 0));
    }
    static int lastIndex(int[] arr, int element, int start){
        if (start == arr.length){
            return -1;
        }
        int smallAns = lastIndex(arr, element, start + 1);
        if (smallAns != -1){
            return smallAns;
        }
        if (arr[start] == element){
            return start;
        } else {
            return -1;
        }
    }
}
