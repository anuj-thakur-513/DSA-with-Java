package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SwapPairs {

    static final void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void swapPairs(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size - 1; i = i + 2){
            swap(arr, i, i + 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,3,6,12,4,32,5,11,19};
        System.out.println(Arrays.toString(arr));
        swapPairs(arr);
        System.out.println(Arrays.toString(arr));
    }
}
