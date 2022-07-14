package recursion;

import java.util.Scanner;

public class CheckNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of the array: ");
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int num = scanner.nextInt();
        System.out.println(checkNum(arr, num, 0));
    }

    static boolean checkNum(int[] arr, int element, int start){
        if (start == arr.length){
            return false;
        }
        if (arr[start] == element){
            return true;
        }
        return checkNum(arr, element, start + 1);
    }
}
