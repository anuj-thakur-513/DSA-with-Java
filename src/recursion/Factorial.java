package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(factorial(5));
    }

    static int factorial(int num){
        if (num <= 1){
            return 1;
        }

        int smallAns = factorial(num - 1);

        return num * smallAns;
    }
}
