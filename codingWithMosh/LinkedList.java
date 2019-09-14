package codingWithMosh;

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
        } else{
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int item) {
        Node node = new Node(item);

        // One Way using tail pointer
        /*if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }*/

        // Second way without tail pointer
        Node temp = head;
        Node prev = null;
        while (temp != null){
            prev = temp;
            temp = temp.next;
        }
        prev.next = node;

        size++;
    }

    public int indexOf(int item) {
        int index = 0;
        Node current = head;
        while(current != null) {
            if (current.data == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    public void remocveFirst(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }

        if (head == tail) {
            head = tail = null;
        } else {
            Node second = head.next;
            head.next = null;
            head = second;
        }
        size--;
    }

    private Node findPrevious(Node node) {

        Node current = head;
        while (current != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return node;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (head == tail) {
            head = tail = null;
        } else {
            //One way
        /*Node previous = findPrevious(tail);
        tail = previous;
        tail.next = null;*/

            //Second way
            Node current = head;
            Node prev = null;
            while(current != null){
                prev = current;
                current = current.next;
            }
            tail = prev;
            tail.next = null;
        }
        size--;
    }

    public int size() {
        Node current = head;
        int count=0;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    public int[] toArray() {
        int[] arr = new int[2*size];
        int index = 0;
        Node current = head;
        while (current != null) {
            arr[index++] = current.data;
            current = current.next;
        }
        return arr;
    }

    public void reverseLinkedList() {
        Node current = head;
        Node prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public int findKthNodeFromTheEnd(int k) {
        if (isEmpty()) {
            throw new IllegalStateException();
        }

        Node current = head;
        Node ref = head;

        int count = 0;
        while(count < k) {
            if (ref == null) {
                throw new IllegalArgumentException();
            }
            ref = ref.next;
            count++;
        }

        while(ref != null) {
            ref = ref.next;
            current = current.next;
        }
        return current.data;
    }

    public void printMiddle() {
        Node current = head;
        Node prev = head;
        while(prev != null && prev.next != null){
            current = current.next;
            prev = prev.next.next;
        }
        System.out.println("middle item : "+current.data);
    }

    public boolean hasLoop() {
        Node current = head;
        Node prev = head;
        while (prev != null && prev.next != null) {
            current = current.next;
            prev = prev.next.next;
            if (current == prev) {
                return true;
            }
        }
        return false;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

}
