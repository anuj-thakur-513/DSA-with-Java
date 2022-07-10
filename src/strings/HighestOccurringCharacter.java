package strings;

public class HighestOccurringCharacter {
    public static void main(String[] args) {
        String input = "xy";
        System.out.println(highestOccurring(input));
    }

    static char highestOccurring(String str){
        int[] frequency = new int[256];
        int ans = 0;
        int helper = Integer.MIN_VALUE;
        for (int i = 0; i < 256; i++){
            frequency[i] = 0;
        }

        for (int i = 0; i < str.length(); i++){
            ++frequency[str.charAt(i)];
        }

        for (int i = 0; i < 256; i++){
            if (frequency[i] > helper){
                helper = frequency[i];
                ans = i;
            }
        }

        return (char)ans;
    }
}
