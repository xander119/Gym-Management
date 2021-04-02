package cn.gym.mgt.gymmgtproto.leecodeAssessment;

class SumUp {

    public static void main(String[] args) {
        SumUp sumUp = new SumUp();
        ListNode l1, l2;
        l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode current1 = sumUp.addTwoNumbers(l1, l2);
        while (current1 != null) {
            System.out.println("-" + current1.val);
            current1 = current1.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder numOne = new StringBuilder();
        StringBuilder numTwo = new StringBuilder();
        ListNode current = l1;
        while (current != null) {
            numOne = numOne.append(current.val);
            current = current.next;
        }
        current = l2;
        while (current != null) {
            numTwo = numTwo.append(current.val);
            current = current.next;
        }
        Integer one = Integer.valueOf(numOne.toString());
        Integer two = Integer.valueOf(numTwo.toString());
        int result = one + two;
        String resultStr = String.valueOf(result);
        char[] chars = resultStr.toCharArray();

        ListNode currentR = null;
        ListNode temp = null;
        for (int i = chars.length; i > 0; i--) {
            Character aChar = chars[i];
            Character aChar2 = chars[i - 1];
            if (aChar2 != null) {
                aChar2 = chars[i - 1];
            }

            Integer val = Integer.valueOf(String.valueOf(aChar));
            Integer val2 = Integer.valueOf(String.valueOf(aChar2));
            currentR = new ListNode(val);
            temp = new ListNode(val2);
            System.out.println("- currentR " + currentR);

        }

        return currentR;
    }

    public static class ListNode {
        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}