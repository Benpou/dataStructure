public class LinkedListImpl {

    Node head = null;
    Node tail = null;
    public static void main(String[] args) {
        LinkedListImpl myLists = new LinkedListImpl();
        myLists.addList(12);
        myLists.addList(22);
        myLists.addList(44);
        myLists.addList(55);
        myLists.addList(65);
//        myLists.printLog();
//        myLists.addToLast(11);
//        myLists.printLog();
//        myLists.addList(5500);
//        myLists.printLog();
//        myLists.addNodeAtCertainIndex(88, 4);
//        myLists.printLog();
//        myLists.removeLastNde();
//        myLists.printLog();
//        myLists.removeFirstNode();
//        myLists.printLog();
//        myLists.removeFromCertainIndex(2);
//        myLists.printLog();
        System.out.print(myLists.searchValue(22));
        myLists.printLog();
        System.out.print(myLists.searchAndReturnIndex(44));

    }

    /*
    Search and return index
     */
    public int searchAndReturnIndex(int value) {
        Node temp = head;
        int count = 0;
        while(temp != null) {
            if(temp.data == value) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    //Search to see if the given value exists in the list
    // return true or false
    public String searchValue(int value) {
        Node temp = head;
        while (temp != null) {
            if(temp.data == value) {
                return "true";
            } else {
                temp = temp.next;
            }
        }
        return "false";
    }

    // Remove the car from the index
    public void removeFromCertainIndex(int index) {
        Node temp = head;
        int count = 0;

        while (temp.next != null && ++count != index) {
            temp = temp.next;
        }
        Node nextNode = temp.next.next;
        temp.next = nextNode;
    }


    // Remove first Node
    public void removeFirstNode() {
        head = head.next;
    }


    //Remove last Node
    public void removeLastNde() {
        Node temp = head;
        while( temp.next != null && temp.next.next != null ) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    /*
     * Adds node at the certain index.
     */
    public void addNodeAtCertainIndex(int data , int index) {
        int count = 0;
        Node temp = head;

        while ( temp != null && ++count != index) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Add to the start Node
    public void addList(int data) {
        if(head == null) {
            Node temp = new Node(data);
            head = temp;
            tail = temp;
        } else {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        }
    }

    //Add to Last
    public void addToLast(int data) {
        if(head == null) {
            Node temp = new Node(data);
            head = temp;
            tail = temp;
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    public void printLog() {
        System.out.println();
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }
}
