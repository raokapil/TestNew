package codingWithMosh;

public class MinStack {

    private java.util.Stack<Integer> stack = new java.util.Stack<Integer>();
    private java.util.Stack<Integer> minStack = new java.util.Stack<Integer>();

    private void push(int item) {
        stack.push(item);
        if (minStack.empty() || item < minStack.peek()) {
            minStack.push(item);
        }
    }

    private void pop() {
         if(stack.pop().equals(minStack.peek()))
             minStack.pop();
    }

    private int min(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(10);
        minStack.push(1);

        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }


}
