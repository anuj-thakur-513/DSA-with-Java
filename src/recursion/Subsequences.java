package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        printSubsequences(input);
        System.out.println();
        System.out.println(Arrays.toString(findSubsequences(input)));
    }

    static String[] findSubsequences(String str) {
        if (str.length() == 0) {
            return new String[]{""};
        }

        String[] smallAns = findSubsequences(str.substring(1));
        String[] ans = new String[2 * smallAns.length];

        int k = 0;
        for (String smallAn : smallAns) {
            ans[k++] = smallAn;
        }

        for (String smallAn : smallAns) {
            ans[k++] = str.charAt(0) + smallAn;
        }

        return ans;
    }

    // optimal solution without using extra space
    static void printSubsequences(String str) {
        printSubsequences(str, "");
    }

    static void printSubsequences(String str, String outputSoFar){
        if (str.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        // we choose not to include the first character
        printSubsequences(str.substring(1), outputSoFar);
        // we choose to include the first character
        printSubsequences(str.substring(1), outputSoFar + str.charAt(0));
    }
}
