package strings;

public class RemoveConsecutiveDuplicates {
    public static void main(String[] args) {
        String input = "xxyyzx";
        System.out.println(removeConsecutiveDuplicates(input));
    }

    static String removeConsecutiveDuplicates(String str){
        if (str.length() == 1){
            return str;
        }

        String ans = "";
        for (int i = 0; i < str.length(); i++){
            if (i != str.length() - 1) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    continue;
                }
            }
            ans = ans + str.charAt(i);
        }
        return ans;
    }
}
