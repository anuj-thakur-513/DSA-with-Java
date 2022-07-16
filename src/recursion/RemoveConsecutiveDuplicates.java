package recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(removeConsecutiveDuplicates(str));
    }
    static String removeConsecutiveDuplicates(String str){
        if (str.length() <= 1){
            return str;
        }

        if (str.charAt(0) == str.charAt(1)){
            return removeConsecutiveDuplicates(str.substring(1));
        } else {
            String small = removeConsecutiveDuplicates(str.substring(1));
            return str.charAt(0) + small;
        }
    }
}
