package strings;

public class PrintSubstrings {
    public static void main(String[] args) {
        PrintSubstrings printSubstrings = new PrintSubstrings();
        String output = "";
        printSubstrings.substrings("abc", output);
    }

    void substrings(String str, String output){
        if (str.length() == 0){
            System.out.println(output);
            return;
        }
        substrings(str.substring(1), output);
        substrings(str.substring(1), output + str.charAt(0));
    }
}
