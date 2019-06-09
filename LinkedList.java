package Program;

public class LinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void deletion(int key) {

        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;

    }


    public LinkedList.Node insertionAtMid(LinkedList.Node head, String data) {
        LinkedList.Node n5 = new LinkedList.Node(50);
        while (head != null) {
            if (data.equals(head.data)) {
                LinkedList.Node temp = head;
                head = n5;
                head.next = temp;
            }
            head = head.next;
        }
        return head;

    }

    public LinkedList.Node insertionAtEnd(LinkedList.Node head) {
        LinkedList.Node n4 = new LinkedList.Node(40);
        while (head !=  null) {
            System.out.println("Data: "+head.data);
            head = head.next;
        }
        head = n4;
        return head;
    }

    public LinkedList.Node insertionAtBeginning(LinkedList.Node head) {
        LinkedList.Node n3 = new LinkedList.Node(30);
        LinkedList.Node temp = head;
        head = n3;
        head.next = temp;
        return head;

    }

    public void traverse(LinkedList.Node head) {

        while (head !=  null) {
            System.out.println("Data: "+head.data);
            head = head.next;
        }

    }


}
