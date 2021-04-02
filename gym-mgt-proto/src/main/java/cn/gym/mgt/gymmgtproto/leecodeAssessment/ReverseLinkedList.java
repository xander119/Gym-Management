package cn.gym.mgt.gymmgtproto.leecodeAssessment;

public class ReverseLinkedList {


    public static void main(String[] args) {

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();

        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = null;

        ListNode current1 = listNode1;
        while (current1 != null) {
            System.out.println("-" + current1.val);
            current1 = current1.next;
        }
        //Reversing the list
        ListNode listNode = reverseLinkedList.reverseList(listNode1);
        ListNode current = listNode;
        while (current != null) {
            System.out.println("-" + current.val);
            current = current.next;
        }

    }


    public ListNode reverseList(ListNode head) {


        if (head == null || head.next == null) return head;
        ListNode current = head;
        ListNode previous = null;
        while (current != null) {
            ListNode newNode = current.next;
            current.next = previous;
            previous = current;
            current = newNode;
        }

        return previous;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
