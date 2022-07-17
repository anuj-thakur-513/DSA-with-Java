package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class KeypadProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] ans = keypad(n);
        System.out.println(ans.length);
        System.out.println(Arrays.toString(ans));
        printKeypad(n);
    }

    static String[] getString(int d) {
        if (d <= 1 || d > 10) {
            return new String[]{""};
        }
        if (d == 2) {
            return new String[]{"a", "b", "c"};
        }
        else if (d == 3) {
            return new String[]{"d", "e", "f"};
        }
        else if (d == 4) {
            return new String[]{"g", "h", "i"};
        }
        else if (d == 5) {
            return new String[]{"j", "k", "l"};
        }
        else if (d == 6) {
            return new String[]{"m", "n", "o"};
        }
        else if (d == 7) {
            return new String[]{"p", "q", "r", "s"};
        }
        else if (d == 8) {
            return new String[]{"t", "u", "v"};
        }
        else {
            return new String[]{"w", "x", "y", "z"};
        }
    }

    static String[] keypad(int n){
        if (n == 0){
            return new String[]{""};
        }
        String[] smallerNumberArray = keypad(n/10);
        String[] singleDigitOutput = getString(n%10);
        String[] output = new String[singleDigitOutput.length * smallerNumberArray.length];
        int k = 0;
        for (String s : singleDigitOutput) {
            for (String value : smallerNumberArray) {
                output[k++] = value + s;
            }
        }
        return output;
    }

    static void printKeypad(int input){
        printKeypad(input, "");
    }

    static void printKeypad(int n, String output){
        if (n == 0){
            System.out.println(output);
            return;
        }

        String[] singleDigitOutput = getString(n % 10);
        for (String s : singleDigitOutput) {
            printKeypad(n / 10, s + output);
        }
    }
}
