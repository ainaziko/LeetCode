public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int s1 = countNodes(headA);
        int s2 = countNodes(headB);
        ListNode curr1 = headA;
        ListNode curr2 = headB;

        if(s1 < s2){
            curr1 = headB;
            curr2 = headA;
        }

        for(int i = 0; i < Math.abs(s1 - s2); i++){
            curr1 = curr1.next;
        }

        while (curr1 != null && curr2 != null){
            if(curr1 == curr2){
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }

    public static int countNodes(ListNode head){
        int counter = 1;
        ListNode currNode = head;
        while (currNode.next != null){
            counter++;
            currNode = currNode.next;
        }
        return counter;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinkedLists i = new IntersectionOfTwoLinkedLists();
        ListNode headA = new ListNode(4);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(8);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        headA.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode headB = new ListNode(5);
        ListNode node1b = new ListNode(6);
        ListNode node2b = new ListNode(1);
        ListNode node3b = new ListNode(8);
        ListNode node4b = new ListNode(4);
        ListNode node5b = new ListNode(5);
        headB.next = node1b;
        node1b.next = node2b;
        node2b.next = node3b;
        node3b.next = node4b;
        node4b.next = node5b;
        System.out.println(i.getIntersectionNode(headA, headB));
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        int s1 = countNodes(headA);
        int s2 = countNodes(headB);

        while (true){
            ListNode a = headA;
            ListNode b = headB;
            ListNode prev = a;
            for(int i = 1; i < s1 && a != null; i++){
                a = a.next;
            }
            for(int j = 1; j < s2 && b != null; j++){
                b = b.next;
            }
            if(a.val != b.val){
                return prev;
            }else {
                prev.val = a.val;
                s1--;
                s2--;
            }
        }
    }
}
