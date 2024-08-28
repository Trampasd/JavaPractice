package 链表;

public class MyLinkedList {
    static class ListNode {
        private int val;
        private ListNode prev;
        private ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode head;
    public ListNode last;

        //头插法
    public void addFirst(int data){
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
            last = listNode;
            return;
        }
        listNode.next = head;
        head.prev = listNode;
        head = listNode;
    }
    //尾插法
    public void addLast(int data){
        ListNode listNode = new ListNode(data);
        if (head == null) {
            head = listNode;
            last = listNode;
            return;
        }
        listNode.prev = last;
        last.next = listNode;
        last = listNode;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){}
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){}
    //删除所有值为key的节点
    public void removeAllKey(int key){}
    //得到单链表的长度
    public int size(){
        int count = 0;
        ListNode cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display(){
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void clear(){}

}
