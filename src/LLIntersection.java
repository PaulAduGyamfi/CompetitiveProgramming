import java.util.*;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
     }
  }
public class LLIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null){
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        Set<ListNode> set = new HashSet<>();

        while(headA != null && headB != null){
            set.add(headA);
            headA = headA.next;
            if(set.contains(headB)){
                return headB;
            }

            set.add(headB);
            if(set.contains(headA)){
                return headA;
            }

            headB = headB.next;
        }

        while(headA != null){
            if(set.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }

        while(headB != null){
            if(set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
