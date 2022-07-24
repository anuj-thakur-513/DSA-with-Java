package stack;

public class StackUse_LL {
    public static void main(String[] args) {
        StackUsingLL<Integer> stack = new StackUsingLL<>();
        int[] arr = {5,6,7,8,8,9};
        for (int i: arr){
            stack.push(i);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
