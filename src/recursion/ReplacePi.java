package recursion;

import java.util.Scanner;

public class ReplacePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(replacePi(input));
    }
    static String replacePi(String str){
        if (str.length() <= 1){
            return str;
        }

        String ans = "";
        String small = replacePi(str.substring(1));
        if (str.charAt(0) == 'p' && small.charAt(0) == 'i'){
            ans = "3.14" + small.substring(1);
        } else {
            ans = str.charAt(0) + small;
        }
        return ans;
    }
}
