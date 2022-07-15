package recursion;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(multiply(a,b));
    }
    static int multiply(int a, int b){
        if (b <= 1){
            return a * b;
        }
        int smallAns = multiply(a, b - 1);
        return a + smallAns;
    }
}
