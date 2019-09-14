package leetcode;

import java.util.LinkedList;

//Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class AddTwoNumberUsingLinkedList {

    ListNode head;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode p = l1, q = l2, cur = dummy;
        int carry = 0;

        while(p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if(p != null) p = p.next;
            if(q != null) q = q.next;
        }
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public void insert(int item) {
        ListNode node = new ListNode(item);

        ListNode temp = head;
        head = node;
        head.next = temp;
    }

    private void print() {
        ListNode temp = new ListNode(head.val);
        while (temp != null) {
            System.out.print(head.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        AddTwoNumberUsingLinkedList addTwoNumberUsingLinkedList = new AddTwoNumberUsingLinkedList();
        ListNode l1 = new ListNode(2);
        addTwoNumberUsingLinkedList.insert(4);
        addTwoNumberUsingLinkedList.insert(3);

        ListNode l2 = new ListNode(5);
        addTwoNumberUsingLinkedList.insert(6);
        addTwoNumberUsingLinkedList.insert(4);


        addTwoNumberUsingLinkedList.addTwoNumbers(l1, l2);
        addTwoNumberUsingLinkedList.print();
    }
}