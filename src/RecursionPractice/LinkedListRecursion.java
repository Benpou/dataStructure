//package RecursionPractice;
//
//import java.io.Console;
//import java.util.LinkedList;
//
//public class LinkedListRecursion {
//
//
//
//  public static void main(String[] args) {
//    LinkedList<Integer> mylist = new LinkedList<>();
//
//    mylist.add(1);
//    mylist.add(2);
//    mylist.add(3);
//    mylist.add(4);
//
//    System.out.println(mylist);
//
//    reverseList(mylist);
//
//
//  }
//
//
//  public static LinkedList reverseList(LinkedList head) {
//
//    if (head == null || head.next == null ) {
//      return head;
//    }
//    node = reverseList(head.next);
//    head.next.next = head;
//    head.next = null;
//
//    return node;
//  }
//
//}
//
