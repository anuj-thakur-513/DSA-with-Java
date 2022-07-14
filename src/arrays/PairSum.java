package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        int len, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        len = scanner.nextInt();
        System.out.print("Enter the required sum: ");
        sum = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(pairSum(arr, sum));
    }

    static int pairSum(int[] arr, int sum) {
        int counter = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int j : arr) {
            if (j < sum) {
                int element = sum - j;
                if (m.containsKey(element)) {
                    counter += m.get(element);
                }
                m.putIfAbsent(j, 0);
                m.put(j, m.get(j) + 1);
            }
        }
        return counter;
    }
}
