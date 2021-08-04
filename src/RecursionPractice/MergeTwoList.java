package RecursionPractice;

public class MergeTwoList {

//Recursive
//    public ListNode mergeTwoList(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        if (l1.data < l2.data ) {
//            l1.next = mergeTwoList(l1.next, l2);
//            return l1;
//        } else {
//            l2.next = mergeTwoList(l1, l2.next);
//        }
//    }
}


//Iterative
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//        ListNode prehead = new ListNode(-1);
//
//        ListNode prev = prehead;
//
//        while(l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                prev.next = l1;
//                l1 = l1.next;
//            } else {
//                prev.next = l2;
//                l2 = l2.next;
//            }
//            prev = prev.next;
//        }
//
//        prev.next = l1 == null ? l2 : l1;
//
//        return prehead.next;
//
//    }
//}