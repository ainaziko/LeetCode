public class SizeOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(6);
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        Node node3 = new Node(3);
        Node node4 = new Node(1);
        Node node5 = new Node(2);
        Node node6 = new Node(0);


        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(countNodes(head));
    }

    public static int countNodes(Node head){
        int counter = 1;
        Node currNode = head;
        while (currNode.next != null){
            counter++;
            currNode = currNode.next;
        }
        return counter;
    }
}
