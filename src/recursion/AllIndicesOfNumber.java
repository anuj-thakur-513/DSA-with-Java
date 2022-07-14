package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class AllIndicesOfNumber {
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
        ArrayList ans = new ArrayList();
        System.out.print(allIndices(arr, ans, num, 0));
    }
    static ArrayList allIndices(int[] arr, ArrayList ans, int element, int start){
        if (start == arr.length){
            return ans;
        }
        if (arr[start] == element){
            ans.add(start);
        }
        return allIndices(arr, ans, element, start + 1);
    }
}
