package recursion;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number and power: ");
        int num = scanner.nextInt();
        int pow = scanner.nextInt();
        System.out.println(power(num, pow));
    }

    static int power(int num, int pow){
        if (pow == 1){
            return num;
        }

        int smallAns = power(num, pow - 1);
        return num * smallAns;
    }
}
