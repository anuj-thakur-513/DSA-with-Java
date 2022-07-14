package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print("Enter element " + i + " of the array: ");
            arr[i] = scanner.nextInt();
        }
        System.out.println(unique(arr));
        System.out.println(uniqueOptimised(arr));
    }

    // time complexity -> O(n*log(n))
    static int unique(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        Arrays.sort(arr);
        int i = 0;

        while (i < arr.length) {
            if(i < arr.length - 1) {
                if (arr[i] == arr[i + 1]) {
                    i = i + 2;
                    continue;
                }
            } else if (i == arr.length - 1){
                break;
            }
            break;
        }

        return arr[i];
    }

    // time complexity -> O(n)
    static int uniqueOptimised(int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans = ans ^ j;
        }
        return ans;
    }
}
