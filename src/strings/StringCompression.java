package strings;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.next();
        System.out.println(compressString(input));
    }

    static String compressString(String str){
        String ans = "";
        int charCount = 1;
        for (int i = 0; i < str.length(); i++){
            if (i != str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    charCount++;
                    continue;
                }
            }
            if (charCount > 1){
                ans = ans + str.charAt(i);
                ans = ans + charCount;
                charCount = 1;
            } else {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }
}
