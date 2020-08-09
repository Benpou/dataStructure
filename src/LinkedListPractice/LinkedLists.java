package LinkedListPractice;

public class LinkedLists<AnyType> {

    private Node<AnyType> head;

    //constructor for empty list
    public LinkedLists() {
        head = null;
    }

    private static class Node<AnyType> {
        private AnyType data;
        private Node<AnyType> next;

        public Node(AnyType data, Node<AnyType> next) {
            this.data = data;
            this.next = next;
        }
    }
    public AnyType addFirst(AnyType data) {
        head = new Node<AnyType>(data, head);
        return head.data;
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.addFirst("ben");
        list.addFirst("pouya");

        System.out.println("this is list " + list.head.data);
    }
}
