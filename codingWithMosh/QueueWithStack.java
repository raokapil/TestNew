package codingWithMosh;

import java.util.Arrays;
import java.util.Stack;

public class QueueWithStack {

    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    private void enqueue(int item) {
        stack1.push(item);
    }

    private int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    private boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    private int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        if (stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public static void main(String[] args) {
        QueueWithStack queueWithStack = new QueueWithStack();
        queueWithStack.enqueue(1);
        queueWithStack.enqueue(2);
        queueWithStack.enqueue(3);
        queueWithStack.enqueue(4);
        queueWithStack.enqueue(5);

        System.out.println(queueWithStack.dequeue());

    }

}
