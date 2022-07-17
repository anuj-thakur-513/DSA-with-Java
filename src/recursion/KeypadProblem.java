package recursion;

public class KeypadProblem {
    public static void main(String[] args) {

    }

    static String[] getString(int d) {
        if (d <= 1 || d > 10) {
            System.exit(0);
        }
        if (d == 2) {
            return new String[]{"a", "b", "c"};
        }
        else if (d == 3) {
            return new String[]{"d", "e", "f"};
        }
        else if (d == 4) {
            return new String[]{"g", "h", "i"};
        }
        else if (d == 5) {
            return new String[]{"j", "k", "l"};
        }
        else if (d == 6) {
            return new String[]{"m", "n", "o"};
        }
        else if (d == 7) {
            return new String[]{"p", "q", "r", "s"};
        }
        else if (d == 8) {
            return new String[]{"t", "u", "v"};
        }
        else {
            return new String[]{"w", "x", "y", "z"};
        }
    }

    static String[] keypad(int n){
        if (n == 0){
            return new String[]{" "};
        }
        String[] smallerNumberArray = keypad(n/10);
        String[] singleDigitOutput = getString(n%10);
        String[] output = new String[singleDigitOutput.length * smallerNumberArray.length];
        int k = 0;
        for (String s : singleDigitOutput) {
            for (String value : smallerNumberArray) {
                output[k++] = value + s;
            }
        }
        return output;
    }
}
