package searching_and_sorting;

public class QuickSort {
    public static void main(String[] args) {

    }

    static int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = start + 1; i < end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotIndex = start + count;
        arr[start] = arr[pivotIndex];
        arr[pivotIndex] = pivot;
        int i = start, j = end;
        while (i < j) {
            while (i <= end && arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int partitionIndex = partition(arr, start, end);
        quickSort(arr, start, partitionIndex - 1);
        quickSort(arr, partitionIndex + 1, end);
    }
}
