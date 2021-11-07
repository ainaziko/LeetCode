import java.util.List;

public class Solution {
    public ListNode middleNode(ListNode head) {
        int mid = findMidNum(head);
        int count = 1;
        ListNode currNode = head;
        while (count < mid){
            currNode = currNode.next;
            count++;
        }
        System.out.println(currNode.val);
        return currNode;
    }

    public static int findMidNum(ListNode head){
        int size = countNodes(head);
        int mid;
        mid = size/2 + 1;
        return mid;
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
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);


        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;


        Solution s = new Solution();
        System.out.println(s.middleNode(head));

    }
}
