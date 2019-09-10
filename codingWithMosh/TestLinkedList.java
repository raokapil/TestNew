package codingWithMosh;

import java.util.Arrays;
import java.util.Collections;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        //linkedList.addFirst(7);
        linkedList.addLast(5);
        //linkedList.addFirst(4);linkedList.addFirst(5);linkedList.addFirst(6);
        linkedList.print();
        System.out.println("Test IndexOf");
        System.out.println(linkedList.indexOf(2));
        System.out.println("Test Contains");
        System.out.println("isContain : " +linkedList.contains(5));

        /*linkedList.remocveFirst();
        System.out.println("After removeFirst");
        linkedList.print();

        System.out.println("After removeLast");
        linkedList.removeLast();
        linkedList.print();*/

        System.out.println("Size of : "+linkedList.size());
        System.out.println("kth node data from the end : "+linkedList.findKthNodeFromTheEnd(3));
        linkedList.printMiddle();

        linkedList.reverseLinkedList();
        System.out.println("LinkedList to Array : "+ Arrays.toString(linkedList.toArray()));

    }
}
