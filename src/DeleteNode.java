import java.util.Iterator;
import java.util.LinkedList;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        int tmp = node.val;
        node.val = node.next.val;
        node.next.val = tmp;
        node.next = node.next.next;
    }
}
