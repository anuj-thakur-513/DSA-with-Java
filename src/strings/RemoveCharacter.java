package strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        System.out.println(removeCharacter("xxyyzxx", 'y'));
    }

    static String removeCharacter(String str, char ch){
        String ans = "";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ch){
                continue;
            }
            ans = ans + str.charAt(i);
        }
        return ans;
    }
}
