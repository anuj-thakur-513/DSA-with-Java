package strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string to check: ");
        str = scanner.next();
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
        int start = 0, end = str.length() - 1;

        while(start <= end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
