package codingWithMosh;

import java.util.Arrays;

public class PriorityQueueCustom {

    private int[] arr;
    int count = 0;

    public PriorityQueueCustom(int size) {
        this.arr = new int[size];
    }

    private void add(int item) {
        if (isFull()) {
            //throw new IllegalStateException();
            /*int[] temp = new int[2 * arr.length];
            for (int i : arr)
                temp[i] = arr[i];*/
            int[] temp =  Arrays.copyOf(arr,arr.length*2);
            arr = temp;
        }

        int i;
        //Shifting elements
        for (i = count - 1; i >= 0; i--) {
            if (item < arr[i]) {
                arr[i+1] = arr[i];
            } else
                break;
        }
        arr[i+1] = item;
        count++;
    }

    private int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return arr[--count];
    }

    private boolean isEmpty() {
        return count == 0;
    }

    private boolean isFull() {
        return count == arr.length;
    }

    @Override
    public String toString() {

        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        PriorityQueueCustom priorityQueueCustom = new PriorityQueueCustom(5);
        priorityQueueCustom.add(5);
        priorityQueueCustom.add(3);
        priorityQueueCustom.add(6);
        priorityQueueCustom.add(1);
        priorityQueueCustom.add(4);
        priorityQueueCustom.add(2);

        System.out.println(priorityQueueCustom);
    }


}
