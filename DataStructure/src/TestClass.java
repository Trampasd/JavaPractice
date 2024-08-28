import java.util.Arrays;

public class TestClass {

    public static void main(String[] args) {
        ListNode a = null;
//        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(2);
//        ListNode d = new ListNode(1);
//        ListNode e = new ListNode(1);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = e;
        System.out.println(chkPalindrome(a));
    }

    public static boolean chkPalindrome(ListNode A) {
        // write code here
        if(A == null) {
            return false;
        }

        if (A.next == null) {
            return true;
        }

        if (A.next.next == null) {
            if (A.val == A.next.val) {
                return true;
            }
            return false;
        }

        ListNode fast = A;
        ListNode slow = A;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode cur = slow.next;
        while(cur != null) {
            ListNode curNext = cur.next;
            cur.next = slow;
            slow = cur;
//            slow.next = null;
            cur = curNext;
        }

        while (A != slow && A.next != slow) {
            if(A.val != slow.val) {
                return false;
            }

            A = A.next;
            slow = slow.next;
        }

        return true;
    }
}