package multidimensional_arrays;

public class LargestColSum {
    public static void main(String[] args) {
        int[][] arr = FunctionsWith2dArrays.takeInput();
        int larColSum = largestColSum(arr);
        System.out.println("Largest sum of the columns is: " + larColSum);
    }

    static int largestColSum(int[][] arr){
        int largestSum = Integer.MIN_VALUE;
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < cols; i++){
            int sum = 0;
            for (int j = 0; j < rows; j++){
                sum += arr[j][i];
            }
            if (largestSum < sum){
                largestSum = sum;
            }
        }
        return largestSum;
    }
}
