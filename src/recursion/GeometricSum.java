package recursion;

public class GeometricSum {
    public static void main(String[] args) {
        System.out.println(geometricSum(3));
    }
    static float geometricSum(int input){
        if (input == 0){
            return 1;
        }
        return (float) (geometricSum(input-1) + 1/ Math.pow(2,input));
    }
}
