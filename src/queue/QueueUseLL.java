package queue;

public class QueueUseLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        for (int elem : arr){
            queue.enqueue(elem);
        }

        while (!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
    }
}
