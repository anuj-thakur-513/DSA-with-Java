package strings;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("hey my name is aurthor"));
    }

    static String reverseEachWord(String str) {
        String ans = "";
        int currentWordStart = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                // reverse current word
                int currentWordEnd = i - 1;
                String reversedWord = "";
                for (int j = currentWordStart; j <= currentWordEnd; j++) {
                    reversedWord = str.charAt(j) + reversedWord;
                }

                // add it to the final string(ans)
                ans += reversedWord + " ";
                currentWordStart = i + 1;
            }
        }

        int currentWordEnd = i - 1;
        String reversedWord = "";
        for (int j = currentWordStart; j <= currentWordEnd; j++) {
            reversedWord = str.charAt(j) + reversedWord;
        }
        ans += reversedWord;

        return ans;
    }
}
