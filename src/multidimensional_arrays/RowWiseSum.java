package multidimensional_arrays;

public class RowWiseSum {
    public static void main(String[] args) {
        int[][] input = FunctionsWith2dArrays.takeInput();
        rowWiseSum(input);
    }

    static void rowWiseSum(int[][] mat){
        int rows = mat.length;
        if (rows == 0){
            return;
        }

        int cols = mat[0].length;

        for (int[] ints : mat) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum += ints[j];
            }

            System.out.print(rowSum + " ");
        }
    }
}
