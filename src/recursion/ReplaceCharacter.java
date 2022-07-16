package recursion;

public class ReplaceCharacter {
    public static void main(String[] args) {
        System.out.println(replaceChar("bababbc", 'b', 'o'));
    }
    static String replaceChar(String str, char c1, char c2){
        if (str.length() == 0){
            return "";
        }
        char c;
        if (str.charAt(0) == c1){
            c = c2;
        } else {
            c = str.charAt(0);
        }
        String ans = replaceChar(str.substring(1), c1,c2);
        return c + ans;
    }
}
