package strings;

public class ReverseWordWise {
    public static void main(String[] args) {
        System.out.println(reverseWordWise("hey my name is aurthor"));
    }

    static String reverseWordWise(String input){
        int end = input.length();
        int i = input.length() - 1;
        String output = "";
        while (i >= 0){
            if (input.charAt(i) == ' '){
                output = output + input.substring(i + 1, end) + " ";
                end = i;
            }
            i--;
        }
        output += input.substring(i+1, end);
        return output;
    }
}