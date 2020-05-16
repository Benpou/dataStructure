public class LinkedListImpl {


    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;

    public static void main(String[] args) {
        LinkedListImpl listImpl = new LinkedListImpl();

        listImpl.addNode(10);
        listImpl.addNode(30);
        listImpl.addNode(40);
        listImpl.printLinkedList();
        listImpl.addNodeAtStart(1000);
        listImpl.printLinkedList();
    }

    // Add at the END of the list
    public void addNode(int val) {
        if (head == null) {
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        } else {
            tail.next = new Node(val);
            tail = tail.next;
        }
    }

    // Add at the start of the list
    public void addNodeAtStart(int val) {
        if(head == null) {
            Node temp = new Node(val);
            head = temp;
            tail = temp;
        } else {
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
        }
    }

    public void printLinkedList() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.val);
            temp = temp.next;
        }
    }
}
