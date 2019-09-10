package codingWithMosh;

import java.util.Arrays;

public class CustomStackWithArray {

    private int[] arr;
    private int count = 0;
    private int min;

    public CustomStackWithArray(int size){
        arr = new int[size];
    }

    public void push(int item) {
        if (count == arr.length)
            throw new StackOverflowError();

        arr[count++] = item;
    }

    public int pop(){
        if (count == 0)
            throw new IllegalStateException();


        int item = arr[--count];
        arr[count] = 0;
        return item;
    }

    public int peek() {
        return arr[count-1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        int[] temp = Arrays.copyOfRange(arr, 0, count);
        return Arrays.toString(temp);
    }

    public static void main(String[] args) {

        CustomStackWithArray customStackWithArray = new CustomStackWithArray(5);
        customStackWithArray.push(6);
        customStackWithArray.push(3);
        customStackWithArray.push(5);
        customStackWithArray.push(9);
        customStackWithArray.push(1);
        System.out.println(customStackWithArray);

        /*System.out.println("pop item : "+ customStackWithArray.pop());
        System.out.println(customStackWithArray);

        System.out.println("peek item : "+ customStackWithArray.peek());*/
        //System.out.println(customStackWithArray);
    }
}
