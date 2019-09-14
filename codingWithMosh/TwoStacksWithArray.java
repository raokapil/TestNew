package codingWithMosh;

import java.util.Arrays;

public class TwoStacksWithArray {

    int[] arr;
    int top;
    int bottom;
    public TwoStacksWithArray(int size) {
        this.arr = new int[size];
        top = 0;
        bottom = size-1;
    }

    private void push1(int item) {
        if (top == bottom) {
            throw new StackOverflowError();
        }


        arr[top++] = item;
    }

    private void push2(int item) {
        arr[bottom--] = item;
    }

    private int pop1() {
        int item = arr[--top];
        arr[top] = 0;
        return item;
    }

    private int pop2() {
        int item = arr[++bottom];
        arr[bottom] = 0;
        return item;
    }

    private int peek1() {
        return arr[top-1];
    }

    private int peek2() {
        return arr[bottom+1];
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        TwoStacksWithArray twoStacksWithArray = new TwoStacksWithArray(5);
        twoStacksWithArray.push1(5);
        twoStacksWithArray.push2(15);
        twoStacksWithArray.push1(6);
        twoStacksWithArray.push2(14);
        //twoStacks.push1(7);
        twoStacksWithArray.push2(13);
        /*twoStacks.pop1();
        twoStacks.pop2();*/
        System.out.println(twoStacksWithArray);
    }

}
