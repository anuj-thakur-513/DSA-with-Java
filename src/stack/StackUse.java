package stack;

import java.util.Scanner;

public class StackUse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        StackUsingArray stack = new StackUsingArray(size);
        stack.push(10);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());
        stack.pop();
    }
}
