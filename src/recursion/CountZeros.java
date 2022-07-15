package recursion;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeroes(708000));
    }
    static int countZeroes(int num){
        if (num < 10){
            if (num == 0){
                return 1;
            } else {
                return 0;
            }
        }
        if (num % 10 == 0){
            return countZeroes(num/10)+1;
        } else {
            return countZeroes(num/10);
        }
    }
}
