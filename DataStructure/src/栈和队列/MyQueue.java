package 栈和队列;

public class MyQueue {
    //用双链表实现
    static class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode front;//队头
    private ListNode rear;//队尾

    private int usedSize;

    public void offer(int x) {
        ListNode node = new ListNode(x);
        if (front == null) {
            front = rear = node;
        }else {
            node.next = front;
            front.prev = node;
            front = node;
        }
        usedSize++;
    }

    public int poll() {
        if (front == null) {
            return -1;
        }

        int ret = rear.val;

        if (front == rear) {

            front = null;
            rear = null;
            usedSize--;
            return ret;
        }

        rear = rear.prev;
        rear.next = null;
        usedSize--;
        return ret;
    }

    public int peek() {
        if (front == null) {
            return -1;
        }
        return front.val;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public boolean isEmpty() {
        return usedSize == 0;
    }
}
