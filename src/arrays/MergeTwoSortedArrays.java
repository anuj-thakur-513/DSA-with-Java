package arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    static int[] mergeSorted(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int x = arr1.length, y = arr2.length;
        int[] arrAns = new int[x + y];

        while(i < x && j < y){
            if(arr1[i] <= arr2[j]){
                arrAns[k++] = arr1[i++];
            }
            if(arr1[i] > arr2[j]){
                arrAns[k++] = arr2[j++];
            }
        }

        while(i < x){
            arrAns[k++] = arr1[i++];
        }

        while (j < y){
            arrAns[k++] = arr2[j++];
        }

        return arrAns;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,6,9,15};
        int[] arr2 = {1,4,6,7};

        System.out.println(Arrays.toString(mergeSorted(arr1, arr2)));
    }
}
