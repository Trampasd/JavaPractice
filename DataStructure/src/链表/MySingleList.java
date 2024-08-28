package 链表;

public class MySingleList {
    static class ListNode {
        public int val;//节点的值域
        public ListNode next;//下一个节点的地址

        public ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode head;//链表的头节点

    public void createList() {
        ListNode node1 = new ListNode(12);
        ListNode node2 = new ListNode(23);
        ListNode node3 = new ListNode(34);
        ListNode node4 = new ListNode(45);
        ListNode node5 = new ListNode(56);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        this.head = node1;
    }



    //头插法
    public void addFirst(int data){
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data){
        ListNode node = new ListNode(data);
        ListNode cur = head;

        //当链表中没有节点时会出现空指针异常
        if (cur == null) {
            head = node;
            return;
        }

        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        //检查合法性
        if (index < 0 || index > size()) {
            System.out.println("index 不合法！");
            return;
        }

        //0号位置为头插法
        if (index == 0) {
            addFirst(data);
            return;
        }

        //size()号位置为尾插法
        if (index == size()) {
            addLast(data);
            return;
        }

        ListNode cur = head;
        ListNode node = new ListNode(data);

        //寻找插入位置的前一个节点
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }

        node.next = cur.next;
        cur.next = node;


    }

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
    public void remove(int key){
        if (head == null) {
            System.out.println("链表为空，无法删除");
            return;
        }

        //单独删除头节点
        if (head.val == key) {
            head = head.next;
            return;
        }

        //寻找删除位置的前一个节点
        ListNode cur = searchPrev(key);
        if (cur == null) {
            System.out.println("没有你要删除的数据！");
            return;
        }
        ListNode del = cur.next;
        cur.next = del.next;
    }

    private ListNode searchPrev(int key) {
        ListNode cur = head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的节点
    //遍历一遍就要删除完
    public void removeAllKey(int key){
        ListNode prev = head;
        ListNode cur = prev.next;

        while (cur != null) {
            if (cur.val == key) {
                cur = cur.next;
                prev.next = cur;
            }else {
                prev = cur;
                cur = cur.next;
            }
        }

        //若第一个元素为要删的，则删除头节点
        if (head.val == key) {
            head = head.next;
        }
    }

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

    public void clear() {
        this.head = null;
    }

    public void display() {
        ListNode cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    public void display(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
    }

    //寻找倒数第k个元素
    public int recK(int k) {
        if (k <= 0 || k > size()) {
            System.out.println("位置不合法！");
            return -1;
        }

        //fast先走k-1步
        ListNode fast = head;
        while (k - 1 != 0) {
            fast = fast.next;
            k--;
        }

        ListNode slow = head;

        //同频走直到fast到达尾部
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public ListNode partition(ListNode pHead, int x) {
        // write code here
        ListNode as = null;
        ListNode ae = null;
        ListNode bs = null;
        ListNode be = null;

        while (pHead != null) {
            if (pHead.val < x) {
                if(as == null) {
                    as = ae = pHead;
                }else {
                    ae.next = pHead;
                    ae = ae.next;
                    ae.next = null;
                }

            } else {
                if(bs == null) {
                    bs = be = pHead;
                }else {
                    be.next = pHead;
                    be = be.next;
                    be.next = null;
                }
            }
            pHead = pHead.next;
        }

        if (ae == null) {
            return bs;
        }
        ae.next = bs;

        return as;

    }
}
