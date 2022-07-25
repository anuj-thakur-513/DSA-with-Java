package queue;

import java.util.Queue;

public class QueueUsingArray {
    private int[] data;
    private int front; // index of element at front of the queue
    private int rear; // index of element at rear of the queue
    private int size;

    public QueueUsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public QueueUsingArray(int size) {
        data = new int[size];
        front = -1;
        rear = -1;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) throws QueueFullException {
        if (size == data.length){
            throw new QueueFullException();
        }
        if(size == 0){
            front = 0;
        }
        // rear++;
        // this makes the queue circular
        rear = (rear + 1) % data.length;
        data[rear] = elem;
        size++;
    }

    public int front() {
        if (size != 0) {
            return data[front];
        } else {
            return -1;
        }
    }

    public int dequeue() throws EmptyQueueException {
        if (size == 0){
            throw new EmptyQueueException();
        }
        int temp = data[front];
        // front++;
        // this makes the queue circular
        front = (front + 1) % data.length;
        size--;
        if (size == 0){
            front = -1;
            rear = -1;
        }
        return temp;
    }
}
