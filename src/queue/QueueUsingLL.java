package queue;

import linked_list.Node;

public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(T elem){
        size++;
        Node<T> newNode = new Node<>(elem);

        if (front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public Object front(){
        if (isEmpty()){
            return -1;
        }
        return front.data;
    }

    public Object dequeue(){
        if (isEmpty()){
            return -1;
        }
        T ans = front.data;
        front = front.next;
        size--;
        return ans;
    }
}
