package stack;

public class StackUsingArray {
    private int[] data;
    // index of topmost element of the stack
    private int topIndex;

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * (temp.length)];
        System.arraycopy(temp, 0, data, 0, temp.length);
    }

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public void push(int elem) {
        if (isFull()) {
            doubleCapacity();
        }
        data[++topIndex] = elem;
    }

    public int size() {
        return topIndex + 1;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return data[topIndex];
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            return data[topIndex--];
        }
    }

    public boolean isFull() {
        return topIndex == data.length - 1;
    }

    public boolean isEmpty() {
        return topIndex == -1;
    }
}
