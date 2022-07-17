package recursion;

public class RemoveX {
    public static void main(String[] args) {
        System.out.println(removeX("xxx"));
    }

    static String removeX(String str){
        if (str.length() == 0){
            return str;
        }

        if (str.charAt(0) == 'x'){
            return removeX(str.substring(1));
        }
        return str.charAt(0) + removeX(str.substring(1));
    }
}
