package recursion;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(stringToInt("1231"));
    }
    static int stringToInt(String input){
        if (input.length() == 1){
            return input.charAt(0) - '0';
        }

        int smallOutput = stringToInt(input.substring(0, input.length() - 1));
        int lastDigit = input.charAt(input.length() - 1) - '0';
        return smallOutput*10 + lastDigit;
    }
}