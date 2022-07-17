package recursion;

import java.util.Scanner;

public class PairStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(pairStar(input));
    }
    static String pairStar(String str){
        if (str.length() <= 1){
            return str;
        }
        String ans = pairStar(str.substring(1));
        if (str.charAt(0) == str.charAt(1)){
            ans = str.charAt(0) + "*" + str.charAt(1) + ans.substring(1);
        } else {
            ans = str.charAt(0) + ans;
        }
        return ans;
    }
}
