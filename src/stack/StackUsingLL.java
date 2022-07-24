package stack;

import linked_list.Node;

import java.util.EmptyStackException;

public class StackUsingLL<T> {
    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(T elem){
        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T top(){
        if (head == null){
            throw new EmptyStackException();
        }
        return head.data;
    }

    public T pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        T val = head.data;
        head = head.next;
        size--;
        return val;
    }
}
