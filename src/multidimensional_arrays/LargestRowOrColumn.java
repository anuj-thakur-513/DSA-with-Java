package multidimensional_arrays;

public class LargestRowOrColumn {
    public static void main(String[] args) {
        int[][] input = FunctionsWith2dArrays.takeInput();
        largestRowCol(input);
    }

    static void largestRowCol(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;

        int rowSum = Integer.MIN_VALUE;
        int colSum = Integer.MIN_VALUE;

        int rowIndex = -1;
        int colIndex = -1;

        for (int i = 0; i < rows; i++){
            int sum = 0;
            for (int j = 0; j < cols; j++){
                sum += arr[i][j];
            }
            if (rowSum < sum) {
                rowSum = sum;
                rowIndex = i;
            }
        }

        for (int i = 0; i < cols; i++){
            int sum = 0;
            for (int[] ints : arr) {
                sum += ints[i];
            }
            if (colSum < sum) {
                colSum = sum;
                colIndex = i;
            }
        }

        if (rowSum >= colSum) {
            System.out.println("row " + rowIndex + " " + rowSum);
        } else {
            System.out.println("column " + colIndex + " " + colSum);
        }
    }
}
