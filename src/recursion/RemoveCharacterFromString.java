package recursion;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        System.out.println(removeChar("xabdzx", 'x'));
    }
    static String removeChar(String str, char x){
        if (str.isEmpty()){
            return str;
        }
        String ans = "";
        if (str.charAt(0) != x){
            ans = ans + str.charAt(0);
        }

        String smallAns = removeChar(str.substring(1), x);
        return ans + smallAns;
    }
}
