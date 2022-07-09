package strings;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(reverse(str));
    }

    static String reverse(String str) {
        String reversedString = "";
        char ch;
        if(str.length() == 1 || str.length() == 0){
            return str;
        }

        for (int i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            reversedString = new StringBuilder().append(ch).append(reversedString).toString();
        }

        return reversedString;
    }
}
