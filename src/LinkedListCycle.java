import java.util.HashMap;

public class LinkedListCycle {
    public static void main(String[] args) {
        LinkedListCycle cycle = new LinkedListCycle();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println(cycle.hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        while (head.next != null){
            if(head.val == Integer.MIN_VALUE) return true;
            head.val = Integer.MIN_VALUE;
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle1(ListNode head) {
        if(head == null) return false;
        HashMap<ListNode, ListNode> map = new HashMap<>();
        ListNode currNode = head;
        while (currNode.next != null){
            if(!map.containsKey(currNode.val)){
                map.put(currNode, currNode.next);
            }else{
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}
