package recursion;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(checkPalindrome(str));
    }
    static boolean checkPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)){
            return checkPalindrome(str.substring(1,str.length() - 1));
        } else {
            return false;
        }
    }
}
