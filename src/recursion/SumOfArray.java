package recursion;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len;
        System.out.print("Enter the length of the array: ");
        len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            arr[i] = scanner.nextInt();
        }

        System.out.println(arraySum(arr));
    }
    static int arraySum(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }
        int[] tempArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, tempArr, 0, arr.length - 1);
        int smallAns = arraySum(tempArr);
        return arr[arr.length - 1] + smallAns;
    }
}
