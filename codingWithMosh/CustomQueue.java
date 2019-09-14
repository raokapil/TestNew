package codingWithMosh;

import java.util.Arrays;

public class CustomQueue {

    private int[] arr;
    int front = 0;
    int rear = 0;
    int count = 0;
    public CustomQueue(int size) {
        this.arr = new int[size];
    }

    private void enqueue(int item) {
        if (count == arr.length)
            throw new IllegalStateException();

        arr[rear] = item;
        rear = (rear+1) % arr.length;
        count++;
    }

    private int dequeue() {
        int item = arr[front];
        arr[front] = 0;
        front = (front+1) % arr.length;
        count--;
        return item;
    }

    private int peek() {
        return arr[front];
    }

    private boolean isEmpty() {
        return front == rear;
    }

    private boolean isFull() {
        return rear == arr.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.enqueue(5);
        customQueue.enqueue(7);
        customQueue.enqueue(1);
        customQueue.dequeue();
        customQueue.dequeue();
        customQueue.enqueue(6);
        customQueue.enqueue(9);
        customQueue.enqueue(10);
        customQueue.enqueue(11);

        System.out.println(customQueue);




    }
}
