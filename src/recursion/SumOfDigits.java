package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234506));
    }
    static int sumOfDigits(int num){
        if (num/10 == 0){
            return num;
        }
        return num%10 + sumOfDigits(num/10);
    }
}
