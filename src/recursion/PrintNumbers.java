package recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumbers(n);
    }

    static void printNumbers(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
