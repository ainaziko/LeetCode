public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode currNode = head;
        int index = countNodes(head) - n;
        int count = 1;
        if(index == 0){
            ListNode newHead = head.next;
            head.next = null;
            return newHead;
        }
        while (currNode.next != null){
            if(count == index){
                currNode.next = currNode.next.next;
            }else {
                currNode = currNode.next;
            }
            count++;
        }
        return head;
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
        ListNode head = new ListNode(1);
        ListNode node = new ListNode(2);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        head.next = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;

        RemoveNthNode rm = new RemoveNthNode();
        rm.removeNthFromEnd(head, 5);

    }
}
