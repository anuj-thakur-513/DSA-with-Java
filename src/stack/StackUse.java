package stack;

import java.util.Scanner;

public class StackUse {
    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(2);
        int[] arr = {5,6,7,8,9,0};
        for (int i: arr){
            stack.push(i);
        }

        System.out.println("Top: " + stack.top());

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
