package patterns;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /**
         *        1
         *      3 2
         *    6 5 4
         * 10 9 8 7
         */

        while (i <= n) {
            int space = 1;
            while (space <= n - i){
                System.out.print(" ");
                space++;
            }
            int k = 1;
            while(k <= i){
                System.out.print(j);
                j++;
                k++;
            }
            System.out.println();
            i++;
        }

        /**
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         while(i <= n){
         int k = 1;
         while(k <= i){
         System.out.print(j + " ");
         j++;
         k++;
         }
         System.out.println();
         i++;
         }
         */

        /**
         * 1
         * 1 2
         * 1 2 3
         * 1 2 3 4
         while (i <= n){
         int k = 1;
         while (k <= i){
         System.out.print(k + " ");
         k++;
         }
         System.out.println();
         i++;
         }
         */
    }
}
