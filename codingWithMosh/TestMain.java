package codingWithMosh;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {

        Array array = new Array(3);
        array.insert(5);
        array.insert(6);
        array.insert(70);
        array.insert(8);
        array.insert(9);

        array.insertAt(2, 99);

        System.out.println("//Items in Array : ");
        array.print();

        System.out.println("//Item remove at index {0} in Array : ");
        array.removeAt(0);

        System.out.println("//Item at index {6} in Array : ");
        System.out.println(array.indexOf(6));

        System.out.println("//Max item in Array : ");
        System.out.println(array.max());

        System.out.println("//Intersect Array : ");
        int[] tempArr = {6,8};
        System.out.println(Arrays.toString(array.intersect(tempArr)));
        System.out.println("//Reverse Array : ");
        array.reverse();
        array.print();
    }

}
